package br.com.alura.codechella.application.usecases.user;

import br.com.alura.codechella.application.gateways.user.UserRepositoryInterface;
import br.com.alura.codechella.domain.entities.user.User;

import java.util.List;

public class ListAllUsersUseCase {
    private final UserRepositoryInterface userRepository;

    public ListAllUsersUseCase(UserRepositoryInterface userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> ListAllUsers() {
        return this.userRepository.listAllUsers();
    }
}
