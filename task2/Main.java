package task2;

import java.lang.reflect.Array;

public class Main {
    
    public static void main(String[] args) {


        Person person1 = new Person("Иван", "Лебедев", 57, 123);
        Person person2 = new Person("Тарас", "Лебедев", 32, 228);
        Person.arrayOfPersons.add(person1);
        Person.arrayOfPersons.add(person2);
        
        Save save = new Save();
        save.Save();
    }
}
