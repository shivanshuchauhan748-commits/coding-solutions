import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n  = sc.nextInt();
    for(int i = 1; i<=n; i++){
        for(int s = n-2; s>=n-i; s-- ){
            System.out.print(" ");
            
        }
for(int j = 1; j<=n-i+1; j++){
    System.out.print(j);
}
    for(int j = n-i; j>=1; j--){
        System.out.print(j);
    }

        
        
        System.out.println();
    }   
    }
}

