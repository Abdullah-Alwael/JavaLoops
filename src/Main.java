public class Main {
    public static void main(String[] args) {

//        1.Write a program that prints the numbers from 1 to 100 such that:
//        If the number is a multiple of 3, you need to print "Fizz" instead of that
//        number.

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
    }
}
