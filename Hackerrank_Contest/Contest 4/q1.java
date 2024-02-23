/*
A person is getting ready to leave and needs a pair of matching socks. If there are  colors of socks in the drawer, how many socks need to be removed to be certain of having a matching pair?

Example 

There are  colors of socks in the drawer. If they remove  socks, they may not match. The minimum number to insure success is .

Function Description

Complete the maximumDraws function in the editor below.

maximumDraws has the following parameter:

int n: the number of colors of socks
Returns

int: the minimum number of socks to remove to guarantee a matching pair.
Input Format
The first line contains the number of test cases, .
Each of the following  lines contains an integer .
*/
package Hackerrank_Contest;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result1 {

    /*
     * Complete the 'maximumDraws' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int maximumDraws(int n) {
    // Write your code here
        return n+1;
    }

}

public class q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            int n = Integer.parseInt(bufferedReader.readLine().trim());

            int result = Result1.maximumDraws(n);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}
