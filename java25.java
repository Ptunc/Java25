package java25;

import java.util.Scanner;

public class java25 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
         
        int sayi, a=0, enBuyuk=0, enKucuk=0, j,  b=0;

        System.out.print("Kaç adet sayı gireceksiniz: ");
        sayi = input.nextInt();

        for(int i=0; i<sayi; i++){
            System.out.print(i+1 + ". sayıyı girin: ");
            j = input.nextInt();
            if(j>=a) {enBuyuk = j; a=j;}
            else { 
                b = j;
                if(b <= a) enKucuk = b;
            }
            
        }
        System.out.println("en büyük: " + enBuyuk);
        System.out.println("en küçük: " + enKucuk);
        input.close();
    }
}
