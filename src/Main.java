import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        1.Write a program that prints the numbers from 1 to 100 such that:
//        If the number is a multiple of 3, you need to print "Fizz" instead of that
//        number.
        System.out.println("Printing numbers game:");
        for (int i = 1; i<=100; i++){
            if(i%3 == 0 && i%5 == 0){
                System.out.println("FizzBuzz");
                continue;
            }else if(i%5 == 0){
                System.out.println("Buzz");
                continue;
            }else if (i%3 == 0){
                System.out.println("Fizz");
                continue;
            }

            System.out.println(i);
        }

//        2.Write a Java program to reverse a string.
//        Test Data: Input a string: The quick brown fox Expected Output: Reverse
//        string: xof nworb kciuq ehT
        System.out.println("enter an entire sentence to reverse: ");
        Scanner input = new Scanner(System.in);
        StringBuilder sentence = new StringBuilder(input.nextLine());

        System.out.println(sentence.reverse());

//        3.Write a program to find the factorial value of any number entered
//        through the keyboard.
        System.out.println("Factorial calculator: ");
        System.out.println("enter a number");
        int number = input.nextInt();
        int factorial = 1;

        for (int i = number; i > 0; i--) {
            factorial*=i; // = i = i * i
        }

        System.out.println("factorial of "+number+" is: "+factorial);

//        4.Two numbers are entered through the keyboard. Write a program to find
//        the value of one number raised to the power of another. (Do not use Java
//        built-in method) 2^5 = 32

        System.out.println("exponent calculator: ");

        System.out.println("enter the base number: ");
        int baseNumber = input.nextInt();

        System.out.println("enter the exponent to raise the base number to: ");
        int exponentNumber = input.nextInt();
        int exponentResult = 1;

        System.out.println("the result of "+baseNumber+"^"+exponentNumber+" is: ");

        while (exponentNumber != 0){
            exponentResult*=baseNumber;
            exponentNumber--;
        }

        System.out.println(exponentResult);

    }
}
