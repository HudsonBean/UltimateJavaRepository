# 1.5 Casting and Ranges of Variables

# Primitive vs. Wrapper class data types

A primitive data type:
`int a = 5;`
A Wrapper class data type:
`Integer a = 5;`

The difference between these class types and primitive data types, is the primitive data types have less memory footrprint but dont have methods attached to them like `getClass()`.

```
double x = 4.5;

int y = (int) x * 2;

System.out.print(y);

```

This function would convert x to int first making 4.5 round down to 4.

# Parse func

Learned about things like Integer.parseInt()
