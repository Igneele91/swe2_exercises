package ch.juventus.object;

public class Address {
    private String street;
    private int number;

    public Address(String street, int number) {
        this.street = street;
        this.number = number;
    }

    @Override
    public String toString() {
        return "Straße " + street + ", Nummer " + number;
    }
}
