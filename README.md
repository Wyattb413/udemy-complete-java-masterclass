# Complete Java Masterclass Notes

[**Udemy Course Link**](https://www.udemy.com/java-the-complete-java-developer-course/learn/v4/content) - https://www.udemy.com/java-the-complete-java-developer-course/learn/v4/content

[**IntelliJ IDEA**](http://www.jetbrains.com/idea/download/#section=linux) - http://www.jetbrains.com/idea/download/#section=linux


## Table of Contents

Lecture Topic | Link
--- | ---
**SECTION 2** | [**Section 2**](#section-2)
Installing Java Development Kit (JDK) For Ubuntu Linux | [Lecture 9](#section-2-lecture-9)
Install and Configure IntelliJ Ubuntu Linux | [Lecture 10](#section-2-lecture-10)
**SECTION 3** | [**Section 3**](#section-3)
Creating Your First Java Project | [Lecture 13](#section-3-lecture-13)
**SECTION 4** | [**Section 4**](#section-4)
What Are Variables? | [Lecture 16](#section-4-lecture-16)
Getting to Know Primitive Data Types - The Bytte, Short, Int and Long | [Lecture 17](#section-4-lecture-17)
Getting to Know Primitive Data Types - Float and Double | [Lecture 18](#section-4-lecture-18)
Getting to Know Primitive Data Types - Char and Boolean | [Lecture 19](#section-4-lecture-19)
Understanding Strings and Finishing Up Primitive Data Types | [Lecture 20](#section-4-lecture-20)
Operators in Java | [Lecture 21](#section-4-lecture-21)
**SECTION 5** | [**Section 5**](#section-5)
Keywords and Expressions | [Lecture 24](#section-5-lecture-24)
Method Overloading | [Lecture 29](#section-5-lecture-29)
**SECTION 6** | [**Section 6**](#section-6)
The Switch Statement | [Lecture 31](#section-6-lecture-31)
The For Statement | [Lecture 32](#section-6-lecture-32)
The While and Do While Statements | [Lecture 33](#section-6-lecture-33)
**SECTION 7** | [**Section 7**](#section-7)
Classes Part 1 | [Lecture 35](#section-7-lecture-35)
Classes Part 2 | [Lecture 36](#section-7-lecture-36)
Constructors Part 1 | [Lecture 37](#section-7-lecture-37)
Constructors Part 2 | [Lecture 38](#section-7-lecture-38)
Inheritance Part 1 | [Lecture 39](#section-7-lecture-39)
Inheritance Part 2 | [Lecture 40](#section-7-lecture-40)
Reference vs Object vs Instance vs Class | [Lecture 41](#section-7-lecture-41)
This vs Super | [Lecture 42](#section-7-lecture-42)


<!-- ################################################################################################################ -->
<!--                                                     SECTION 2                                                    -->
<!-- ################################################################################################################ -->

## SECTION 2

### Section 2 Lecture 9

- **Add The Java Repo** - `sudo add-apt-repository ppa:webupd8team/java`
- **Installing Java Development Kit** - `sudo apt-get install oracle-java8-installer`
- **Update Java Developemnt Kit** - `sudo update-alternatives --config java`
- **Check to Make Sure Install Was Successful** - `java -version`

### Section 2 Lecture 10

- **CD into IntelliJ IDEA DIR > bin** - `cd idea-IU-173.4674.33/bin`
- **Execute idea.sh to launch IntelliJ** - `./idea.sh`

#### Configure IntelliJ

- Click **Configure** > **Project Defaults** > **Project Structure** > Find the installed **Project SDK** > click **ok**
- Click **Configure** > **Settings** > **Editor** > **General** > **Auto Import** and Enable **Add unambiguous imports on the fly** and **Optimize imports on the fly (for current project)** > click **ok**

<!-- ################################################################################################################ -->
<!--                                                     SECTION 3                                                    -->
<!-- ################################################################################################################ -->

## SECTION 3

### Section 3 Lecture 13

- **Hello World**

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
```


<!-- ################################################################################################################ -->
<!--                                                     SECTION 4                                                    -->
<!-- ################################################################################################################ -->

## SECTION 4

### Section 4 Lecture 16

- **Variables**

```java
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int myFirstNumber = (5 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        int myLastOne = 1000 - myTotal;

        System.out.println(myLastOne);
    }
}
```

### Section 4 Lecture 17

#### Notes

- **literal** - A literal is a raw value that is typed such as 1234, rather (a * b) is an **expression**
- **2_147_483_647** - Since Java 7 underscores between number sets is supported
- ``byte`` has a width of **8**
- ``short`` has a width of **16**
- ``int`` has a width of **32**
- ``long`` has a width of **64** and it's value **SHOULD** end with either l (lower case L) or L to signify that it is a ``long``
- ``long`` type supports ``int`` type the following expression does **NOT** require casting:

```java
long myValidLongTotal = 50_000L + 10L * (myValidByteNumber + myValidShortNumber + myValidIntNumber);
```

#### Number Data Types

- **byte** - Used to store value ranging from -128 to 127
- **short** - Used to store value ranging from -32768 to 32767
- **int** - Used to store values ranging from -2147483648 to 2147483647
- **long** - Used to store values ranging from -9_223_372_036_854_775_808L to 9_223_372_036_854_775_807L

```java
package com.byteShortInt;

public class Main {

    public static void main(String[] args) {

        // byte has a width of 8
        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;

        // short has a width of 16
        short myMinShortValue = -32768;
        short myMaxShortValue = -32767;

        // int has a width of 32
        int myMinIntValue = -2_147_483_648;
        int myMaxIntValue = 2_147_483_647;

        // long has a width of 64
        long myMinLongValue = -9_223_372_036_854_775_808L;
        long myMaxLongValue = 9_223_372_036_854_775_807L;
    }
}
```

#### Casting

When trying to perform an expression such as 

```java
int myTotalIntValue = (myMinIntValue/2)
```

Java will convert the values inside the expression to ``int`` by default. When preforming a calculation such as \

```java
byte myTotalByteValue = (myMinByteValue/2)
```

this will result in a hard error as Java is trying to assign a ``int`` value to ``byte`` variable. To get around this, you must tell Java to treat the expression ``(myMinByteValue/2)`` as a ``byte`` like so:

```Java
byte myTotalByteValue = (byte) (myMinByteValue/2);
```

### Section 4 Lecture 18

#### Notes

- Denote ``float`` number like so: ``float myFloatValue = 5.5f`` (you can also use ``(float)`` casting)
- Denote ``double`` number like so: ``double myDoubleValue = 5.5d`` (you can also use ``(double)`` casting)
- The width of `float` is 32 (bytes)
- The width of `double` is 64 (8 bytes)
- You can also put ``_`` in decimals e.g. ``0.453_592_37d``

#### Number Data Types

- **Float** - Used to store numbers up to **7 decimal places**
- **Double** - Used to store numbers up to **16 decimal places**

```java
package com.floatAndDouble;

public class Main {

    public static void main(String[] args) {
        // width of int = 32 (4 bytes)
        int myIntValue = 5 / 3;

        // width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f;

        // width of double = 64 (8 bytes)
        double myDoubleValue = 5d / 3d;
    }
}
```

### Section 4 Lecture 19

#### Notes

- ``char`` has a width of **16 (2 bytes)**

#### Data Types

- **char** - Used to store a single character or unicode character
- **boolean** - Used to store ``true`` or ``false``

```java
package com.charAndBoolean;

public class Main {

    public static void main(String[] args) {
        // width of 16 (2 bytes)
        char myChar= 'A';
        System.out.println("myChar " + myChar);

        // char supports unicode characters using the \u prefix
        char myUnicodeChar= '\u00A9';
        System.out.println("myUnicodeChar " + myUnicodeChar);

        boolean myBoolean = false;
    }
}
```

### Section 4 Lecture 20

```java
package com.strings;

public class Main {

    public static void main(String[] args) {
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        // Outputs: myString is equal to This is a string

        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        // Outputs: myString is equal to This is a string, and this is more.

        myString = myString + " \u00A9 2015";
        System.out.println("myString is equal to " + myString);
        // Outputs: myString is equal to This is a string, and this is more. © 2015

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("The result is " + numberString);
        // Outputs: The result is 250.5549.95

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        // Outputs: LastString is equal to 1050

        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString value: " + lastString);
        // Outputs: LastString value: 1050120.47
    }
}
```

### Section 4 Lecture 21

[**Java Operator Precendence Table**](http://cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html) - http://cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html

![**Java Operator Precendence Table**](images/javaOperatorPrecendenceTable.png)

#### Operators

##### Simple Assignment Operator

- **=** - Simple assignment operator

##### Arithmetic Operators

- **+** - Additive operator (also used for String concatenation)
- **-** - Subtraction operator
- **\*** - Multiplication operator
- **/** - Division operator
- **%** - Remainder operator

##### Unary Operators

- **+** - Unary plus operator; indicates positive value (numbers are positive without this, however)
- **-** - Unary minus operator; negates an expression
- **++** - Increment operator; incrementsa value by 1
- **--** - Decrement operator; decrements a value by 1
- **!** - Logical complement operator; inverts the value of a boolean

##### Equality and Relational Operators

- **==** - Equal to
- **!=** - Not equal to
- **>** - Greater than
- **>=** - Greater than or equal to
- **<** - Less than
- **<=** - Less than or equal to

##### Conditional Operators

- **&&** - Conditional-AND
- **||** - Conditional-OR
- **?:** - Ternary (shorthand for if-then-else statement)

##### Type Comparison Operator

- **instanceof** - Compares an object to a specified type 

##### Bitwise and Bit Shift Operators

- **~** - Unary bitwise complement
- **<<** - Signed left shift
- **>>** - Signed right shift
- **>>>** - Unsigned right shift
- **&** - Bitwise AND
- **^** - Bitwise exclusive OR
- **|** - Bitwise inclusive OR

<!-- ################################################################################################################ -->
<!--                                                     SECTION 5                                                    -->
<!-- ################################################################################################################ -->

## SECTION 5

### Section 5 Lecture 24

[**Java Keywords**](https://en.wikipedia.org/wiki/List_of_Java_keywords) - https://en.wikipedia.org/wiki/List_of_Java_keywords

### Section 5 Lecture 29

Method Overloading allows a class to have more than one method with the same name. The redefined method can have different parameters defined to account for different use cases.

#### Notes

- Chaning the return type of the redefined methods, but not the parameters it takes, will throw hard error as the redefined method is not considered unique

```java
public static void main(String[] args) {
    calculateScore(String "Wyatt", int 420);
    calculateScore(int 420);
    calculateScore();
}

public static int calculateScore(String playerName, int score) {
    System.out.println("Player " + playerName + " scored " + score + " points");
    return score * 1000;
}

public static int calculateScore(int score) {
    System.out.println("Unnamed player scored " + score + " points");
    return score * 1000;
}

public static int calculateScore() {
    System.out.println("No player name, no player score.");
    return 0;
}
```

<!-- ################################################################################################################ -->
<!--                                                     SECTION 6                                                    -->
<!-- ################################################################################################################ -->

## SECTION 6

### Section 6 Lecture 31

#### The Switch Statement

#### Note

- You chain `case`s together to execute the same code for several `case`s:

```java
    int switchValue = 6;

    switch(switchValue) {
        case 1:
            System.out.println("Value was 1");
            break;

        case 2:
            System.out.println("Value was 2");
            break;

        case 3:case 4:case 5:
            System.out.println("was a 3 or a 4, or a 5");
            System.out.println("Actually it was a " + switchValue);
            break;

        default:
            System.out.println("Was not 1,2,3, 4 or 5");
            break;
    }
```

### Section 6 Lecture 32

#### The For Statement

### Note

- The for loop is structured like so: `for (variable; termination; increment)`

```java
    for (int i=2; i <= n/2; i++) {
        if (n % i == 0) {
            return false;
        }
    }
```

### Section 6 Lecture 33

#### The While and Do While Statements

```java
    int count = 6;
    while(count != 6) {
        System.out.println("Count value is " + count);
        count++;
    }

    count = 6;
    do {
        System.out.println("Count value was " + count);
        count++;

        if(count >100) {
            break;
        }

    } while(count != 6);
```

<!-- ################################################################################################################ -->
<!--                                                     SECTION 7                                                    -->
<!-- ################################################################################################################ -->

## SECTION 7

### Section 7 Lecture 35

#### Classes Part 1

#### Notes

- `public` accessor allows classes to call the `public` `method`
- `private` accessor only allows `method`s inside the same `class` to call the `private` `method`
- `protected` accessor only allows `class`es inside the same `package` to call the `method`

### Section 7 Lecture 36

#### Classes Part 2

#### Notes

- `this` reserved word that allows you to reference the `class`es methods and properties from within the `class`
- `properties` defined on a `class` will generally each have theirown `getters` and `setters`


```java
public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model) {
        String lowerCasedModel = model.toLowerCase();

        if (lowerCasedModel.equals("240z") || lowerCasedModel.equals("gti")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}
```

### Section 7 Lecture 37

#### Constructors Part 1

#### Notes

- `contructor`s are used to configure the new instance of a `class` when it's first initialized
- You can have multiple `constructor`s defined in a class

```java
    public BankAccount() {
        this("1234567890",0.0,
                "Default Name","Default Email","Default Phone Number");
    }

    public BankAccount(String accountNumber, double balance, String customerName, String email,
                        String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
```

### Section 7 Lecture 38

#### Constructors Part 2

#### Notes

- `constructor`s can call other `constructor`s (can be used to initialize an instance of a `class` with defaults if an empty instance of the `class` was initialized)

```java
    public VIPCustomer() {
        this("Default Name", 10_000, "No Email Provided");
    }

    public VIPCustomer(String name, String emailAddress) {
        this(name, 10_000, emailAddress);
    }

    public VIPCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }
```

### Section 7 Lecture 39

#### Inheritance Part 1

#### Notes

- `extends` is a reserved word that allows a class to inherit from another `class`
- `super` allows the accessing of `properties` and `method`s that belong to the `parent` `class`

### Section 7 Lecture 40

#### Inheritance Part 2

#### Notes

- `@Override` allows you to `Override` a method defined in the `parent` `class`
- When calling a `method` that exists on the `parent` from the `child`, best practice is to call it without using `super`. This avoids any refactoring if you later decide to `Override` the `parent`'s method inside the `child`, because `super.methodName` will **alway** call the `parent`'s method, even if it was overriden in the `child`

### Section 7 Lecture 41

#### Reference vs Object vs Instance vs Class

#### Notes

- `class` - can be thought of as a blueprint for a building (you can build as many buildings as you want based off the blueprint)
- `instance` - each building built off the blueprint (`class`) is known as an `instance`, the act of creating an `instance` from a `class` is called `instantiating`
- `reference` - each building you build from the blueprint (`class`) has a location (`reference`) that references that specific building
- `reference`s can be passed as `parameter`s to `contructor`s and `method`s

### Section 7 Lecture 42

#### This vs Super

#### Notes

- `super` - is a keyword used to access/call the `parent` `class` members (`variable`s and `method`s)
- `this` - is a keyword used to call the current `class` members (`varible`s and `method`s). `this` is required when we have a `parameter` with the same name as an `instance` `varible`
- `this()` can only be used inside of a `contructor`, and it **must** be the first statement in a `constructor` (it's primairly used in `constructor` chainging - calling one `constructor` from another `constructor`)
- `super()` is used to call the `parent`'s `constructor`
- a default `super()` is added to each `extended` `class` that calls the `parent`'s no-argument `constructor`
- `super()` **must** be the first statement in each `constructor`
- `super` and `this` can be used anywhere in a `class` except for `static` areas
- **IMPORTANT** a `constructor` can have a call to `super()` or `this()`, but it can **NOT** have both