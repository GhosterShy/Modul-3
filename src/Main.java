//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;
import java.util.List;

class User {
    private String name;
    private String email;
    private String role;

    public User(String name, String email, String role) {
        this.name = name;
        this.email = email;
        this.role = role;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{name='" + name + "', email='" + email + "', role='" + role + "'}";
    }
}


//2. Класс UserManager для управления пользователями
//Класс UserManager будет управлять коллекцией пользователей и предоставлять методы для добавления, удаления и обновления информации о пользователях.

class UserManager {
    private List<User> users;

    public UserManager() {
        users = new ArrayList<>();
    }

    // Метод для добавления пользователя
    public void addUser(User user) {
        users.add(user);
    }

    // Метод для удаления пользователя по email
    public void removeUser(String email) {
        users.removeIf(user -> user.getEmail().equals(email));
    }

    // Метод для обновления информации о пользователе
    public void updateUser(String email, String newName, String newRole) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                user.setName(newName);
                user.setRole(newRole);
                break;
            }
        }
    }

    // Метод для вывода всех пользователей
    public void displayUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();


        userManager.addUser(new User("John Doe", "john@example.com", "Admin"));
        userManager.addUser(new User("Jane Smith", "jane@example.com", "User"));


        userManager.updateUser("jane@example.com", "Jane Doe", "Admin");


        userManager.removeUser("john@example.com");


        userManager.displayUsers();
    }
}
