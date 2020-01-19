​

## :four: Longest Palindromic Substring

#### Question

Write a function that, given a string, returns its longest palindromic substring. A palindrome is defined as a string that is written the same forward and backward. Assume that there will only be one longest palindromic substring.

#### Example

```​
"abaxyzzyxf"
> "xyzzyx"
```

#### Solution

1. Best Solution - `O(n^2)`

```
Palindrome is a string that is symmetrical with respect to its center, which can either be a character (in the case of odd-length palindromes) or an empty string (in the case of even-length palindromes). Thus, you can check the palindromicity of a string by simply expanding from its center and making sure that characters on both sides are indeed mirrored.
```
