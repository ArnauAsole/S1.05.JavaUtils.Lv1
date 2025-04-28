# ➡🅰🅱©... Exercise Description

The goal of this exercise is to create a Java program that lists the contents of a directory in alphabetical order. The directory path is provided as a parameter. The program should be run from the command line, and you should compile Java source files (.java) into bytecode files (.class) and then execute them from the command line.

### ✅ What You Must Implement

#### 🔹 DirectoryLister Class
- Create a class `DirectoryLister` that:
  - Accepts a directory path as a command-line argument.
  - Lists all the files and subdirectories in the given directory.
  - Sorts the contents alphabetically by name.
  - Prints the sorted list to the console.

#### 🔹 Command Line Execution
- The program should be executed from the command line (not just from an IDE).
- The class should accept the directory path as an argument and list the contents of the directory.
  
### 📝 Example Usage

1. To compile and run the program, use the following commands in the command line:

```bash
# Compile the Java source file into bytecode
javac DirectoryLister.java

# Run the program with a directory path as an argument
java DirectoryLister <directory-path>
The output will be a list of files and subdirectories within the specified directory, sorted alphabetically.

💻 Technologies Used
Java 17

IntelliJ IDEA or Eclipse

Maven or Gradle (optional, if you use them)

Git & GitHub

📋 Prerequisites
To run this project, you will need:

Java JDK 17

IntelliJ IDEA or Eclipse

Git Bash or compatible terminal

GitHub account (optional for version control)

🛠️ Installation and Setup
1. Install Required Tools
Java JDK 17: Download and Install Java JDK

IntelliJ IDEA or Eclipse: Choose your preferred IDE for development.

Git Bash or any compatible terminal to run commands.

2. Clone the Repository (Optional)
If you'd like to use version control and clone the repository, you can do so with Git:

bash
Copiar
Editar
git clone https://github.com/ArnauAsole/S1.05.JavaUtils.Lv1.Ex1.git
cd directory-lister-java
3. Open the Project
Open the project folder in IntelliJ IDEA or Eclipse:

IntelliJ IDEA: Go to File → Open and select the project directory.

Eclipse: Go to File → Import → Existing Projects into Workspace, and select the project directory.

📜 Commands to Compile and Run
1. Compile the Java Program
In the command line, navigate to the directory where the DirectoryLister.java file is located and run:

bash
Copiar
Editar
javac DirectoryLister.java
This will generate the DirectoryLister.class file (the bytecode version of the program).

2. Run the Program
To run the program, use the following command in the terminal, replacing <directory-path> with the path of the directory you want to list:

bash
Copiar
Editar
java DirectoryLister <directory-path>
For example:

bash
Copiar
Editar
java DirectoryLister C:\Users\YourUsername\Documents
The program will display the contents of the specified directory, sorted alphabetically.

🌐 Deployment
This is a command-line-based Java application that runs locally in your terminal or IDE. There is no need for deployment to a server or external environment.

🤝 Acknowledgements
Special thanks to Adria,Ignasi,Ana,Alejandro,Marina for developing this exercise and contributing to the implementation.
