# Arrays

> Definition: A collection of items. Those items can be anything (integers, floating numbers, strings, any data).

## Resources

- [Arrays - LeetCode](https://leetcode.com/explore/featured/card/fun-with-arrays/521/introduction/3221/)

## Create an Array

```bash
DATA_TYPE[] identifier = new DATA_TYPE[size];
```

- Is necessary to specify the size on creation.
- Default array values depends on which type, can be `null`, `false`, `0`.
- To write/read an array is commonly with FOR Loops.
- To specify the capacity of an array is used: `length method`.
- `ArrayIndexOutOfBoundsException` is a common error when it tries to access an index that doesn't exist in an Array.
- `for each loop` is a more elegant way to write `for loops`, but it's only used when the programmer doesn't need the index, otherwise, it must use the convetional for loops to code.
