//take user input of weight and height. calculate bmi and print the body condition using if else

import java.util.Scanner;

public class BMI2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in) ;
        System.out.print("enter weight: ");float w=sc.nextFloat();
        System.out.print("enter height: ");float h=sc.nextFloat();
        float bmi=w/(h*h);
        if(bmi>18.0&bmi<22.0){
            System.out.println("Fit");
        }
        else if(bmi>22.0){
            System.out.println("obessed");
        }
        else{
            System.out.println("skinny");
        }
        sc.close();
    }
}