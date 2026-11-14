import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    if(n>0&& m>0){
        System.out.print(m*n);
        
    }else
    System.out.print("java.lang.Exception: Breadth and height must be positive");
    
    
    }
}
