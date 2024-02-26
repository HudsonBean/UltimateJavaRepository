# Unit 05 - Writing Classes

Nothing new here
I did learn at BPA that you can have classes inside of classes though for exmaple:

```java
public class Topic5_1AnatomyOfClass {
    public static void main(String[] args) {

    }
    static class hello {

    }
}
```

Which can be useful if I need to make a quick data structure for something that I don't need all the time in every class.

## 5.1 - Anatomy of a Class

Nothing new here either just learned that I should use privates for all my variables and use getters/setters if I need to change them.

## 5.2 - Constructors

Nothing new here either I did want to ask Mr.S if anything like `__init__` exists in Java as it does in Python.

## 5.3 - Documentation with Comments

Did poorly on this quiz but it was because I struggle with following the logic of coded questions sometimes and I forgot the `-1` on the .length. But I understand having comments for docs and I use vs code snippets to generate my code docs for me in other languages.

## 5.4 - Accessor Methods

Nothing new here I already know how to define methods in a class and how to make getters and setters within Java.

## 5.5 - Mutator Methods

Same thing here nothing new I know about setters and how to affect private variables with them 👍

```java
public class Test {
    private int num;
    public Test(int n) {
        num = n;
    }
    public int getter() {
        return num;
    }
    public void setter(int n) {
        num = n;
    }
}
```

## 5.6 - Writing Methods

Nothing new here I know about writing methods they get cooler when I add the static keyword in but esentially they give functionality to objects for example:

```java
class Car {
    private int mileage;
    public Car() {
        mileage = 0;
    }
    public String Drive(int x) {
        mileage+=x;
        return "You drove: " + x + " miles! Your current mileage is: " + mileage;
    }
}
```

## 5.7 - Static Variables and Methods

Statics are a little bit new but I understand them now. I think of them as like a shared data between the class instances. So for example if we have a class with a `private static int greatestNumber` now throughout all my objects/instances I know what the greatest number is for all of them. I am excieted to see the better use case is in the future.

On the other hand the final keyword just means a variable can only be set once. Pretty easy and self explanatory to understand.

I am not sure if other languages offer things similiar i've uses statics in some C languages but never understood the keyword.

## 5.8 - Scope and Access

## 5.9 - `this` Keyword

## 5.10 - Ethical and Social Implications of Computing Systems
