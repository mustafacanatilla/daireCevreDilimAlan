import java.util.Scanner;
public class daireDilimininAlani {
    public static void main(String[] args) {

        double r, a, pi = 3.14, dilimAlan;

        Scanner input = new Scanner(System.in);
        System.out.print("Yarı Çapı Giriniz:");
        r = input.nextDouble();
        System.out.print("Merkez Açıyı Giriniz:");
        a = input.nextDouble();


        dilimAlan = (pi * (r * r)* a) / 360;
        System.out.println("Dilim Alan:" + dilimAlan);
    }
}
