package bai2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Bai2 {

    public static int sumAll(String g){
        int tong=0;
        String[] t= g.split("",0);
        for(String i : t){
            tong+= Integer.parseInt(i);
        }
        return tong;
    }
    public static void main(String[] arg){
        System.out.println("nhap day so: ");
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        int tong= sumAll(a);
        System.out.println("tong day la: " +tong);
    }
}
