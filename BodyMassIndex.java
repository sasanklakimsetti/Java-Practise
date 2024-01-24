//you are supposed to take input of weight in kgs and height in meters of user. return whether the user is obessed or skinny according to the bmi
//bmi < 18 -> skinny
//bmi > 18 & <22 -> fit
//else obessed

import java.util.Scanner;

public class BodyMassIndex{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter weight: ");float weight=sc.nextFloat();
        System.out.print("Enter height: ");float height=sc.nextFloat();
        double bmi=weight/(height*height);
        String ans = (bmi < 18.0 ? "Skinny" : (bmi >= 18.0 && bmi <= 22.0 ? "Fit" : "Obessed"));
        System.out.println("According to bmi: "+ans);
        sc.close();
    }
}