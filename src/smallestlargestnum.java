/*This program will compute to find the smallest
and largest number from three nunbers entered by th user.*/
import java.util.Scanner;
public class smallestlargestnum {
    public static void main(String []args){
        Scanner s = new Scanner (System.in);
        int num1;
        int num2;
        int num3;
        int smallest = 0;
        int biggest = 0;

        System.out.println("enter the 1st number");
        num1 = s.nextInt();
        System.out.println("enter the 2nd number");
        num2 = s.nextInt();
        System.out.println("enter the 3rd number");
        num3 = s.nextInt();

        //to find the smallest
        if (num1 < num2 ){
        smallest = num1;
        }
        else if (num1 > num2){
             smallest = num2;
        }
        if  (smallest > num3){
            smallest = num3;
        }
         System.out.println("The smallest number : " + smallest);

        //to find the biggest
        if (num1 > num2 ){
            biggest = num1;
        }
        else if (num1 < num2){
           biggest = num2;
        }
        if  (biggest < num3){
           biggest = num3;
        }

        System.out.println("The biggest number : " + biggest);
    }
}
