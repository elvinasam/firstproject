import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float firstNum = scanner.nextFloat();
        float secondNum = scanner.nextFloat();
        float sum;


        System.out.println("Enter the 1st number: " + firstNum);
        System.out.println("Enter the 2nd number: " + secondNum);

        sum=firstNum+secondNum;

        System.out.println("Sum is: " + sum);
    }
}
