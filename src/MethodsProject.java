import java.util.Scanner;

public class MethodsProject {

    public static void main(String[] args){

        {System.out.println("Hello World");
        }
        Scanner keyboard = new Scanner(System.in);
        {
            System.out.println("What is your name?");
            String name;
            name = keyboard.next();
            System.out.println("Hello " + name);
        }
        {System.out.println("Give me a number.");
        int number1= keyboard.nextInt();
        System.out.println("Give me a different number.");
        int number2 = keyboard.nextInt();
        System.out.println("The product of the two given numbers is "+ (number1*number2));
        }





    }








}
