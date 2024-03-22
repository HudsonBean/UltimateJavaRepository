# Unit 7 - `ArrayList`

Learned about ArrayLists; nothing too new about them they are just more powerful arrays.
Did learn that the second "<>" is almost uesless now in current java versions as it is no longer required to fill out compared to past versions.

## 7.1 - Introduction to `ArrayList`

Same thing again did learn about interfaces and implementing the comparable & iterable interface, and I learned how I can make more powerful objects with them.

## 7.2 - `ArrayList` Methods

Nothing new here may be a tid bit confusing when following logic on how `.add(n);` adds to the end but `.add(1, n);` places in the middle and moves other objects' indexes up.

## 7.3 - Traversing `ArrayList`s

Nothing new here this is really just the same as traversing normal arrays.

## 7.4 - Developing Algorithms Using `ArrayList`s

Nothing crazy new here just be careful with logic errors when removing indexes as array lists are dynamic and their indexes can change based on what methods your run.

I did learn about `"double bracket initialization"` which is if you need to quickly generate an array list with basically "initialized values". I put that in quotes because it actually creates an anonymous-subclass that will set the values. This has some downsides but mainly its excessive and cause data leaks maybe only do this if you need to quickly create an ArrayList for demo purposes.

```java
import java.util.ArrayList;

ArrayList<Integer> nums = new ArrayList<>() {{
    add(4);
    add(5);
    add(6);
    remove(5);
}};
// [4, 6]
```

## 7.5 - Searching

Nothing crazy new here again like I stated previously very similiar to searching and sorting arrays.

## 7.6 - Sorting

Nothing crazy new here again like I stated previously very similiar to searching and sorting arrays.

## 7.7 - Ethical Issues Around Data Collection
