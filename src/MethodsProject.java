import java.util.Scanner;

public class MethodsProject {

    public static void main(String[] args) {

        {
            System.out.println("Hello World");
        }
        Scanner keyboard = new Scanner(System.in);
        {
            System.out.println("What is your name?");
            String name;
            name = keyboard.next();
            System.out.println("Hello " + name);
        }
        {
            System.out.println("Enter a number.");
            int number1 = keyboard.nextInt();
            System.out.println("Enter a different number.");
            int number2 = keyboard.nextInt();
            System.out.println("The product of the two given numbers is " + (number1 * number2));
        }
        {
            System.out.println("Give me another number.");
            int number3 = keyboard.nextInt();
            System.out.println("Enter a number smaller then the last.");
            int number4 = keyboard.nextInt();
            System.out.println("The qoutient of the two entered numbers is " + (number3/number4));
        }
        {
            System.out.println("Enter a two digit number.");
            int number5 = keyboard.nextInt();
            System.out.println("Enter another two digit number.");
            int number6 = keyboard.nextInt();
            if(number5>number6){
                System.out.println(number5 + " is the greatest of the two numbers you entered.");
            }
            if(number6>number5){
                System.out.println(number6 + " is the greatest of the two numbers you entered.");
            }
        }
        }




    }









