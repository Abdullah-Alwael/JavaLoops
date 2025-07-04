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
//        Test Data: Input a string: The quick brown fox
//        Expected Output: Reverse string: xof nworb kciuq ehT

        System.out.println("enter an entire sentence to reverse: ");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        for (int i = sentence.length()-1; i >= 0; i--) {
            System.out.print(sentence.toCharArray()[i]);
        }
        System.out.println();

//        or we can use StringBuilder: but this lesson is about loops so ...
//        StringBuilder sentence = new StringBuilder(input.nextLine());
//        System.out.println(sentence.reverse());

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

//        5.Write a program that reads a set of integers, and then prints the sum of
//        the even and odd integers.

        System.out.println("sum of odd numbers and sum of even numbers");

        int evenNumbersSum = 0;
        int oddNumbersSum = 0;

        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        System.out.println("for the following set:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]+" ");
            if (numbers[i]%2 == 0){
                evenNumbersSum+=numbers[i];
            } else {
                oddNumbersSum+=numbers[i];
            }
        }
        System.out.println();
        System.out.println("sum of even numbers = "+evenNumbersSum);
        System.out.println("sum of odd numbers = "+oddNumbersSum);

//        6.Write a program that prompts the user to input a positive integer. It
//        should then output a message indicating whether the number is a prime
//        number.

        System.out.println("Prime number check ");
        do{
            System.out.println("enter a number greater than 1: ");
            number = input.nextInt();
            if (number <= 1){
                System.out.println("cant be less than 2");
            }
        }while(number <= 1);
        boolean isPrime = true;

        for (int i = number; i > 1 ; i--){
            if (number%i == 1){
                continue;
            }
            if(number%i == 0 && number!=i){
                isPrime=false;
                break;
            }
        }

        if (isPrime){
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime");
        }

//        7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
//        another for loop to print the days (Days 1 -7) for each week.

        for (int i = 1; i < 5; i++) {
            System.out.println("Week "+i);
            for (int j = 1; j < 8; j++) {
                System.out.println("Day "+j);
            }
        }

//        8.Write a program that checks if the word is a palindrome or not. hint: A
//        string is said to be a palindrome if it is the same if we start reading it from
//        left to right or right to left. just like WOW

        System.out.println("check palindrome words: ");
        System.out.println("enter the word to check: ");

        input.nextLine();
        String palindromeWord = input.nextLine();

        char[] palindromeArray = palindromeWord.toCharArray();
        boolean isPalindrome = true;
        int j = 0;

        for (int i = palindromeArray.length - 1; i > 0; i--) {
            if (palindromeArray[j] != palindromeArray[i]){
                isPalindrome = false;
                break;
            }
            j++;
        }
        if (isPalindrome) {
            System.out.println(palindromeWord+" is palindrome");
        } else {
            System.out.println(palindromeWord+" is not palindrome");
        }
    }
}
