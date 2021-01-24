# java-8
java-8 features
## Features
Lambda expressions,
Method references,
Functional interfaces,
Stream API,
etc.

### Lambda Expression 
A lambda expression is a short block of code which takes in parameters and returns a value.

The Lambda expression is used to provide the implementation of an interface which has functional interface. 
It saves a lot of code. In case of lambda expression, we don't need to define the method again for providing the implementation. 
Here, we just write the implementation code.

Java lambda expression is treated as a function, so compiler does not create .class file.

### Functional Interface
Lambda expression provides implementation of functional interface. 
An interface which has only one abstract method is called functional interface. 
Java provides an annotation @FunctionalInterface, which is used to declare an interface as functional interface.

### Used Lambda Expression 
To provide the implementation of Functional interface.
Less coding.

Java Lambda Expression Syntax

(argument-list) -> {body}  

Java lambda expression is consisted of three components.

1) Argument-list: It can be empty or non-empty as well.

2) Arrow-token: It is used to link arguments-list and body of expression.

3) Body: It contains expressions and statements for lambda expression.


No Parameter Syntax

() -> {  
//Body of no parameter lambda  
}  

One Parameter Syntax

(p1) -> {  
//Body of single parameter lambda  
}  


Two Parameter Syntax

(p1,p2) -> {  
//Body of multiple parameter lambda  
}  


