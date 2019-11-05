## :two: Closet value in BST

#### Question

You are given a BST data structure consisting of BST nodes. Each BST node has an integer value stored in a property called "value" and two children nodes stored in properties called "left" and "right," respectively. A node is said to be a BST node if and only if it satisfies the BST property: its value is strictly greater than the values of every node to its left; its value is less than or equal to the values of every node to its right; and both of its children nodes are either BST nodes themselves or None (null) values. You are also given a target integer value; write a function that finds the closest value to that target value contained in the BST. Assume that there will only be one closest value.

#### Example

```
           10        
       /       \
      5         15
    /    \     /  \
   2      5 13     22
 /                  \
1                    14

12

> 13
```

#### Solution

1. Good Solution - `O(logn)`

```
Traverse the matrix, store closest node, and each node calculate delta of targetSum with current node and saved closest node. 
```

2. Best Solution - `O(logn)`

```
Same as above, just using recursion.
> This solution as better as call stack for function is not created, hence space complexity is O(1), and not O(n)
```