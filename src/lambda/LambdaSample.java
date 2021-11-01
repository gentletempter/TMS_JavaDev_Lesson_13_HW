package lambda;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * The class demonstrates the work of lambda expressions
 */
public class LambdaSample {
    public static void lambdaDemo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number 1: to get reverse string; 2: to get factorial");
        int choice = scanner.nextInt();
        scanner.nextLine();
        if (choice == 1) {
            Operationable<String> operation;
            System.out.println("Enter the string");
            String str = scanner.nextLine();
            operation = (arg) -> new StringBuilder(str).reverse().toString();
            System.out.println(operation.process(str));
        } else if (choice == 2) {
            Operationable<BigInteger> operation;
            System.out.println("Enter the number: ");
            int num = scanner.nextInt();
            operation = (arg) -> {
                BigInteger factorial = BigInteger.ONE;
                for (int i = 1; i <= num; ++i) {
                    factorial = factorial.multiply(BigInteger.valueOf(i));
                }
                return factorial;
            };
            System.out.println(operation.process(BigInteger.valueOf(num)));
        }
        scanner.close();
    }
}