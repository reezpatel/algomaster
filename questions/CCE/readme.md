
## :2: Caesar Cipher Encryptor

#### Question​

Given a non-empty string of lowercase letters and a non-negative integer value representing a key, write a function that returns a new string obtained by shifting every letter in the input string by k positions in the alphabet, where k is the key. Note that letters should "wrap" around the alphabet; in other words, the letter "z" shifted by 1 returns the letter "a".

#### Example

```
"xyz", 2
> "zab"
```

#### Solution

1. Best Solution - `O(n)`

```
For each element perform following function, for each character ch on string
'a' + (ch - 'a' + key) % 26
```


​

​
