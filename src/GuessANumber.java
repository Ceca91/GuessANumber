import java.util.Random;
import java.util.Scanner;

public class GuessANumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random randomNumber = new Random();
        int computerNumber = randomNumber.nextInt(100);
        System.out.println("Hello! Write your name, please!");
        String playerName = scanner.nextLine();
        System.out.printf("Welcome %s! Let's have fun!%n", playerName);


        while (true){

            System.out.print("Guess a number (1-100): ");
            String playerInput = scanner.nextLine();
            int playerNumber;

            boolean isValid = true;

            for (int i = 0; i < playerInput.length() ; i++) {
                if (playerInput.charAt(i) < 48 || playerInput.charAt(i) > 57){
                    isValid = false;
                    break;
                }
            }

            if (isValid){
                playerNumber = Integer.parseInt(playerInput);
                if (playerNumber == computerNumber){
                    System.out.println("You guessed it!");
                    System.out.println("Wanna play again?");
                    playerInput = scanner.nextLine();
                    if (playerInput.equalsIgnoreCase("yes")) {
                        System.out.println("Let's play");
                        continue;
                    } else if ((playerInput.equalsIgnoreCase("no"))) {
                        System.out.println("Bye!");
                        break;
                    }else {
                        System.out.println("Wrong answer!");
                        break;
                    }
                } else if (playerNumber > computerNumber) {
                    System.out.println("Too High");
                }else {
                    System.out.println("Too Low");
                }
            }else {
                System.out.println("invalid input");
            }

        }


    }
}
