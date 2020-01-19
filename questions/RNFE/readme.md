## :three: Remove Kth Node From End

#### Question

​
Write a function that takes in the head of a Singly Linked List and an integer k (assume that the list has at least k nodes). The function should remove the kth node from the end of the list. Note that every node in the Singly Linked List has a "value" property storing its value as well as a "next" property pointing to the next node in the list or None (null) if it is the tail of the list.
​
​

#### Example

```
0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 9, 4
>  0 -> 1 -> 2 -> 3 -> 4 -> 5 -> 7 -> 8 -> 9
```

#### Solution

1. Best Solution - `O(n + (n-k)) ~ O(n)`

```
Find length of the linked list, by traversing each element. After reaching the end, again traverse to (n - k) node and remove it.
```

​

​

​
