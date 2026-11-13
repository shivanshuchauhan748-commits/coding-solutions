# Centered Palindromic Number Reverse Pyramid

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Write a program to print the pattern as shown below

the given example is for n=4 rows

 **Input Format** 

A single integer number used to denote total numbers of rows to be printed in a pattern

 **Constraints** 

1< total rows < 50

 **Output Format** 

the pattern as shown in the example

 **Sample Input 0** 

```
4

```

 **Sample Output 0** 

```
1234321
 12321
  121
   1

```

 **Sample Input 1** 

```
8

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

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-13T17:01:14.835Z  

```java
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


```

---

[View on HackerRank](https://www.hackerrank.com/challenges/centered-palindromic-number-reverse-pyramid/problem)