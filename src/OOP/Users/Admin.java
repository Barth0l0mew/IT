package OOP.Users;

class Admin extends User {

    public Admin(String name, String lastName) {
        super(name, lastName);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
