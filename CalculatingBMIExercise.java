/*Mohammed Qutu
21.0.2; Java HotSpot(TM) 64-Bit Server VM 21.0.2+13-LTS-58
2/9/24
interactive program that will allow a user to enter their height and weight,
calculate and return their BMI (Body Mass Index) by using a functional method, and display
their BMI using a message box.
*/


import java.util.Scanner;
public class CalculatingBMIExercise 
{

    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Welcome to BMI (Body Mass Index) Calculator.");
        System.out.println("Please start by typing your height and weight in" +
                " inches and pounds");
        System.out.print("Height: ");
        double height = keyboard.nextDouble();
        System.out.println("");
        System.out.print("Weight: ");
        double weight = keyboard.nextDouble();
        double bmi = calculateBMI(height,weight);
        System.out.println("");
        System.out.println(" Calculation Complete!... \n");
        System.out.println("Height Entered: " + height + " Weight Entered: " +
                weight);
        System.out.printf("Claculated BMI is %3.2f." ,bmi);
        System.out.println("");
        
        
    }
    /*
    this method is going to take in the height and weight argument when the method is called. 
    @param height is the height taken from the input.
    @param weight is the weight taken from the input.
    @return will return the calculated BMI
    */
    public static double calculateBMI(double height, double weight)
    {
        return (weight*703)/(height*height);
    }
}
