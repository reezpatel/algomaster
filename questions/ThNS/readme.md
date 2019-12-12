## :five: Three Number Sum

#### Question​

Write a function that takes in a non-empty array of distinct integers and an integer representing a target sum. The function should find all triplets in the array that sum up to the target sum and return a two-dimensional array of all these triplets. The numbers in each triplet should be ordered in ascending order, and the triplets themselves should be ordered in ascending order with respect to the numbers they hold. If no three numbers sum up to the target sum, the function should return an empty array.

#### Example

```
[12, 3, 1, 2, -6, 5, -8, 6], 0

> [[-8, 2, 6], [-8, 3, 5], [-6, 1, 5]]
```

#### Solution

1. Good Solution - `O(n!logn) ~ O(n^2)`

```
Sort Array. Loop over all element, for each element set `low` to 0 and high to `length - 1`. Since array is sorted find the required sum in between those two element.
```

2. Best Solution - `O(n!)`

```
Sort Array. Iterate through element. Subtract current element from target sum. Now, since the element is sorted, set low to next element and high to last element. Find the pair whose sum matches target sum.
```
