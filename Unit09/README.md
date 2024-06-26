# Unit 9 - Inheritance

## 9.1 - Creating Superclasses and Subclasses

Learned about the `super` keyword and its handling with private and public variables. Learned how it won't mess with privates.

## 9.2 - Writing Constructors for Subclasses

Nothing new here its just the same as normal constructors etc. and you have to use `super()` for inheritance to work or Java will add it in for you.

## 9.3 - Overriding Methods

Just basically redifine the method

Parent class:

```Java
Integer getCount() {
    return this.count;
}
```

Child class:

```Java
Integer getCount() {
    return this.count+100;
}
```

## 9.4 - super Keyword

Basically just references the inherited class think of it like the this keyword but for the upper inheritance. You can acess public endpoints exposed from the parent class

Parent class:

```Java
public Parent {

    private static int a;

    public Parent(int x) {
        a = x;
    }

    public int getA() {
        return a;
    }
}
```

Child class:

```Java
public Child {

    public Child(int x) {
        super(x);
    }

    public int getA() {
        System.out.println("Hello World!");
        return super.getA();
    }
}
```

## 9.5 - Creating References Using Inheritance Hierarchies

Big take aways from this lesson is `general = specific` but `specific != general`.

## 9.6 - Polymorphism

Polymorphism is pretty easy me and you went over it a while ago. Just changing a function in a subclass.

Parent:

```Java
public class Parent {
    private int a = 5;

    public int getInt() {
        return a;
    }
}
```

Child:

```Java
public class Child {
    public int getInt() {
        System.out.println("No ima do my own thing!");
        return 102012054;
    }
}
```

## 9.7 - Object Superclass

Nothing hard here either I learned further about the principles of using polymorphism and if we should use instanceof at all and did some further research on that with you. [See scratch file](../Scratch.java)
