package br.com.alura.codechella.application.usecases.user;

import br.com.alura.codechella.application.gateways.user.UserRepositoryInterface;
import br.com.alura.codechella.domain.entities.user.User;

public class CreateUserUseCase {
    private final UserRepositoryInterface userRepository;

    public CreateUserUseCase(UserRepositoryInterface userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.createUser(user);
    }
}
