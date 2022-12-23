package loops;

import inheritance.Person;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * This class contains all for loop examples.
 * Every for loop has an own and unique way
 * of using it and every loop is designed to
 * solve another type of problem.
 */
public final class ForLoopExample {

    /**
     * The example method of the ForLoopExample class.
     * This method demonstrates the different for-loops.
     */
    public void example() {
        int ageCompleteOne = 0;
        AtomicInteger ageCompleteTwo = new AtomicInteger();
        final ArrayList<Person> list = new ArrayList<Person>();
        for (int i = 0; i < 15; i++) {
            list.add(new Person("Person" + i, i));
        }

        for(Person person : list) {
            ageCompleteOne += person.getAge();
        }

        list.forEach(person -> ageCompleteTwo.addAndGet(person.getAge()));
    }
}
