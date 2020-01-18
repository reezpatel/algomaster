## :three: Kadane's Algorithm

#### Question
​
Write a function that takes in a non-empty array of integers and returns the maximum sum that can be obtained by summing up all the numbers in a non-empty subarray of the input array. A subarray must only contain adjacent numbers.
​
#### Example

```
[3, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4]
> 19 ([1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1])
```

#### Solution

1. Best Solution - `O(n)`

```
At any given index in the input array, the maximum sum for a subarray ending at that index is either the maximum sum for a subarray ending at the previous index plus the number at that index, or just the number at that index. Thus, for each index in the array, you can calculate the maximum sum of a subarray ending at that index, and this can be done in one simple pass through the input array.
```