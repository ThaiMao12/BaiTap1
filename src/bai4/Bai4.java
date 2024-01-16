package bai4;

import java.util.Scanner;

public class Bai4 {
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
        int n=s.nextInt();
        System.out.println("cac so nguyen to la: ");
        for (int i=1;i<=n;i++){
            if (ktsnt(i)){
                System.out.printf(i+" ");
            }
        }
    }
}
