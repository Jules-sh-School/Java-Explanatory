package inheritance;

import java.util.Date;

/**
 * Model to represent a single Person in
 * this Project
 */
public class Person {
    private String name;

    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public final String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
