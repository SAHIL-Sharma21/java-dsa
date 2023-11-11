import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        //primitive data types
//        int rollNo = 64;
//        char letter = 's';
//        float marks = 98.67f;
//        double largeDecimalNumber = 456754.4567;
//        long largeInteger = 345678;
//        boolean check = true;
//
//        System.out.println(rollNo);

        //Inputs in java Scanner is a class and we are making object input
        Scanner input = new Scanner(System.in);

        //outputing message to input number
        System.out.print("Enter your number:");

//        int rollNo = input.nextInt();
//        System.out.println(rollNo);

//        float marks = input.nextFloat();
//        System.out.println("your inputed number is:" + " " + marks);

        String letter = input.next();
        System.out.println("Your string is:" + letter);

    }
}
