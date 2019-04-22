package com.food.delivery.service;

import com.food.delivery.model.User;
import com.food.delivery.view.Login;

public interface UserService {

	void addUser(User user);

	User login(Login login);

}
