import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn =new Scanner(System.in);
        try{
        int n =scn.nextInt();
        printDecreasing(n);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
    public static void printDecreasing(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
    }
}
