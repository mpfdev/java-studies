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

## Inserting Elements

Elements can be inserted in the beginning, in the end, or at any given index from the array.

1. In the end of the array is simple, since we're keeping track of the `length` of the array.

```java
int[] nums = new int[10];

for(int i = 0; i < 5; i++) {
	nums[i] = i;
}
```

An array with capacity of 10 integers elements is ocuppied with 5 int values. We know that from index 5 and onward is empty (Java allocates 0-value for empty int array)

```java
nums[5] = 5;
```

or

```java
for(int i = 5; i < 6; i++) {
	nums[i] = i;
}
```

2. Insert element in the beginning of the array, and at any given index are both **very costly operations**.

The reason is because is necessary to shift the elements from the index (or from the beginning if the index is 0) one step to the right.

> Linear time complexity: O(n)


Example:

```java
int[] nums = new int[10];

for(int i = 0; i < 5; i++) {
	nums[i] = i + 2;
}

//Now we need to shift the elements one step to the right
//So we can add an element in the beginning of the array

for (int i = 4; i >= 0; i--) {
	nums[i + i] = nums[i];
}

//And now replace the value on index 0.
nums[0] = 30;
```

The same idea above goes from any given index.
