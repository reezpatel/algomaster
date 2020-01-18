## :six: Levenshtein Distance

#### Question

Write a function that takes in two strings and returns the minimum number of edit operations that need to be performed on the first string to obtain the second string. There are three edit operations: insertion of a character, deletion of a character, and substitution of a character for another.

#### Example

```
"abc" "yabd"
> 2 (insert "y"; substitute "c" for "d")
```

#### Solution

1. Best Solution - `O(mn) ~ O(n^2)`

```
Build up a matrix with rows as empty string followed by each character of string s1, and columns with empty string followed by each character of s2.

let [0][0] = 0, not for each pair of (i, j) => if correcting character are equal -> set value(i, j) to (i-1, j-1).
if they are not equal, set it to 1 + min((i-1, j-1), (i-1, j), (i, j-1))

value at (s1.len, s2.len) is the minimum edit distance.
```

|     |     | a   | b   | c   |
| --- | --- | --- | --- | --- |
|     | 0   | 1   | 2   | 3   |
| y   | 1   | 2   | 2   | 3   |
| a   | 2   | 1   | 2   | 3   |
| b   | 3   | 2   | 1   | 2   |
| d   | 4   | 3   | 2   | 2   |
