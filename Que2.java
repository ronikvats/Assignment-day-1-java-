// Assignment day 1 Que.2
package vats;
import java.util.Scanner;
public class Que2 {
    private String name;
    private int age;
    private float marks;
    public void input() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = in.nextLine();
        System.out.print("Enter student age: ");
        age = in.nextInt();
        System.out.print("Enter student marks: ");
        marks = in.nextFloat();
    }
    public void output() {
        System.out.println("Name: " + name);
        System.out.println("age  is : " +age);
        System.out.println("Marks: " + marks);
    }
    public static void main(String args[]) {
        Que2 obj = new Que2();
        obj.input();
        obj.output();
    }

}
