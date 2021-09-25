import java.lang.reflect.Array;
import java.util.Arrays;

public class PersArray {
    public static void main(String[] args) {
        Person[] persArray = new Person[4];
        persArray[0] = new Person("Виктор", "der@", 34);
        persArray[1] = new Person("Антон", "der@", 45);
        persArray[2] = new Person("Александр", "der@", 55);
        persArray[3] = new Person("Андрей", "der@", 22);


        System.out.println(persArray[0]);
        for (Person person : persArray) {
            if (person.age > 40) {
                person.info();
            }
        }
    }


}