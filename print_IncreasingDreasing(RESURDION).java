import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String[] args) throws Exception {
        Scanner scn=new Scanner(System.in);
        try{
            int n =scn.nextInt();
            printID(n);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void  printID(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        printID(n-1);
        System.out.println(n);
    }
}
