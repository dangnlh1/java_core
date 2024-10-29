package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(25);
        System.out.println("Tuổi ban đầu: " + person.getAge());

        person.setAge(-5);
        System.out.println("Tuổi sau khi thử thay đổi: " + person.getAge());
    }
}