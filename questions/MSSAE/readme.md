## :four: Maximum Subset Sum With No Adjacent Elements

#### Question

Write a function that takes in an array of positive integers and returns an integer representing the maximum sum of non-adjacent elements in the array. If a sum cannot be generated, the function should return 0.

#### Example

```
[75, 105, 120, 75, 90, 135]

> 330 (75, 120, 135)
```

#### Solution

1. Best Solution - `O(n)`

```
Consider array [a, b, c, d, e, f]
Now we create a new array `arr` of same length, where each element represent maximum sum that can be formed by including non adjacent elements.

so our final result will be arr[n]
Now, to value at arr[n] => It can be 
1. If we have to take nth element -> arr[n] + maxSum(arr[0] ... arr[n-2]) [till non adjacent element]
2. If we dont have to take nth element -> maxSum(arr[n-1]) [till adjacent element]
```
