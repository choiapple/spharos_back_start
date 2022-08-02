package com.studybusan.mvc.user.service;

import com.studybusan.mvc.user.model.User;

import java.util.List;

public interface IUserService {

    User addUser(User user);

    List<User> getAll();
}
