## :four: Min Heap Construction

#### Question

Implement a Min Heap class. The class should support insertion, removal (of the minimum / root value), peeking (of the minimum / root value), as well as sifting a value up and down the heap and building the heap from an input array. The heap should be represented in the form of an array.
​

#### Example

```
buildHeap([48, 12, 24, 7, 8, -5, 24, 391, 24, 56, 2, 6, 8, 41])
insert(76)
remove()
remove()
insert(87)

> [-5, 2, 6, 7, 8, 8, 24, 391, 24, 56, 12, 24, 48, 41]
> [-5, 2, 6, 7, 8, 8, 24, 391, 24, 56, 12, 24, 48, 41, 76]
> [2, 7, 6, 24, 8, 8, 24, 391, 76, 56, 12, 24, 48, 41]
> [6, 7, 8, 24, 8, 24, 24, 391, 76, 56, 12, 41, 48]
> [6, 7, 8, 24, 8, 24, 24, 391, 76, 56, 12, 41, 48, 87]
```

#### Solution

1. Best Implementation

```
Min Heap is a type of binary tree, where each node's value is greater than it's parent. Hence the top most node is always the smallest.
```
