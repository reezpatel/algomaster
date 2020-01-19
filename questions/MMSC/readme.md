## :two: Min Max Stack Construction

#### Question

Write a Min Max Stack class. The class should support pushing and popping values on and off the stack, peeking at values at the top of the stack, and getting both the minimum and the maximum values in the stack. All class methods, when considered independently, should run in constant time and with constant space.
​

#### Example

```
push(5)
getMin()
getMax()
peek()
push(7)
getMin()
getMax()
peek()
push(2)
getMin()
getMax()
peek()
pop()
pop()
getMin()
getMax()
peek()


> (push 5)
> 5 (min)
> 5 (max)
> 5 (peek)
> (push 7)
> 5 (min)
> 7 (max)
> 7 (peek)
> (push 2)
> 2 (min)
> 7 (max)
> 2 (peek)
> 2 (pop)
> 7 (pop)
> 5 (min)
> 5 (max)
> 5 (peek)
```

#### Solution

1. Best Solution - `O(1)`

```
Implement stack with constant time. For min and max, implement min and max array, when a value is inserted calculate new min and max. When element is removed, delete the min / max entry too.
```

​

​

​
