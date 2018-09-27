import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {


        Scanner quiz = new Scanner(System.in);

        System.out.println("Podaj liczbę:");
        int userChoice = quiz.nextInt();
        int guessNumber = 25;

        while (userChoice != guessNumber) {

            if (userChoice < guessNumber) {
                System.out.println("Liczba jest za mała");
            }
            if (userChoice > guessNumber){
                System.out.println("Liczba jest za duża");
            }
            if (userChoice % 3 != 0){
                System.out.println("Liczba nie jest podzielna przez 3");
            }
                userChoice = quiz.nextInt();
        }
        while (userChoice == guessNumber) {
            System.out.println("Liczba jest ok");
            break;
        }
        System.out.println("Jesteś półbogiem!");
        quiz.close();

    }


}











