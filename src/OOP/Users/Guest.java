package OOP.Users;

class Guest extends User {


    public Guest(String name, String lastName) {
        super(name, lastName);
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
