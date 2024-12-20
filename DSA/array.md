# Array
An array is a data structure used to store multiple elements.

Algorithm: Find The Lowest Value in an Array
How it works:
- Go through the values in the array one by one.
- Check if the current value is the lowest so far, and if it is, store it.
- After looking at all the values, the stored value will be the lowest of all values in the array.

Implementation:
1. Create a variable 'minVal' and set it equal to the first value of the array.
2. Go through every element in the array.
3. If the current element has a lower value than 'minVal', update 'minVal' to this value.
4. After looking at all the elements in the array, the 'minVal' variable now contains the lowest value.

### Algorithm Time Complexity
When exploring algorithms, we often look at how long time an algorithm takes to run relative to the size of the data set.

### Bubble Sort
Bubble Sort is an algorithm that sorts an array from the lowest value to the highest value.

How it works:
1. Go through the array, one value at a time.
2. For each value, compare the value with the next value.
3. If the value is higher than the next one, swap the values so that the highest value comes last. 
4. Go through the array as many times as there are values in the array.

### Bubble Sort Implementation
- To implement the Bubble Sort algorithm in a programming language, we need:
1. An array with values to sort.
2. An inner loop that goes through the array and swaps values if the first value is higher than the next value. 
   This loop must loop through one less value each time it runs.
3. An outer loop that controls how many times the inner loop must run. 
   For an array with n values, this outer loop must run n-1 times.