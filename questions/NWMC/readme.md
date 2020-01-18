## :five: Number Of Ways To Make Change

#### Question

Given an array of positive integers representing coin denominations and a single non-negative integer representing a target amount of money, implement a function that returns the number of ways to make change for that target amount using the given coin denominations. Note that an unlimited amount of coins is at your disposal.

#### Example

```
6, [1, 5]
> 2 (1x1 + 1x5 and 6x1)
```

#### Solution

1. Best Solution - `O(n*d) ~ O(n^2)`

```
Build up the array one coin denomination at a time. In other words, find the number of ways to make change for all amounts between 0 and n with only one denomination, then with two, etc., until you use all denominations.
```
