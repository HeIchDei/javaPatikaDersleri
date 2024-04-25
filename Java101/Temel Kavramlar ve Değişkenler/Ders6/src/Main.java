import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);

        System.out.print("Deger gir: ");
        a = input.nextInt();
        System.out.println(a);

        double b = input.nextDouble();
        System.out.println(b);

        input.nextLine(); //nextint method doesnt read newline character so nextline takes that character

        String str;
        System.out.print("Enter name: ");
        str = input.nextLine();
        System.out.println(str);
    }
}