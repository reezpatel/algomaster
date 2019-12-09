## :one: Binary Search

#### Question

Binary Search
​
Write a function that takes in a sorted array of integers as well as a target integer. The function should use the Binary Search algorithm to find if the target number is contained in the array and should return its index if it is, otherwise -1.

#### Example

```
[0, 1, 21, 33, 45, 45, 61, 71, 72, 73], 33

> 3
```

#### Solution

1. Best Solution - `O(logn)`

```
Set High = array length, and low = 0
find middle element, 
if middle element is equal to search value -> return index
else if middle element > search value -> set low index to middle element index + 1
else low index to middle element - 1
repeat again
```
