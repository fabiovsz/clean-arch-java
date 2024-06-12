package br.com.alura.codechella.application.gateways.user;

import br.com.alura.codechella.domain.entities.user.User;

import java.util.List;

public interface UserRepositoryInterface {
    User createUser(User user);
    List<User> listAllUsers();
}
