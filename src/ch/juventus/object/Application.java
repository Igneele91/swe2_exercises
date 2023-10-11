package ch.juventus.object;

public class Application {
    public static void main(String[] args) {
        Address address1 = new Address("Rötelsteig", 6);
        Person person1 = new Person("Linda", "Krüger", address1);

        Address address2 = new Address("Rötelsteig", 6);
        Person person2 = new Person("Linda", "Krüger", address2);

        System.out.println("Vor equals() & hashCode() Überschreibung:");
        System.out.println("Person 1: " + person1);
        System.out.println("Person 2: " + person2);
        System.out.println("Sind Person 1 und Person 2 gleich? " + person1.equals(person2));
    }
}
