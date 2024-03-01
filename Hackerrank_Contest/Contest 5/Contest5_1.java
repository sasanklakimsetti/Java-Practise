/*
Given integers  and , find the smallest integer , such that there exists a triangle of height , base , having an area of at least .

image
Example


The minimum height  is . One example is a triangle formed at points (0, 0), (4, 0), (2, 3).

Function Description

Complete the lowestTriangle function in the editor below.

lowestTriangle has the following parameters:

int b: the base of the triangle
int a: the minimum area of the triangle
Returns

int: the minimum integer height to form a triangle with an area of at least
Input Format

There are two space-separated integers  and , on a single line.

Constraints

Sample Input 0

2 2
Sample Output 0

2
Explanation 0

The task is to find the smallest integer height of the triangle with base  and area at least . It turns out, that there are triangles with height , base  and area , for example a triangle with corners in the following points: :

image
It can be proved that there is no triangle with integer height smaller than , base  and area at least .

Sample Input 1

17 100
Sample Output 1

12
Explanation 1

The task is to find the smallest integer height of the triangle with base  and area at least . It turns out, that there are triangles with height , base  and area , for example a triangle with corners in the following points: .

image

It can be proved that there is no triangle with integer height smaller than , base  and area at least .
 */

package Hackerrank_Contest;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'lowestTriangle' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER trianglebase
     *  2. INTEGER area
     */

    public static int lowestTriangle(int trianglebase, int area) {
        // Write your code here
        double height=Math.ceil(area*2.0/trianglebase);
        return (int)height;

    }

}

public class Contest5_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int trianglebase = Integer.parseInt(firstMultipleInput[0]);

        int area = Integer.parseInt(firstMultipleInput[1]);

        int height = Result.lowestTriangle(trianglebase, area);

        bufferedWriter.write(String.valueOf(height));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
