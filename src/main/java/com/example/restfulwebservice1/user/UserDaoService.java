package com.example.restfulwebservice1.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserDaoService {
    private static List<User> users = new ArrayList<>();

    private static int userCount = 3;

    static {
        users.add(new User(1, "Coco", new Date()));
        users.add(new User(2, "David", new Date()));
        users.add(new User(3, "Cheese", new Date()));
    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user) {
        if (user.getId() == null) {
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }

    public User findOne(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }
}
