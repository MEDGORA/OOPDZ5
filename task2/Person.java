package task2;

import java.util.ArrayList;
import java.util.Objects;

public class Person {

    private String name;
    private String surname;
    private Integer age;
    private Integer number;
    public static ArrayList<Person> arrayOfPersons = new ArrayList<>();
    Person(String personName, String personSurname, Integer personAge, Integer personNumber){
        this.name = personName;
        this.surname = personSurname;
        this.age = personAge;
        this.number = personNumber;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname(){
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge(){
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getNumber(){
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getFullName(){
        return "[Имя: " + name + ", Фамилия: " + surname + "]";
    }

    public String toString(){
        return "[Имя: " + name + ", Фамилия: " + surname + ", Возраст:" + age + ", Пол: " + number + "]";
    }


    public int hashCode(){
        return Objects.hash(name, surname, age, number);
    }

}
