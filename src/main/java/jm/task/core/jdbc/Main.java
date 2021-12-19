package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Tom", "Dick", (byte) 20);
        System.out.println("User с именем – Tom добавлен в базу данных");
        userService.saveUser("John", "Pussy", (byte) 30);
        System.out.println("User с именем – John добавлен в базу данных");
        userService.saveUser("Kate", "Morison", (byte) 23);
        System.out.println("User с именем – Kate добавлен в базу данных");
        userService.saveUser("Helen", "Bon", (byte) 41);
        System.out.println("User с именем – Helen добавлен в базу данных");

        List<User> userList = userService.getAllUsers();
        for (User user : userList) {
            System.out.println(user);
        }

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}