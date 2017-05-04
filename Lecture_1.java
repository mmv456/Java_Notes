
/*
 * DATA DEFINITIONS IN JAVA
 * design of simple classes and classes that contain objects in another class
 */



/* Representing Information by Structured Data:
 * 
 * - Humans work with information, but computers work with data
 * - Data is a representation of the information relevant for the computation
 * -          Data = 2015        Information = two-thousand-five-hundred-ten
 * 
 */

// --------------------------------------------------------------------------------

// Types of Data in Java

// 1. Booleans
class Booleans {
        boolean isDaytime = true;      // can only be true or false
        boolean inNewYork = false;
}

// 2. Strings
class Strings {
        String courseName = "Fundies II";
}

// 3. Numbers
class Numbers {
        int ten = 10;            // integers are written as int
        double pointSix = 0.6;   // decimal numbers are written as double
}

// 4. Symbols and Images
//     There are no forms for data for symbols and images
//     Images are not built-in, but we will talk abouth them later

//--------------------------------------------------------------------------------

/*
 * Classes of Data
 * 
 *  If information consists of several components, it should be represented by a structure
 *  We can represent compound data with CLASSES
 *  
 *  We can visualize them through diagrams:
 *  
+---------------+
| Book          |
+---------------+
| String title  |
| Author author |--+                  // Author is not a simple data type, and it
| Number price  |  |                  // has information of several components, so 
+---------------+  |                  // you can define it as another class
                   v
            +-------------+          
            | Author      |           // Here it is, defined in its separate class
            +-------------+
            | String name |
            | Number yob  |
            +-------------+
 * 
 * 
 * 
 * 
 * The Java definitions of these class are below:
 */

// to represent a book in a bookstore
class Book {
  String title;
  Author author;
  int price;
  
  // the constructor
  Book(String title, Author author, int price) {     // this is a constructor for the class;
    this.title = title;                              // it includes the name of the class, followed by a 
    this.author = author;                            // parenthesized list of argument types and names
    this.price = price;                              // a block of initialization statements:
  }                                                  // this.fieldname = argumentname;
}                                                    // that initialize the fields of the object to the 
                                                     // provided values

// to represent an author of a book in a bookstroe
class Author {
  String name;
  int yob;
  
  // the constructor
  Author(String name, int yob) {
    this.name = name;                            // the "this" keyword used in the initialization sattement
    this.yob = yob;                              // indicates which object is being initialized:
  }                                              // THIS one, and not some other one
}

//--------------------------------------------------------------------------------

// NAMING CONVENTION: class names in Java are written in TitleCase and field names are written in camelCase.
// Primitive type names like int and boolean are lowercase

// QUESTION: Why do you think String is capitalized?
// => Because String has its own built-in class; and all class names are capital

//--------------------------------------------------------------------------------

/*
 * Examples of Data
 * 
 * We defined classes (specifically of Book and Author), but now we should define examples of
 * Books and Authors.
 * 
 * For terminology, we say we create INSTANCES of these classes, and these instances are known as OBJECTS.
 * 
 * All identifiers (examples) must be defined within classes
 * 
 * This means we define a new class to demonstrate examples of our data. 
 * Name the class ExamplesSOMETHING
 * 
 */

// examples and tests for the classes that represent Books and Authors
class ExamplesBooks {
  Author mike = new Author("Mike Wazowski", 1998);
  Book monsters = new Book("Monsters Inc.", this.mike, 25);
}

/* 
 * 
 */













