package com.food.delivery.service;

import org.springframework.stereotype.Service;

import com.food.delivery.model.User;
import com.food.delivery.view.Login;

@Service
public interface UserService {

	void addUser(User user);

	User login(Login login);

}
