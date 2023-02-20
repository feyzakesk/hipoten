import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Değişkenlerimizi oluşturalım
        int a, b;
        double c;

        //Kullanıcıdan veriileri alalım
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Kenarı Giriniz : ");
        a = input.nextInt();
        System.out.print("İkinci Kenarı Giriniz : ");
        b = input.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs : " + c);

    }
}
