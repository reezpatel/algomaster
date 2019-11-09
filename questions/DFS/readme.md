## :one: Two Number Sum

#### Question

You are given a Node class that has a name and an array of optional children Nodes. When put together, Nodes form a simple tree-like structure. Implement the depthFirstSearch method on the Node class, which takes in an empty array, traverses the tree using the Depth-first Search approach (specifically navigating the tree from left to right), stores all the of the Nodes' names in the input array, and returns it.

#### Example

```
         A
       / | \
      B  C  D
     / \   / \
    E  F  G   H
      / \  \
     I   J  K

> ["A", "B", "E", "F", "I", "J", "C", "D", "G", "K", "H"]
```

#### Solution

1. Best Solution - `O(n + e) ~ O(n)`

```
Implement DFS -> Print Current Element, and call same method for it's children, until you reach end.
```
