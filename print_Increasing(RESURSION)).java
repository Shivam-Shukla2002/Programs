import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args ) throws Exception{
        Scanner scn=new Scanner(System.in);
        try{
            int n =scn.nextInt();
            printIncreasing(n);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public static void printIncreasing(int n){
        if(n ==  0){
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
        
    }
}
