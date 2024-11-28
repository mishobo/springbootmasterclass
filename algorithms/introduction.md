# Algorithms

Definition:
Algorithm is a procedure, a sequence of finite steps to solve a particular problem.
The Algorithm designed are language-independent, i.e. they are just plain instructions that can be implemented in any 
language, and yet the output will be the same, as expected.
In an Algorithm the problem is broken down into smaller pieces or steps hence, 
it is easier for the programmer to convert it into an actual program.

illustration example
input -> (a set of rules to obtain the expected output) [algorithm] -> output 

## Uses of the Algorithms
1. Computer Science: used to solve problems ranging from simple sorting and searching to complex tasks such as artificial
                     intelligence and machine learning.
2. Mathematics: Algorithms are used to solve mathematical problems, such as finding the optimal solution to a system of 
                linear equations or finding the shortest path in a graph.
3. Operations Research: Algorithms are used to optimize and make decisions in fields such as transportation, logistics, 
                        and resource allocation.
4. Artificial Intelligence: Algorithms are the foundation of artificial intelligence and machine learning, and are used 
                            to develop intelligent systems that can perform tasks such as image recognition, 
                            natural language processing, and decision-making.
5. Data Science: Algorithms are used to analyze, process, and extract insights from large amounts of data in fields such 
                 as marketing, finance, and healthcare.

### importance of algorithms
- Algorithms are necessary for solving complex problems efficiently and effectively.
- They help to automate processes and make them more reliable, faster, and easier to perform.
- Algorithms also enable computers to perform tasks that would be difficult or impossible for humans to do manually.
- They are used in various fields such as mathematics, computer science, engineering, finance, and many others to 
  optimize processes, analyze data, make predictions, and provide solutions to problems.

### characteristics of algorithms
1. Clear and Unambiguous:
2. Well-Defined Outputs: 
3. Finite-ness: The algorithm must be finite, i.e. it should terminate after a finite time.
4. Feasible: The algorithm must be simple, generic, and practical, such that it can be executed with the available 
   resources. It must not contain some future technology or anything.
5. Language Independent: The Algorithm designed must be language-independent, i.e. it must be just plain instructions 
   that can be implemented in any language, and yet the output will be the same, as expected.
6. Input: An algorithm has zero or more inputs. Each that contains a fundamental operator must accept zero or more inputs.
7. Output: An algorithm produces at least one output. Every instruction that contains a fundamental operator must accept zero or more inputs.

### Types of Algorithms
1. Brute Force Algorithm:
   It is the simplest approach to a problem. A brute force algorithm is the first approach that comes to finding when we see a problem.
2. Recursive Algorithm:
   In this case, a problem is broken into several sub-parts and called the same function again and again.
3. Backtracking Algorithm:
   The backtracking algorithm builds the solution by searching among all possible solutions. Using this algorithm, 
   we keep on building the solution following criteria. Whenever a solution fails we trace back to the failure point 
   build on the next solution and continue this process till we find the solution or all possible solutions are looked after.
4. Searching Algorithm:
   Searching algorithms are the ones that are used for searching elements or groups of elements from a particular data structure. 
   They can be of different types based on their approach or the data structure in which the element should be found.
5. Sorting Algorithm:
   Sorting is arranging a group of data in a particular manner according to the requirement. 
   The algorithms which help in performing this function are called sorting algorithms. 
   Generally sorting algorithms are used to sort groups of data in an increasing or decreasing manner.
6. Hashing Algorithm:
   Hashing algorithms work similarly to the searching algorithm. But they contain an index with a key ID. 
   In hashing, a key is assigned to specific data.
7. Divide and Conquer Algorithm:
   This algorithm breaks a problem into sub-problems, solves a single sub-problem, 
   and merges the solutions to get the final solution. It consists of the following three steps: Divide, Solve, Combine
8. Greedy Algorithm:
   In this type of algorithm, the solution is built part by part. The solution for the next part is built based on the 
   immediate benefit of the next part. The one solution that gives the most benefit will be chosen as the solution for the next part.
9. Dynamic Programming Algorithm:
   This algorithm uses the concept of using the already found solution to avoid repetitive calculation of the same part 
   of the problem. It divides the problem into smaller overlapping subproblems and solves them.
10. Randomized Algorithm:
    In the randomized algorithm, we use a random number so it gives immediate benefit. 
    The random number helps in deciding the expected outcome.

