## :one: Nth Fibonacci

#### Question

The Fibonacci sequence is defined as follows: the first number of the sequence is 0, the second number is 1, and the nth number is the sum of the (n - 1)th and (n - 2)th numbers. Write a function that takes in an integer n and returns the nth Fibonacci number.

#### Example

```
6
> 5

[0 1 1 2 3 5]
           ^
```

#### Solution

1. Good Solution - `O(n)`

```
Recursion Using Function - Recursively call same method, deceasing n by one, a as b and b as a+b. If n is 1 return a
```

2. Best Solution - `O(n)`

```
Recursion using Loops - Same as above, just using loop or save call stack
```
