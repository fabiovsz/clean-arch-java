package br.com.alura.codechella.infra.gateways.user;

import br.com.alura.codechella.domain.entities.user.User;
import br.com.alura.codechella.infra.persistence.user.UserEntity;

public class UserEntityMapper {
    public UserEntity toEntity(User user) {
        return new UserEntity(user.getCpf(), user.getName(), user.getBirthDate(), user.getEmail());
    }

    public User toDomain(UserEntity userEntity) {
        return new User(userEntity.getCpf(), userEntity.getName(), userEntity.getBirthDate(), userEntity.getEmail());
    }
}
