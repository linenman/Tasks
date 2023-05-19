import java.util.Scanner;

public class evenOrOdd {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number");

        int num = input.nextInt();

        if (num %2 == 0){
            System.out.println("even number");
        }
        if (num %2 != 0){
            System.out.println("odd number");
        }

        input.close();


    }
}


/*
 Numbers -- odd & even
Write a method that can identify  a given number is even or odd.
EX:
       identify(5) --> "Odd"
       identify(6) --> "Even"
 */
