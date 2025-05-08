package Ex5;

import java.io.*;

class Person implements Serializable {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ObjectSerializationExample {
    public static void main(String[] args) {
        Person person = new Person("Alice", 25);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("person.ser"))) {
            oos.writeObject(person);
            System.out.println("Person serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("person.ser"))) {
            Person loaded = (Person) ois.readObject();
            System.out.println("Person deserialized: " + loaded.name + ", age " + loaded.age);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}