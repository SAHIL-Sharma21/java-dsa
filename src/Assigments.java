import java.util.Scanner;

public class Assigments {
    public static void main(String[] args) {

        //Q1:- Write a program to print whether a number is even or odd, also take input from the user.
        //making input object with Scanner class and giving it System.in input stream
        Scanner input = new Scanner(System.in);

        //Solution for Q1
//        System.out.print("Please enter the number:");
//        int givenInput = input.nextInt();
//
//        if (givenInput % 2 == 0){
//            System.out.println(givenInput + " " + "is the Even number.");
//        } else {
//            System.out.println(givenInput + " " + "is the Odd number");
//        }

        //Q2:- Take name as input and print a greeting message for that particular name.
        //Solution --->>>>>
//        System.out.print("Please Enter your Name:");
//
//        String userName = input.nextLine();
//        System.out.println("Namste" + " " + userName + " " + "Welcome to the Community!");

        //Q3:- Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
        //Solution --->>>
//        System.out.print("Enter the principal amount:");
//        float pricipalAmount = input.nextFloat();
//        System.out.print("Enter time in years:");
//        int time =  (int) (input.nextFloat());
//        System.out.print("Enter the Rate:");
//        float rate = input.nextFloat();
//
//        float simpleInterest = (pricipalAmount * time * rate)/100;
//        System.out.println(simpleInterest);

        //Q4:- Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions).
        //SOlution ---->>>
//        System.out.print("Enter numberOne:");
//        float numberOne = input.nextFloat();
//        System.out.print("Enter numberTwo:");
//        float numberTwo = input.nextFloat();
//        System.out.print("Enter operator that you want to perform:");
//        char operator = input.next().charAt(0);
//
//        if (operator == '+') {
//            System.out.println(numberOne + numberTwo);
//        } else if (operator == '-') {
//            System.out.println(numberOne - numberTwo);
//        } else if (operator == '*' ) {
//            System.out.println(numberOne * numberTwo);
//        } else if (operator == '/') {
//            System.out.println(numberOne / numberTwo);
//        } else {
//            System.out.println("Enter the valid operator.");
//        }

        //Q5: Take 2 numbers as input and print the largest number.
        //solution

//        System.out.print("Enter number1:");
//        int numberOne = input.nextInt();
//        System.out.print("Enter number2:");
//        int numberTwo = input.nextInt();
//
//        if (numberOne > numberTwo) {
//            System.out.println(numberOne + " " + "is the largest number.");
//        } else {
//            System.out.println(numberTwo +" " + "is the largest number.");
//        }


        //Q6: Input currency in rupees and output in USD.
        //solution
//        System.out.print("Enter the currency in INR:");
//        float indianRupees = input.nextFloat();
//
//        float americanDollar = indianRupees * 0.012f;
//        System.out.println("USD:" + " " + americanDollar);


        //Q7: To calculate Fibonacci Series up to n numbers.
        //solution
//        System.out.print("Enter the number:");
//        int number = input.nextInt();
//
//        int num1 = 0;
//        int num2 = 1;
//        int num3;
//
//        if (number == 0) {
//            System.out.println(num1);
//        }
//        for (int i = 2; i < number; i++){
//            num3 = num2 + num1;
//            num1 = num2;
//            num2 = num3;
//
//            System.out.println(num3);
//        }

        //Q8: To find out whether the given String is Palindrome or not.
        //solution
//
//        System.out.print("Enter the string or Name:");
//        String name = input.nextLine();
//
//        name = name.toLowerCase();
//         int p1 = 0;
//         int p2 = name.length()-1;
//
//         while (p1 < p2) {
//             if (name.charAt(p1) != name.charAt(p2)){
//                 System.out.println("Not a palindrome");
//             }
//             System.out.println("String is a palindrone.");
//             p1++;
//             p2--;
//
//
//         }

        //Q9: To find Armstrong Number between two given number.
        System.out.print("Enter number1:");
         int number1 = input.nextInt();
        System.out.print("Enter number2:");
        int number2 = input.nextInt();

        for (int i = number1; i < number2; i++){
            int check, rem, sum = 0;

            check = i;
            while (check !=0) {
                rem = check % 10;
                sum = sum + (rem * rem * rem);
                check = check / 10;
            }
            if (sum == i) {
                System.out.println("" + i +" " + "is a Armstrong number.");
            }
        }


    }
}
