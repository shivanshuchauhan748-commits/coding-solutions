# Left-Skewed-Number-pattern

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Write a program to print the pattern as shown below

the given example is for n=4 rows:

1 12 123 1234

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
1
12
123
1234
12345
123456
1234567

```

 **Sample Input 1** 

```
3

```

 **Sample Output 1** 

```
1
12
123

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-11-13T13:46:43.809Z  

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
            for(int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
            }
}

```

---

[View on HackerRank](https://www.hackerrank.com/challenges/left-skewed-number-pattern/problem)