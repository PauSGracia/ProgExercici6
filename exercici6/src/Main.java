import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declare scanner
        Scanner input = new Scanner(System.in);
        //Declare variables
        int liters = -1;
        boolean gatesOpened = false;
        //Ask the user how many liters has rained
        System.out.println("How many liters has rained?");

        do {
            //Check if the input is a number or not
            if (input.hasNextInt())
            {
                liters= input.nextInt();
                //If it's a number, check if it's between 1 and 10
                if (liters < 0) {
                    //If it's not, ask again
                    System.out.println("That's not a valid number");
                } else {
                    //Check if it has rained enough
                    if (liters > 90)
                    {
                        //Open the gates, going outside the loop
                        gatesOpened = true;
                        System.out.println("The gates are open!");
                    } else {
                        //Remain inside the loop
                        System.out.println("The gates remain closed!");
                    }
                }
            } else{
                //If it's not a number, ask again
                System.out.println("That's not a number");
            }
            //Clear input
            input.nextLine();
        } while(liters < 0.0f || !gatesOpened);
    }
}