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
        System.out.println(number); // will print 67 only interger value will give.
    }
}
