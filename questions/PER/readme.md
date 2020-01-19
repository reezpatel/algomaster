## :three: Permutations

#### Question

Write a function that takes in an array of unique integers and returns an array of all permutations of those integers. If the input array is empty, your function should return an empty array.
​
​

#### Example

```
[1, 2, 3]
> [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
```

#### Solution

1. Best Solution - `O(n*n!) ~ O(n^3)`

```
Consider a list with single element ([[1]]), then for each new element, insert the number at each place.
like for([1, 2]) inserting 3
=> at index 0 -> ([3, 1, 2])
=> at index 1 -> ([1, 3, 2])
=> at index 2 -> ([1, 2, 3])
```

​

​

​
