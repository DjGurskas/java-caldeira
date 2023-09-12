package src;
import java.util.Calendar;
import java.util.Scanner;

//Exercicio 09
public class Birth {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        int yearBirth = scan.nextInt();

        int yearCurrent = Calendar.getInstance().get(Calendar.YEAR);

        int age = yearCurrent - yearBirth;

        System.out.println("Sua idade é: " + age + " anos");

        scan.close();
    }
}
