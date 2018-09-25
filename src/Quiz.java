import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {


        Scanner quiz = new Scanner(System.in);
        int guessNumber = 120;
        System.out.println("Podaj liczbę:");
        int userChoice = quiz.nextInt();


        while (userChoice < guessNumber) {
            System.out.println("Liczba jest za mała.");
            System.out.println("Podaj liczbę:");
            userChoice = quiz.nextInt();
            quiz.nextLine();}


            while (userChoice > guessNumber) {
                System.out.println("Liczba jest za duża.");
                System.out.println("Podaj liczbę:");
                userChoice = quiz.nextInt();
                quiz.nextLine();
            }

                while (userChoice % 3 != 0) {
                    System.out.println("Liczba nie jest podzielna przez 3.");
                    System.out.println("Podaj liczbę:");
                    userChoice = quiz.nextInt();
                    quiz.nextLine();
                }

                    while (userChoice == guessNumber) {
                        System.out.println("Twoja liczba jest poprawna!!!!Brawo!!!");
                        userChoice = quiz.nextInt();
                        quiz.nextLine();
                        quiz.close();
                    }

                }
            }








