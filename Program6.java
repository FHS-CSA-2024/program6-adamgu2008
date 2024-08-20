//import stuff here!
import java.util.Scanner;
//Your code here
public class Program6{
    public static void main(String[] args){
        //Scanners
        Scanner myObj = new Scanner(System.in);
        System.out.print("enter radius: ");
        
        //variables
        double radius = myObj.nextDouble();
        final double PI = 3.14159;
        double diameter = radius*2;
        double area = PI*radius*radius;
        double circumference = 2*PI*radius;
        
        //Rounding
        double aRound = ((double)((int) ((area*1000)+0.5))/1000);
        double cRound = ((double)((int) ((circumference*1000)+0.5))/1000);
        
        //prints
        System.out.println("The radius of the circle = "+radius);
        System.out.println("The diameter of the circle = "+diameter);
        System.out.println("The area of the circle = "+aRound);
        System.out.println("The circumference of the circle = "+cRound);
        
    }
}
//Paste console output below:
/*
enter radius: 3.712
The radius of the circle = 3.712
The diameter of the circle = 7.424
The area of the circle = 43.288
The circumference of the circle = 23.323

*/
