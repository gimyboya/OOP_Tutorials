# try what?catch What?

```java
try{
  //here you try your code
  //but if an error ocure the compiler will jump to the catch block
  // and then ouch.... error
  //why you are still here? take a look at the catch block now
}catch(Exception e){
  //here we can do many things befor our program ends
  System.out.println("you have the following ERROR: " + e.message());
  //for example discribing the error to the user and probably help them fix it..
  //or tirminate your program gracefully behind the scean.
}
```

# Checked VS Unchecked:

## Checked:

checked exceptions are these that you should explicitly catch and they are **checked at compile time** example: `FileNotFoundException`

```java
class Example {  
   public static void main(String args[]) 
   {
	FileInputStream fis = null;
	/*This constructor FileInputStream(File filename)
	 * throws FileNotFoundException which is a checked
	 * exception*/
        fis = new FileInputStream("B:/myfile.txt"); 
		
   }
}
```

Output:

```java
Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
Unhandled exception type FileNotFoundException
  
Error:(17, 15) java: unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown
```

## Unchecked:

Unchecked exceptions are not checked at compile time. It means if your program is throwing an unchecked exception and even if you didn’t handle/declare that exception, the program won’t give a compilation error. Most of the times these exception occurs due to the bad data provided by user during the user-program interaction

```java
class Example {  
   public static void main(String args[])
   {
	int num1=10;
	int num2=0;
	/*Since I'm dividing an integer with 0
	 * it should throw ArithmeticException*/
	int res=num1/num2;
	System.out.println(res);
   }
}
```

If you compile this code, it would compile successfully however when you will run it, it would throw `ArithmeticException`.

most common unchecked exceptions

```java
ArithmeticException
NullPointerException
IndexOutOfBoundsException
IllegalArgumentsException
```


# Throwing Exceptions: 

```java
try{
  boolean enemyAttack = true;
  if(enemyAttack){
    throw new Exception("we are under attack!!");
  }
  
}catch(Exception e){
  System.out.println("ouch ... Okay Boss i am helping people to evacuate" );
  
}
```



#  Catching exceptions:

```java
} catch (InputMismatchException ex) {     
     //do soemthing specefic
 }catch (Exception e){
     //something more general
 }
```

```java
} catch (InputMismatchException, ArithmeticException e) {     
     //handle to types of exceptions here ...Like a boss
 }
```



# Handling an exception:

the catch block is usually used to try to solve the exceptions that happened during the excution of the program example:

```java
Scanner input = new Scanner(System.in);
    boolean continueInput = true;

    do {
      try {
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
  
        // Display the result
        System.out.println(
          "The number entered is " + number);
        
        continueInput = false;
      } 
      catch (InputMismatchException ex) {
        System.out.println("Try again. (" + 
          "Incorrect input: an integer is required)");
        input.nextLine(); // discard input 
      }
    } while (continueInput);
```



# Terminating a program gracefully:

```java
try{
  //there is an error here
}catch(Exception e){
  System.out.println("ouch ... Okay Boss i am saving the files befor the program close" );
  
}
```
# Finally the finally block:

Java finally block is a block that is used to execute **important code** such as closing connection, stream etc.

Java finally block is **always executed** whether exception is handled or not.

so the previous example would look like this with a finally block

```java
try{
  //there is an error here
}catch(Exception e){
  System.out.println("trying hard to solve the problem");
  
}finally{
  System.out.println("Okay Boss i am saving the top-secret files befor the program close" );
}
```