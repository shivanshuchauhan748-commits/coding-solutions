# Numbered Hourglass

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Write a program to print the pattern as shown below

 **Input Format** 

A single integer number used to denote total numbers of rows to be printed in a pattern

 **Constraints** 

1< total rows < 50

 **Output Format** 

the pattern as shown in the example

 **Sample Input 0** 

```
7

```

 **Sample Output 0** 

```
1234321
 12321
  121
   1
  121
 12321
1234321

```

 **Sample Input 1** 

```
15

```

 **Sample Output 1** 

```
123456787654321
 1234567654321
  12345654321
   123454321
    1234321
     12321
      121
       1
      121
     12321
    1234321
   123454321
  12345654321
 1234567654321
123456787654321

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-13T21:28:46.106Z  

```java
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

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/numbered-hourglass/problem)