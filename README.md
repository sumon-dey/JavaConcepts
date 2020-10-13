## JavaConcepts

[![Open Source Love svg3](https://badges.frapsoft.com/os/v3/open-source.svg?v=103 "Open Source Love")]
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg?style=for-the-badge "Apache License")][license]

### Usage :running:

### Introduction:
This is a repository consisting of code and important information on most of the Core Java Language Features and Standard Class Libraries, ranging from basic data types to advanced topics. 

---

### Supported JDK Version
The Java features upto JDK9 have been covered. Preferred JDK versions to use - **_JDK8_** or **_JDK9_**.

---

### Concepts Covered and Recommended Study Sequence
* Keywords
* DataTypes
* Arguments
* Arrays
* Operators
* ControlStatements
* Loops
* StringHandling
* ClassesAndObjects
* Methods
* Interfaces
* PackagesAndAccessModifiers(1 and 2)
* Enacapsulation
* Inheritance
* Polymorphism
* Abstraction
* Composition
* Annotation
* TypeWrappers
* Generics
* Collection
* DataFormats
* Enums
* ExceptionHandling
* IOAndSerialization
* Reflections
* MultithreadingAndConcurrency
* Lambdas
* StreamsAndFilters
* Runtime
* SystemAndCompiler
* Networking
* Miscellaneous
* UnitTesting
* Utilities
* JavaFX

---

### Example
`for` loop in Java
```java
void forLoop() {
		System.out.println("Enter the number till which you want the multiplication table of 2: ");
		int number = scanner.nextInt();
		scanner.nextLine();
		for (int i = 1; i <= number; i++) {
			System.out.println("2 times " + i + " is: " + (i * 2));
		}
		System.out.println("***************************************************************");
	}
```
---

### Setup & Tools
* Gradle
* Java SDK
* Eclipse
* Set Environment variables      
    * JAVA_HOME: Pointing to the Java SDK folder\bin
    * GRADLE_HOME: Pointing to Gradle directory\bin.

---
	
### Getting Started
```sh
$ git clone 
$ cd 
$ import project from Eclipse as a gradle project
$ gradle clean build
```
---

### Built With

* [Gradle](https://gradle.org/) - Dependency Management

---

### Authors

* **Sumon Dey** - *Initial work* - [sumon-dey](https://github.com/sumon-dey "Sumon Dey") 

>Keep Smiling and Practice Hard 

[license]: https://opensource.org/licenses/Apache-2.0



