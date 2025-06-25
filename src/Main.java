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

    }
}
