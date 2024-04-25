public class Main {
    public static void main(String[] args) {
        int a = 5, b = 6, c=5;
        boolean kosul1 = a == c;
        boolean kosul2 = a >= b;

        boolean kosul = kosul1 && kosul2; // AND gate
        System.out.println(kosul);

        boolean sonuc = kosul1 || kosul2; //OR gate
        System.out.println(!sonuc);

        boolean sonuc2 = !((a == c) || (a >= b));
        System.out.println(sonuc2);

        String str =(sonuc) ? "Dogru" : "Degil"; // if sonuc == true then Dogru else Degil
        System.out.println(str);

        byte bas = 0;
        int ass = bas++;
        System.out.println(bas);
    }
}