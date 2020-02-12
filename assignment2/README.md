![Java_Custom Exception](https://i1.wp.com/gopaldas.org/wp-content/uploads/2015/09/my-custom-exception-java.gif?fit=236%2C200)

# Java Custom Exception

If you are creating your own Exception that is known as custom exception or user-defined exception. Java custom exceptions are used to customize the exception according to user need.

By the help of custom exception, you can have your own exception and message.

Let's see a simple example of java custom exception.

```
public class MeroException extends Exception 
{
    public MeroException(String s)
    {
        super(s);  
    }
}
```
Now lets test the exception,

```
class Test
{
    static void ReserveName(String name) throws MeroException
    {
        if(name == "aadim")
        {
            throw new MeroException("NameIsReserved");
        }else{
            System.out.println("You can use this name.");
        }
    }

    public static void main(String[] args) {
        try {
           ReserveName("aadim");
        } 
        catch (MeroException e) {
            System.out.println("You cannot reserve this name. " + e);
        }
    }
    
}
```

Output:
```
You cannot reserve this name. MeroException: NameIsReserved
```