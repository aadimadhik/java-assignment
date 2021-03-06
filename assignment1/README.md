![java_logo](https://www.logolynx.com/images/logolynx/3a/3a732a857b97fcdb9ed3fe1197b09a76.png)

# Java Default Methods

Java provides a facility to create default methods inside the interface. Methods which are defined inside the interface and tagged with default are known as default methods. These methods are non-abstract methods.

## Java Default Method Example
In the following example, Sayable is a functional interface that contains a default and an abstract method. The concept of default method is used to define a method with default implementation. You can override default method also to provide more specific implementation for the method

Let's see a small example,

```
interface Sayable{  
    // Default method   
    default void say(){  
        System.out.println("Hello, this is default method");  
    }  
    // Abstract method  
    void sayMore(String msg);  
}  
public class DefaultMethods implements Sayable{  
    public void sayMore(String msg){        // implementing abstract method   
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        DefaultMethods dm = new DefaultMethods();  
        dm.say();   // calling default method  
        dm.sayMore("Work is worship");  // calling abstract method  
  
    }  
}
```

**Output:**
```
Hello, this is default method
Work is worship
```