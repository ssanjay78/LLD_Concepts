// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");
        System.out.print("Hello World !");
        System.out.println("Sanjay Soni this side, entering to Java world.");
        int a = 20;
//        a = 10;
        System.out.println(a);

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);
        }

        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        switch (month) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            default -> System.out.println("Invalid month");
        }

        switch (month){
            case 1,2,3,4,5,6,7 -> System.out.println("Valid Month");
            default -> System.out.println("Invalid");
        }
    }
}