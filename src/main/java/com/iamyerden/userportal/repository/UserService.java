package com.iamyerden.userportal.repository;

import com.iamyerden.userportal.User;
import java.util.List;

public interface UserService {
    User create(User user);

    User update(User user);

    List<User> findAll();

    User findById(int id);

    User delete(int id);
}
