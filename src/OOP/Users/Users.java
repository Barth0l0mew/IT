package OOP.Users;

import java.util.LinkedList;
import java.util.List;

public class Users {
    public static void main(String[] args) {
        User user = new User("name","lastName");

        System.out.println(user);
        User guest = new Guest("guest","guestlastname");
        System.out.println(guest);
        User admin = new Admin("Admin","adminLastName");
        System.out.println(admin);
        List<User> users = new LinkedList<User>();
        users.add(user);
        users.add(guest);
        users.add(admin);
        //users.stream().forEach(System.out::println);
        users.stream().forEach(el->System.out.print(el));
    }
}

