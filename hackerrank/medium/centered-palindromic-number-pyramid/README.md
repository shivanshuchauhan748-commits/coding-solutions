# Centered Palindromic Number Pyramid

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Write a program to print the pattern as shown below

1 121 12321 1234321

the given example is for n=4 rows

 **Input Format** 

A single integer number used to denote total numbers of rows to be printed in a pattern

 **Constraints** 

1< total rows < 50

 **Output Format** 

the pattern as shown in the example

 **Sample Input 0** 

```
3

```

 **Sample Output 0** 

```
  1
 121
12321

```

 **Sample Input 1** 

```
5

```

 **Sample Output 1** 

```
    1
   121
  12321
 1234321
123454321

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-13T16:07:37.957Z  

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
        
        for(int i = 1; i<=n; i++){
            for(int s = 1; s<=n-i; s++){
                System.out.print(" ");
                
            }
            for(int j = 1 ; j<=i; j++){
                
            System.out.print(j);
            }
            
         for(int j= i-1; j>=1; j--){
                System.out.print(j);
            }
            
            
        System.out.println();
        }
        
    }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/centered-palindromic-number-pyramid/problem)