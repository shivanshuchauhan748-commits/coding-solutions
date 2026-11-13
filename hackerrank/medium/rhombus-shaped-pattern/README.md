# Rhombus shaped Pattern

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Create Program to develop a Pattern as Shown below 1 121 12321 1234321 123454321 1234321 12321 121 1

total numbers of rows of the pattern will be given as input.

 **Input Format** 

A single integer number used to denote total numbers of rows to be printed in a pattern

 **Constraints** 

1< total rows < 50

 **Output Format** 

print the output similar to the one shown in the example.

 **Sample Input 0** 

```
9

```

 **Sample Output 0** 

```
    1
   121
  12321
 1234321
123454321
 1234321
  12321
   121
    1

```

 **Sample Input 1** 

```
13

```

 **Sample Output 1** 

```
      1
     121
    12321
   1234321
  123454321
 12345654321
1234567654321
 12345654321
  123454321
   1234321
    12321
     121
      1

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-13T20:52:05.774Z  

```java
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
     public static void main(String args[] ) throws Exception {
       Scanner sc = new Scanner (System.in);
       int n = sc.nextInt();
       for(int i = 1; i<=(n+1)/2; i++){
        for(int s=(n+1)/2; s<=n-i; s++){
            System.out.print(" ");
            
        }
        for(int j = 1; j<=i; j++){
            System.out.print(j);
       }
       
        for(int j = i-1; j>=1; j--){
            System.out.print(j);
        }
        System.out.println();
       }
       int p = (n-1)/2;
        for(int i = 1; i<=p; i++){
         for(   int s = 1; s<=i ;s++){
            System.out.print(" ");
        
         }
        for(int j=1; j<=p-i+1; j++){
        System.out.print(j);
       
        }
        for(int j = p-i; j>=1;j--){
            System.out.print(j);
        }
        System.out.println();
}
     }
}


```

---

[View on HackerRank](https://www.hackerrank.com/challenges/rhombus-shaped-pattern/problem)