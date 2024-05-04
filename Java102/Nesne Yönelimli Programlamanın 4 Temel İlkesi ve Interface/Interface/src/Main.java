import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Tutar giriniz: ");
        double price = inp.nextDouble();

        System.out.print("Kart No giriniz: ");
        String cardNo = inp.next();

        System.out.print("Son kullanim tarihi giriniz: ");
        String expireDate = inp.next();

        System.out.print("Guvenlik kodu giriniz: ");
        String cvc = inp.next();

        System.out.println("1. A Bankasi ");
        System.out.println("2. B Bankasi ");
        System.out.println("3. C Bankasi ");
        System.out.print("Banka seciniz: ");
        int selectBank = inp.nextInt();

        switch(selectBank){
            case 1:
                ABankasi aPos = new ABankasi("A Bankasi", "123123123", "123456");
                aPos.connect("127.1.1.1");
                aPos.payment(price, cardNo, expireDate, cvc);
                break;
            case 2:
                BBankasi bPos = new BBankasi("B Bankasi", "123123123", "123456");
                bPos.connect("127.1.1.1");
                bPos.payment(price, cardNo, expireDate, cvc);
                break;
            default:
                System.out.println("Gecerli banka giriniz!");
        }



    }

}
