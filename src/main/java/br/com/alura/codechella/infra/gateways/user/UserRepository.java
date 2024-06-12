package br.com.alura.codechella.infra.gateways.user;

import br.com.alura.codechella.application.gateways.user.UserRepositoryInterface;
import br.com.alura.codechella.domain.entities.user.User;
import br.com.alura.codechella.infra.persistence.user.JpaUserRepository;
import br.com.alura.codechella.infra.persistence.user.UserEntity;

import java.util.List;
import java.util.stream.Collectors;

public class UserRepository implements UserRepositoryInterface {
    private final JpaUserRepository jpaUserRepository;
    private final UserEntityMapper userEntityMapper;

    public UserRepository(JpaUserRepository jpaUserRepository, UserEntityMapper userEntityMapper) {
        this.jpaUserRepository = jpaUserRepository;
        this.userEntityMapper = userEntityMapper;
    }

    @Override
    public User createUser(User user) {
        UserEntity userEntity = this.userEntityMapper.toEntity(user);
        this.jpaUserRepository.save(userEntity);

        return this.userEntityMapper.toDomain(userEntity);
    }

    @Override
    public List<User> listAllUsers() {
        return jpaUserRepository.findAll().stream()
                .map(user -> this.userEntityMapper.toDomain(user))
                .collect(Collectors.toList());
    }
}
