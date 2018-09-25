import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {


        Scanner quiz = new Scanner(System.in);
        int guessNumber = 120;
        System.out.println("Podaj liczbę:");
        int userChoice = quiz.nextInt();


        while (userChoice < guessNumber) {
            System.out.println("Liczba jest za mała.");
            break;
        }

            System.out.println("Podaj liczbę:");
            userChoice = quiz.nextInt();
            quiz.nextLine();



        while (userChoice > guessNumber) {
            System.out.println("Liczba jest za duża.");
            break;
        }

            System.out.println("Podaj liczbę:");
            userChoice = quiz.nextInt();
            quiz.nextLine();


        while (userChoice % 3 != 0) {
            System.out.println("Liczba nie jest podzielna przez 3.");
            break;
        }

            System.out.println("Podaj liczbę:");
            userChoice = quiz.nextInt();
            quiz.nextLine();


        while (userChoice == guessNumber) {
            System.out.println("Twoja liczba jest poprawna!!!!Brawo!!!");
            break;
        }
            userChoice = quiz.nextInt();
            quiz.nextLine();

    }
}









