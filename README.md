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