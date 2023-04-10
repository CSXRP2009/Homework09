/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package richard.homework09;

/**
 *
 * @author CSXRP
 */
public class Homework09 {
    
    // ToDo 01:  Write an algorithm to solve the following problem
    /*
    The sequence of triangle numbers is generated by adding the natural numbers. So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. The first ten terms would be:
1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
Let us list the factors of the first seven triangle numbers:
 1: 1
 3: 1,3
 6: 1,2,3,6
10: 1,2,5,10
15: 1,3,5,15
21: 1,3,7,21
28: 1,2,4,7,14,28
We can see that 28 is the first triangle number to have over five divisors.
What is the value of the first triangle number to have over one hundred divisors?
  The first triangle number that has over 100 divisors is 73920 with 112 Divisors
    */
    public static void main(String[] args) {
        int n =1;
        int count = 0;
        while(count <= 100){
            int triangle = triangleNumber(n);
            count=numFactors(triangle);
            System.out.println("triangle: " + triangle +" count: " + count);
            n++;
           
        }        
        
    }
    public static int triangleNumber(int n){
        int sum=0;
        for(int i = 1; i <= n; i++){
            sum+=i;
        }
        return sum;
    }
    public static int numFactors(int n){
        int count =0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count++;
            }
        }
        return count;    
    }
}