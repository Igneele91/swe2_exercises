package ch.juventus.object;

public class Application {
    public static void main(String[] args) {
        Address address = new Address("Rötelsteig", 6);
        Person person = new Person("Linda", "Krüger", address);
        System.out.println(person);
    }
}
