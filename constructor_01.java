
import java.util.Scanner;

class constructor_01 {

    String name = "xyz";
    int age = 10;
    int roll = 02;
    String course = "CSE";
    String sub = "Java";
    double cgpa = 10.00;

    public constructor_01() {
        System.out.println("no student data has entered.here is default data");
        System.out.println("Studnet details: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll: " + roll);
        System.out.println("Course: " + course);
        System.out.println("Subject: " + sub);
        System.out.println("CGPA: " + cgpa);
    }

    public constructor_01(String name, int roll) {
        this.name = name;
        this.roll = roll;
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("do you want to print name and roll: \n type 1 for yes\n type 2 for no.");
        int n = sc.nextInt();
        sc.nextLine();
        if (n == 1) {
            System.out.println("enter name and roll");
            String name = sc.nextLine();
            int roll = sc.nextInt();
            constructor_01 c1 = new constructor_01(name, roll);

        } else {
            constructor_01 c2 = new constructor_01();

        }
        /*if(name==null || )
        System.out.println("Student details:");
        constructor_01 c1=new constructor_01(name,roll); */

    }
}
