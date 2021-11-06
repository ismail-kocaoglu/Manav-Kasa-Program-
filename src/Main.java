import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        int armut,elma,dom,muz,patl;
        double toplam;
        Scanner input = new Scanner(System.in);

        System.out.print("Alınan armut miktarını giriniz: ");
        armut=input.nextInt();
        System.out.print("Alınan elma miktarını giriniz: ");
        elma=input.nextInt();
        System.out.print("Alınan domates miktarını giriniz: ");
        dom=input.nextInt();
        System.out.print("Alınan muz miktarını giriniz: ");
        muz=input.nextInt();
        System.out.print("Alınan patlıcan miktarını giriniz: ");
        patl=input.nextInt();

        toplam= ((armut*2.14)+(elma*3.67)+(dom*1.11)+(muz*0.95)+(patl*5));

        System.out.print("Toplam tutar: "+toplam);


    }
}
