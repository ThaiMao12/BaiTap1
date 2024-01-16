package bai5;

import java.util.Scanner;

public class Bai5 {
    public static boolean ktsnt(int n){
        for (int i=2; i< n; i++){
            if (n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] arg){
        System.out.println("nhap n: ");
        Scanner s=new Scanner(System.in);
        int a=0;
        int b=2;
        int n=s.nextInt();
        System.out.println(n+" so nguyen to dau tien la: ");
        do {
            if (ktsnt(b)){
                System.out.print(b+" ");
                a++;
                b++;
            }else {
                b++;
            }
        }while (a<n);
    }
}
