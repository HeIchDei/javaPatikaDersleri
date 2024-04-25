import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math, physics, chemistry, english, history, music;
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter maths grade: ");
        math = inp.nextInt();

        System.out.print("Enter physics grade: ");
        physics = inp.nextInt();

        System.out.print("Enter chemistry grade: ");
        chemistry = inp.nextInt();

        System.out.print("Enter english grade: ");
        english = inp.nextInt();

        System.out.print("Enter history grade: ");
        history = inp.nextInt();

        System.out.print("Enter music grade: ");
        music = inp.nextInt();

        double result = (math + physics + chemistry + english + history + music)/6;
        System.out.println("Your av. score is: " + result);
        System.out.println("You've " + (result >=60 ? "passed" : "failed") + " your class");
    }
}