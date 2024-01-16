package bai3;

import java.util.Scanner;

public class Bai3 {
    public static void dayso(int n) {
        for (int i = 2; i <= n; i++) {
            while (n%i==0){
                System.out.print(i);
                n/= i;
                if(n>1){
                    System.out.print(" x ");
                }
            }
        }
    }
    public static void main(String[] arg){
        System.out.println("nhap so: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("phan tich thua snt "+ n + " la: ");
        dayso(n);
    }
}
