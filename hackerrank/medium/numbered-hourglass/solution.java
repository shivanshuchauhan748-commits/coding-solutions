import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       int p = (n+1)/2;
       for(int i = 1; i<=(n+1)/2; i++){
        for(int s = 1; s<i;   s++){
            System.out.print(" ");
        }
        for(int j = 1 ; j<=(n+1)/2-i+1; j++){
            System.out.print(j);
        }
        for(int j = p-i; j>=1; j-- ){
            System.out.print(j);
        }
        System.out.println();
       }
       int q = (n-1)/2; // 3
       for(int i= 1 ; i<=q; i++){
        for(int s= q; s>i; s-- ){
            System.out.print(" ");
        }
        for(int j = 1; j<=i+1; j++){
            System.out.print(j);
        }
    for(int j = i; j>=1; j--){
        System.out.print(j);
    }
        System.out.println();
       }
    }
}
