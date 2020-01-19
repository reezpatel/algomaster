## :three: Suffix Trie Construction

#### Question

Write a class for a suffix-trie-like data structure. The class should have a "root" property set to be the root node of the trie. The class should support creation from a string and the searching of strings. The creation method (called populateSuffixTrieFrom()) will be called when the class is instantiated and should populate the "root" property of the class. Note that every string added to the trie should end with the special "endSymbol" character: "\*".

#### Example

```
For creation
"babc"

> {
>   "c": {"*": True},
>   "b": {
>     "c": {"*": True},
>     "a": {"b": {"c": {"*": True}}},
>   },
>   "a": {"b": {"c": {"*": True}}},
> }
```

```
For searching in the suffix trie above:
"abc"
>  True
```

#### Solution

1. Optimal Solution

```
Maintain a hashmap of all substring of the input string.
```
