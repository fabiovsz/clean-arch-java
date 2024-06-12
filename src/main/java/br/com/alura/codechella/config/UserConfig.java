package br.com.alura.codechella.config;

import br.com.alura.codechella.application.gateways.user.UserRepositoryInterface;
import br.com.alura.codechella.application.usecases.user.CreateUserUseCase;
import br.com.alura.codechella.application.usecases.user.ListAllUsersUseCase;
import br.com.alura.codechella.infra.gateways.user.UserEntityMapper;
import br.com.alura.codechella.infra.gateways.user.UserRepository;
import br.com.alura.codechella.infra.persistence.user.JpaUserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    CreateUserUseCase returnCreateUserUseCase(UserRepositoryInterface userRepository) {
        return new CreateUserUseCase(userRepository);
    }

    @Bean
    ListAllUsersUseCase returnListAllUsersUseCase(UserRepositoryInterface userRepository) {
        return new ListAllUsersUseCase(userRepository);
    }

    @Bean
    UserRepository returnJpaUserMapper(JpaUserRepository jpaUserRepository, UserEntityMapper userEntityMapper) {
        return new UserRepository(jpaUserRepository, userEntityMapper);
    }

    @Bean
    UserEntityMapper returnUserEntityMapper() {
        return new UserEntityMapper();
    }
}