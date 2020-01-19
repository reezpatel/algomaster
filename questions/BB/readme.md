​

## :two: Balanced Brackets

#### Question

Write a function that takes in a string made up of brackets `("(", "[", "{", ")", "]", and "}")` and other optional characters. The function should return a boolean representing whether or not the string is balanced in regards to brackets. A string is said to be balanced if it has as many opening brackets of a given type as it has closing brackets of that type and if no bracket is unmatched. Note that a closing bracket cannot match a corresponding opening bracket that comes after it. Similarly, brackets cannot overlap each other as in `"[(])"`.
​

#### Example

```
"([])(){}(())()()"
> True (it is balanced)
```

#### Solution

1. Best Solution - `O(n)`

```
For opening bracket, push it in stack. For closing bracket, pop element from stack, if the brackets make pair continue, else brackets are not balanced. At the end, only if the stack is empty... brackets are balanced.
```
