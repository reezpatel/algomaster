## :two: Breadth-first Search

#### Question

​
You are given a Node class that has a name and an array of optional children Nodes. When put together, Nodes form a simple tree-like structure. Implement the breadthFirstSearch method on the Node class, which takes in an empty array, traverses the tree using the Breadth-first Search approach (specifically navigating the tree from left to right), stores all of the Nodes' names in the input array, and returns it.

​

#### Example

```
          A
       /  |  \
      B   C   D
     / \     / \
    E   F   G   H
       / \   \
      I   J   K

> ["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K"]
```

#### Solution

1. Best Solution - `O(n + e)`

```
Start from root and maintain a queue. For each node, add the node name to array. And all all its children to queue. Repeat this util queue becomes empty.
```
