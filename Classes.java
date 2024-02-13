import java.util.Scanner;
//classes and objects
//OOPS
//there can only be one public class and it can only be with the name of the file
class Person{
    //access specifiers :
    //public: can access anywhere in the whole program
    //protected : can only access within the class
    //private: cannot access anywhere
    //private variable can be accessed using any function and storing through other other variables
    //we can only access that private variable using that function only in the main
    public String name;
    protected int age;
    private char sex;
    //intializer block
    //it will be the default for every object of the class
    //it need not be declared when the object is called using a constructor and it will be printed with every object of the class
    //it can be overwritten during the constructor call or without the constructor call if the user wants to change the value

    protected String stnd;
    {
        stnd="B.Tech";
    }
    //constructor
    public Person(){
        System.out.println("Default constructor");
    }
    public Person(String name, int age, char sex){
        System.out.println("Parameterized constructor");
        this.name=name;    //as the names of parameters and public identifiers are same there will be an ambiguity error as compiler gets confused which 'name' does it refer to the one inside the constructor parameter or the one inside the class
        this.age=age;      // to avoid this confusion to compiler we need to use this.identifier_name which tells the compiler that it is the identifier which is the part of constructor.
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
}
public class Classes {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Person p1=new Person();      //will print default constructor after creation of object as we haven't given any parameters inside the constructor
        System.out.print("enter no.of entries: ");int n= sc.nextInt();
        sc.nextLine();
        for(int i=1;i<=n;i++) {
            System.out.println("Entry "+i);
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
        //calling constructor
        Person p2=new Person("Karthikeya",18,'M');   //will print parameterized constructor as we have given parameters inside the constructor;
        p2.stnd="BSE";     //here the initializer block has been changed from B.Tech to BSE and we can see the output of the new value
        p2.print(p2.name, p2.age, p2.getter());
    }
}