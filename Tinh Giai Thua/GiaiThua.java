import java.util.Scanner;

public class GiaiThua {
    static void giaThuaCalculator() {
        System.out.println("Nhập vào số n:");
        Scanner sn= new Scanner(System.in);
        int n=sn.nextInt();
        int giaithua=1;
        for (int i = 1; i <= n; i++) {
           giaithua= giaithua * i;
        }
        System.out.println(giaithua);
    }
    static void giThuaCalculator01(){
        System.out.println("Nhập vào số n:");
        Scanner sn= new Scanner(System.in);
        int n= sn.nextInt();
        int giaithu =1;
        int i=1;
        while ( i<= n){
            giaithu= giaithu * i;
            i++;
        }
        System.out.print(giaithu+"\t");

    }
    static void giThuaCalculator02(){
        System.out.println("Nhập vào số n:");
        Scanner sn= new Scanner(System.in);
        int n= sn.nextInt();
        int giaithu =1;
        int i=1;
        do {
            giaithu= giaithu * i;
            i++;
        }while ( i<= n);
        System.out.print(giaithu+"\t");


    }
}
