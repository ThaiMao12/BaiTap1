package bai1;

import java.util.Scanner;

public class Bai1 {
    public static int UCLN(int a, int b){
        int kq = 0;
        int nhonhat = Math.min(a,b);
        for(int i = 1; i<= nhonhat; i++){
            if(a % i == 0 && b % i == 0){
                if(kq < i){
                    kq = i;
                }
            }
        }
        return kq;
    }
    public static int BCNN(int a, int b){
        int kq = 0;
        int tich = (a*b);

        for(int i = Math.max(a,b); i<= tich; i++){
            if(i % a == 0 && i % b == 0){

                    kq = i;
            break;
            }
        }
        return kq;
    }

    public static void main(String[] arg){
        Scanner s=new Scanner(System.in);
        int a,b;
        System.out.println("nhap a: ");
        a=s.nextInt();
        System.out.println("nhap b: ");
        b=s.nextInt();
        int ucln=UCLN(a,b);
        System.out.println("Uoc chung lon nhat "+ a +" va "+ b +" la :" + ucln);
        int bcnn=BCNN(a,b);
        System.out.println("Boi chung nho nhat "+ a +" va "+ b +" la :" + bcnn);
    }
}
