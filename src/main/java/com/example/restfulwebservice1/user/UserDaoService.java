package com.example.restfulwebservice1.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class UserDaoService {
    private static List<Userr> users = new ArrayList<>();

    private static int userCount = 3;

    static {
        users.add(new Userr(1, "Coco", new Date(), "password1", "991102-1234567"));
        users.add(new Userr(2, "David", new Date(), "password2", "991103-1234568"));
        users.add(new Userr(3, "Cheese", new Date(), "password3", "991104-1234569"));
    }

    public List<Userr> findAll() {
        return users;
    }

    public Userr save(Userr user) {
        if (user.getId() == null) {
            user.setId(++userCount);
        }
        users.add(user);
        return user;
    }

    public Userr findOne(int id) {
        for (Userr user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    public Userr deleteById(int id) {
        Iterator<Userr> iterator = users.iterator();
        while (iterator.hasNext()) {
            Userr user = iterator.next();
            if (user.getId() == id) {
                iterator.remove();
                return user;
            }
        }
        return null;
    }

    public Userr modify(Userr user, String name) {
        for (Userr changeUser : users) {
            if (changeUser.getId() == user.getId()) {
                changeUser.setName(name);
                return changeUser;
            }
        }
        return null;
    }
}
