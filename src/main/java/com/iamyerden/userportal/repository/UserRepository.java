package com.iamyerden.userportal.repository;

import org.springframework.data.repository.Repository;
import com.iamyerden.userportal.User;

import java.util.List;

public interface UserRepository extends Repository<User, Integer> {

    void delete(User user);

    List<User> findAll();

    User findById(int id);

    User save(User user);
}