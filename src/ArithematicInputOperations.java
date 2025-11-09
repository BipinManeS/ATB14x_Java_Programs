import java.sql.SQLOutput;
import java.util.Scanner;

        /*
        Test Data:
        Input first number: 25
        Input second number: 5
        Expected Output :
        25 x 5 = 125
        */

          public static void main(String[] args) {

              Scanner scanner = new Scanner(System.in);

              System.out.println("Please Input first number");
              int num = scanner.nextInt();
              System.out.println("Please Input second number");
              int num2 = scanner.nextInt();

              int num3 = num * num2;
              System.out.println(num + "*" + num2  + "=" + num3);

          }
}
