import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        float num = input.nextFloat();
//        System.out.println(num); // we are giving int and it automayically converted to float
//        int num = input.nextInt();
//        System.out.println(num); //will give error as we are passing float and we are expecting interger.

        //Typecasting - converting float to num
        int number = (int) (67.58f);
//        System.out.println(number); // will print 67 only interger value will give.

        //Automatic type promotion in expression
//        int a = 257;
//        byte b = (byte) (a);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a * b)/c;
//
//        System.out.println(d);//1

//        byte e = 40;
//        e = e * 20; //expression cannot be assigned to byte as expression is executed in int we have to typecast to solve this issue.

        //character example
//        int num = 'A';
//        System.out.println(num); //65 - gives the ASCII value of 'A';

        //Type promotion rule -- int * int = int, int * float = float
        //Interger multiply float
//        System.out.println(3 * 45.56);//136.68
// example of type promotion
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i/c) - (d - s);
        System.out.println((f * b) + " " + (i/c) + " " + (d - s));
        //output is float + interger - double = double
        System.out.println(result);

    }
}
