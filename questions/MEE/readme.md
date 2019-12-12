## :one: Move Element To End

#### Question
​
You are given an array of integers and an integer. Write a function that moves all instances of that integer in the array to the end of the array. The function should perform this in place and does not need to maintain the order of the other integers.

#### Example

```
[2, 1, 2, 2, 2, 3, 4, 2], 2

> [1, 3, 4, 2, 2, 2, 2, 2] 
```

#### Solution

1. Best Solution - `O(n + k)`

```
Iterate over array, push element if it is not desired element. If it is desired element, kill track of count and add all at last
```
