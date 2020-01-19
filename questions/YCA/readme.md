## :two: Youngest Common Ancestor

#### Question

You're given three inputs, all of which are instances of a class that have an "ancestor" property pointing to their youngest ancestor. The first input is the top ancestor in an ancestral tree (i.e., the only instance that has no ancestor), and the other two inputs are descendants in the ancestral tree. Write a function that returns the youngest common ancestor to the two descendants.

#### Example

```
          A
        /    \
       B       C
     /   \   /  \
    D     E  F    G
  /  \
 H    I

Node A, Node E, Node I
> Node B
```

#### Solution

1. Best Solution - `O(2d) ~ O(d)`

```
Traverse from one of the decedents to top, storing each node in a hash-set. Now traverse second, if the node is in the node, walla!!!. That's the youngest ancestor.
```

​

​

​
