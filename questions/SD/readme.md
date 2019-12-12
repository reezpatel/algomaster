## :four: Smallest Difference

#### Question

Write a function that takes in two non-empty arrays of integers. The function should find the pair of numbers (one from the first array, one from the second array) whose absolute difference is closest to zero. The function should return an array containing these two numbers, with the number from the first array in the first position. Assume that there will only be one pair of numbers with the smallest difference.

#### Example

```
[-1, 5, 10, 20, 28, 3], [26, 134, 135, 15, 17]
> [28, 26]
```

#### Solution

1. Best Solution - `O(nlog(n) + mlog(m))`

```
Start from 0 index for each element. Sort both array. Keep track of smallest diff, and pair for that result.
Repeat until both index are not at end of array.
1. If diff is zero -> Return pair
2. If diff is lowest -> Save Pair
3. If diff on next element in first array and current element is second array 
    is less that current element is first array and next element in second element 
         -> move to next index in first array
    else -> move to next index in second array
4. Return pair
```