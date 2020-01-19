​

## :three: Group Anagrams

#### Question

​
Write a function that takes in an array of strings and returns a list of groups of anagrams. Anagrams are strings made up of exactly the same letters, where order doesn't matter. For example, "cinema" and "iceman" are anagrams; similarly, "foo" and "ofo" are anagrams. Note that the groups of anagrams don't need to be ordered in any particular way.
​

#### Example

```​
["yo", "act", "flop", "tac", "cat", "oy", "olfp"]
> [["yo", "oy"], ["flop", "olfp"], ["act", "tac", "cat"]]
```

#### Solution

1. Best Solution - `O(n*s*log(s))`

```
For each array element, sort the string, if sorted staring is in map, add it to the list. Else, create a new entry, with element inserted in list.
```