### How to Design an Algorithm?
1. The problem that is to be solved by this algorithm i.e. clear problem definition.
2. The constraints of the problem must be considered while solving the problem.
3. The input to be taken to solve the problem.
4. The output is to be expected when the problem is solved.
5. The solution to this problem is within the given constraints.

### How to analyze an Algorithm? 
For a standard algorithm to be good, it must be efficient.
Hence, the efficiency of an algorithm must be checked and maintained.
It can be in two stages:

1. Priori Analysis:
“Priori” means “before”. Hence Priori analysis means checking the algorithm before its implementation.
In this, the algorithm is checked when it is written in the form of theoretical steps.
This Efficiency of an algorithm is measured by assuming that all other factors, for example, processor speed, 
are constant and have no effect on the implementation.
This analysis is independent of the type of hardware and language of the compiler.
It gives the approximate answers for the complexity of the program.

2. Posterior Analysis:
“Posterior” means “after”. Hence, Posterior analysis means checking the algorithm after its implementation.
In this, the algorithm is checked by implementing it in any programming language and executing it.
This analysis helps to get the actual and real analysis report about correctness(for every possible input/s 
if it shows/returns correct output or not), space required, time consumed, etc.
That is, it is dependent on the language of the compiler and the type of hardware used.

### What is Algorithm complexity and how to find it?
An algorithm is defined as complex based on the amount of Space and Time it consumes.
Hence, the Complexity of an algorithm refers to the measure of the time that it will need to execute and get the expected 
output, and the Space it will need to store all the data (input, temporary data, and output).
Hence, these two factors define the efficiency of an algorithm.
The two factors of Algorithm Complexity are:
* Time Factor: Time is measured by counting the number of key operations such as comparisons in the sorting algorithm.
* Space Factor: Space is measured by counting the maximum memory space required by the algorithm to run/execute.

- Therefore, the complexity of an algorithm can be divided into two types:
1. Space Complexity: 
   The space complexity of an algorithm refers to the amount of memory required by the algorithm to store the variables and get the result.
   This can be for inputs, temporary operations, or outputs.
   - How to calculate Space Complexity?
   - The space complexity of an algorithm is calculated by determining the following 2 components:
    * Fixed Part: This refers to the space that is required by the algorithm. 
                  For example, input variables, output variables, program size, etc.
    * Variable Part: This refers to the space that can be different based on the implementation of the algorithm. 
                     For example, temporary variables, dynamic memory allocation, recursion stack space, etc.
   - Therefore, Space complexity S(P) of any algorithm P is S(P) = C + SP(I), where C is the fixed part and S(I) is the 
      variable part of the algorithm, which depends on instance characteristic I.
2. Time Complexity:
   The time complexity of an algorithm refers to the amount of time required by the algorithm to execute and get the result. 
   This can be for normal operations, conditional if-else statements, loop statements, etc.
### How to Calculate, Time Complexity?
- The time complexity of an algorithm is also calculated by determining the following 2 components: 
* Constant time part: Any instruction that is executed just once comes in this part. For example, input, output, if-else,
                      switch, arithmetic operations, etc.
* Variable Time Part: Any instruction that is executed more than once, say n times, comes in this part. For example, loops, recursion, etc.

Therefore, Time complexity T(P) of any algorithm P is T(P) = C + TP(I), where C is the constant time part and TP(I) is 
the variable part of the algorithm, which depends on the instance characteristic I.

Example: In the algorithm of Linear Search above, the time complexity is calculated as follows:
Step 1: –Constant Time
Step 2: — Variable Time (Taking n inputs)
Step 3: –Variable Time (Till the length of the Array (n) or the index of the found element)
Step 4: –Constant Time
Step 5: –Constant Time
Step 6: –Constant Time
Hence, T(P) = 1 + n + n(1 + 1) + 1 = 2 + 3n, which can be said as T(n).

### How to express an Algorithm?
1. Natural Language:- Here we express the Algorithm in the natural English language. 
2. Flowchart:- Here we express the Algorithm by making a graphical/pictorial representation of it. 
   It is easier to understand than Natural Language.
3. Pseudo Code:- Here we express the Algorithm in the form of annotations and informative text written in plain English 
   which is very much similar to the real code but as it has no syntax like any of the programming languages, 
   it can’t be compiled or interpreted by the computer. It is the best way to express an algorithm because it can be 
   understood by even a layman with some school-level knowledge.

