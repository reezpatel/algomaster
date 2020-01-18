## :five: Min Number Of Coins For Change

#### Question

Given an array of positive integers representing coin denominations and a single non-negative integer representing a target amount of money, implement a function that returns the smallest number of coins needed to make change for that target amount using the given coin denominations. Note that an unlimited amount of coins is at your disposal. If it is impossible to make change for the target amount, return -1.

#### Example

```
7, [1, 5, 10]
> 3 (2x1 + 1x5)
```

#### Solution

1. Best Solution - `O(nd) ~ O(n^2)`

```
Build up the array one coin denomination at a time. In other words, find the minimum number of coins needed to make change for all amounts between 0 and n with only one denomination, then with two, etc., until you use all denominations.
```
