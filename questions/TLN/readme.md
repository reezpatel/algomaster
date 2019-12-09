## :one: Find Three Largest Numbers

#### Question​

Write a function that takes in an array of integers and returns a sorted array of the three largest integers in the input array. Note that the function should return duplicate integers if necessary; for example, it should return [10, 10, 12] for an input array of [10, 5, 9, 10, 12].​

#### Example

```
[141, 1, 17, -7, -17, -27, 18, 541, 8, 7, 7]

> [18, 141, 541]
```

#### Solution

1. Good Solution - `O(nlogn)`

```
Sort Array is return first 3 element
```

2. Best Solution - `O(3n)`

```
Visit element one by one, keep array of 3 largest element with sorted order
```
