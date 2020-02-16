![Java_Array_Banner](https://4.bp.blogspot.com/-fGV2mXZzqO4/XAi1L30YqYI/AAAAAAAAAFQ/uhSjFjhk32kj-n046tUpTm_hrDirvjI5QCLcBGAs/s1600/main-qimg-2f33c8b7fa65dd0ed75120404d878e42.png)

# Java Arrays

An array is a container that holds data (values) of one single type. For example, you can create an array that can hold 100 values of int type.

Array is a fundamental construct in Java that allows you to store and access large number of values conveniently.

How to declare an array?
Here's how you can declare an array in Java:
```
dataType[] arrayName;
```
dataType can be a primitive data type like: int, char, Double, byte etc. or an object (will be discussed in later chapters).
arrayName is an identifier.
Let's take the above example again.
```
double[] data;
```
Here, data is an array that can hold values of type Double.

But, how many elements can array this hold?

We haven't defined it yet. The next step is to allocate memory for array elements.
```
data = new Double[10];
```
The length of data array is 10. Meaning, it can hold 10 elements (10 Double values in this case).

Note, once the length of the array is defined, it cannot be changed in the program.

Let's take another example:
```
int[] age;
age = new int[5];
```
Here, age array can hold 5 values of type int.

It's possible to declare and allocate memory of an array in one statement. You can replace two statements above with a single statement.
```
int[] age = new int[5];
```

Let's take an example for Demonstration:
```
class ArrayForEach
{
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};

        for (int i : a) {
            System.out.println(i);
        }
    }
}
```
Output:
```
1
2
3
4
5
```

![Java_ForEach_FlowChart](https://media.geeksforgeeks.org/wp-content/uploads/foreachloop-1.jpg)

# Java ForEach Loop

Java provides a new method forEach() to iterate the elements. It is defined in Iterable and Stream interface. It is a default method defined in the Iterable interface. Collection classes which extends Iterable interface can use forEach loop to iterate elements.

This method takes a single parameter which is a functional interface. So, you can pass lambda expression as an argument.

