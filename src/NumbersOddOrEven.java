public class NumbersOddOrEven {

        public static void EvenOrOdd(int number) {
            if (number % 2 == 0) {
                System.out.println(number + " is an even number");
            } else {
                System.out.println(number + " is an odd number");
            }
        }


        public static void main(String[] args) {



            EvenOrOdd(5);
            EvenOrOdd(6);




        }
    }
/*
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even"
 */

