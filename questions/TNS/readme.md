## :one: Two Number Sum

#### Question

Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum. If any two numbers in the input array sum up to the target sum, the function should return them in an array, in sorted order. If no two numbers sum up to the target sum, the function should return an empty array. Assume that there will be at most one pair of numbers summing up to the target sum.
​

#### Example

```
[3, 5, -4, 8, 11, 1, -1, 6], 10

> [-1, 11]
```

#### Solution

1. Worst Solution - `O(n!) ~ O(n^2)` 
```
Iterate over each number and find it pair by iterating over again
```

2. Good Solution - `O(nlogn)`
```
Sort the array, then calculate sum of first and last element. If Sum is equal return, if sum is small more up from first number, if sum is greater move down from last number, till solution is found;
```

3. Best Solution - `O(n)`
```
Every time we while iterating, save the number in hashmap, then for second number calculate delta as (num - sum). If it is present is hashmap, that's your pair.

Storage complexity is a little high, as extra space is need to store hashmap
```