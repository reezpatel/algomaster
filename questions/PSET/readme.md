## :three: ​​Powerset

#### Question

Write a function that takes in an array of unique integers and returns its powerset. The powerset P(X) of a set X is the set of all subsets of X. For example, the powerset of `[1,2]` is `[[], [1], [2], [1,2]]`. Note that the sets in the powerset do not need to be in any particular order.
​
​

#### Example

```
[ 1, 2, 3]
> [[], [1], [2], [3], [1, 2], [1, 3], [2, 3], [1, 2, 3]]
```

#### Solution

1. Best Solution - `O(2^n)`

```
Consider binary number which in decimal is 0 to 2^n. For each number in decimal.
0 -> Not in Set
1 -> In in Set
```

​

​

​
