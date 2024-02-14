import java.util.Scanner;
//Method Overloading is used to overload the method i.e. using the same method for different parameters of different data types and different no.of parameters.
class Person1 {
    public String name;
    protected int age;
    private char sex;
    protected String stnd;
    {
        stnd="B.Tech";
    }
    public Person1(){
        System.out.println("Default constructor");
    }
    public Person1(String name, int age, char sex){
        System.out.println("Parameterized constructor");
        this.name=name;
        this.age=age;
        this.sex=sex;
    }
    void setter(char s) {
        sex = s;
    }
    char getter(){
        return sex;
    }
    void print(String name,int age,char sex){
        System.out.print("Name: "+name);
        System.out.print(" Age: "+age);
        if(sex=='M'||sex=='m') System.out.print(" Sex: Male");
        else if(sex=='F'||sex=='f') System.out.print(" Sex: Female");
        else if(sex=='o') System.out.println(" Sex: Transgender");
        System.out.println(" Degree: "+stnd);
        System.out.println();
    }
    //methods
    int max(int a, int b){
        return(a>b?a:b);
    }
    int max(int a, int b, int c){
        int max1=0;
        if(a>b){
            if(a>c)
                max1=a;
        }
        else if(b>a){
            if(b>c) max1=b;
        }
        else max1=c;
        return max1;
    }
    int max(int a, int b, int c, int d){
        int max1=0;
        if(a>b&&a>c&&a>d) max1=a;
        else if(b>a&&b>c&&b>d) max1=b;
        else if(c>a&&c>b&&c>d) max1=c;
        else max1=d;
        return max1;
    }
    int max(int a, int b, int c, int d, int e){
//        int max1=0;
//        if(a>b&&a>c&&a>d&&a>e) max1=a;
//        else if(b>a&&b>c&&b>d&&b>e) max1=b;
//        else if(c>a&&c>b&&c>d&&c>e) max1=c;
//        else if(d>a&&d>b&&d>c&&d>e) max1=d;
//        else max1=e;
        return max(max(a,b,c),max(d,e));
        //method overloading
        //here the method with 2 parameters got revoked where the parameters are the one method with 3 parameters and the other with 2 parameters.
        //so we are using the same name of the method with different no.of parameters
        //we can also revoke the method with different datatype as well.
    }
    //here we can see we are having same method name but each have different number of parameters taking.
    //So if we revoke a method with 2 parameters then the one with 2 parameters will be revoked. If 3, the one with 3
    //So we can have the same method with different no.of parameters so that it will be easy to revoke everytime.
}
public class MethodOverloading {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Person1 p1=new Person1();
        System.out.print("enter no.of entries: ");int n= sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++) {
            System.out.println("Entry " + i);
            System.out.print("enter name of the person: ");
            p1.name = sc.nextLine();
            System.out.print("enter age: ");
            p1.age = sc.nextInt();
            System.out.print("enter sex: ");
            char sex = sc.next().charAt(0);
            p1.setter(sex);
            p1.print(p1.name, p1.age, p1.getter());
            sc.nextLine();
        }
        Person1 p2=new Person1("Karthikeya",18,'M');
        p2.stnd="BSE";
        p2.print(p2.name, p2.age, p2.getter());
        Person1 p3=new Person1();
        int ans=p3.max(1,2,3,4,5);   //method overloading
        System.out.println("The maximum number is "+ans);
    }
}