📁 S1.05.JavaUtils.Lv1
📂📄 File Utilities System – Directory and File Operations

🧾 Exercise Description
The goal of this set of exercises is to build a basic Java file utility system that performs common directory and file operations. You will progressively implement functionality including directory listing, recursive traversal, saving data to text files, reading file contents, and object serialization.

✅ Requirements
Level 1 Exercises
Exercise 1
Create a class that receives a directory path as a parameter and lists its contents alphabetically.

Exercise 2
Extend the previous class to recursively list a full directory tree. For each file or folder, print:

Whether it is a Directory (D) or a File (F)

The last modification date

List everything in alphabetical order per level

Exercise 3
Modify the recursive directory tree from Exercise 2 so the results are written to a .txt file instead of the console.

Exercise 4
Add functionality to read any .txt file and print its contents to the console.

Exercise 5
Implement object serialization:

Serialize a Java object into a .ser file

Then deserialize it from that file and display its contents

🔨 Methods Implemented
java

// DirectoryLister.java
listDirectoryAlphabetically(String path)

// DirectoryTreeLister.java
listTree(String path, String indent)

// DirectoryTreeToFile.java
writeTreeToFile(File dir, String indent, BufferedWriter writer)

// TxtFileReader.java
readFile(String path)

// ObjectSerializationExample.java
serializeObject(Object obj, String filename)
deserializeObject(String filename)
💻 Technologies Used
Java 17

IntelliJ IDEA (Community Edition)

No third-party libraries required

JUnit 5 (optional for test coverage)

📋 Prerequisites
Java JDK 17 installed

IntelliJ IDEA Community Edition

Git (optional, for version control)

🛠️ Installation and Setup
Install Required Tools

Java JDK 17

IntelliJ IDEA Community Edition

Clone the Repository (Optional)

bash
```
git clone https://github.com/ArnauAsole/S1.05.JavaUtils.Lv1.git
cd S1.05.JavaUtils.Lv1/
```

Open the Project in IntelliJ

Go to File → Open and select the root folder of the project.

▶️ Running the Project
To run a specific exercise:

Open the corresponding .java file (e.g., DirectoryTreeToFile.java)

Right-click the file and select Run

You will see the program output in the console or as a generated file

🌐 Deployment
This is a console-based Java utility project meant for local execution in your IDE. No deployment is required.

🤝 Acknowledgements
Special thanks to the contributors:
Arnau, Adrià, Ignasi, Ana, Alejandro
