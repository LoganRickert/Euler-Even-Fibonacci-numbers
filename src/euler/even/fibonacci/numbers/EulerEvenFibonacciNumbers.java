/*
 * Challenge:

 * Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

 * https://projecteuler.net/problem=2
 */

package euler.even.fibonacci.numbers;

/**
 *
 * @author Logan Rickert
 */
public class EulerEvenFibonacciNumbers {

    public static void main(String[] args) {
        
        // Inital variables
        final int endNumber = 4000000;
        int currentNumber = 1;
        int currentNumberBefore = 0;
        int currentTemp;
        int currentAmount = 0;
        
        // Check to make sure we don't go too far.
        while(currentNumber < endNumber){
            currentTemp = currentNumber;
            currentNumber = currentNumber + currentNumberBefore;
            currentNumberBefore = currentTemp;
            
            // If the current number is even, add the current number to the total
            // count.
            if(currentNumber % 2.0 != 1){
                currentAmount += currentNumber;
            }
        }
        
        // Print out the end results.
        System.out.println(currentAmount);
    }
    
}
