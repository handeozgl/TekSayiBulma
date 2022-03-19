import java.util.Scanner;
public class TekSayiBulma {
    public static void main(String[] args) {
        boolean ispositive = false;
        int sayi, toplam = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriiniz: ");
        sayi = input.nextInt();
        while (!ispositive) {
            System.out.println("Bir sayi giriiniz: ");
            sayi = input.nextInt();
            if (sayi <= 0)  {
                break;
            } else {
                if (sayi % 2 != 0){
                    toplam += sayi;

                }
            }
        }System.out.println("Simdiye kadar girilen tek sayi toplami "+ toplam);



    }
}

