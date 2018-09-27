import java.util.Scanner;

public class Quiz {

    public static void main(String[] args) {


        Scanner quiz = new Scanner(System.in);

        System.out.println("Podaj liczbę:");
        int userChoice = quiz.nextInt();

        while (userChoice>200||userChoice<100||userChoice%3!=0) {

            if (userChoice < 100) {
                System.out.println("Liczba jest za mała");
            }
            if (userChoice > 200){
                System.out.println("Liczba jest za duża");
            }
            if (userChoice % 3 != 0){
                System.out.println("Liczba nie jest podzielna przez 3");
            }
                userChoice = quiz.nextInt();
        }
        System.out.println("Ogadłeś prawidłową liczbę! Jesteś półbogiem!");
        quiz.close();

    }


}











