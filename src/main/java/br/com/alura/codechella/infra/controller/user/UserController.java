package br.com.alura.codechella.infra.controller.user;

import br.com.alura.codechella.application.dto.UserDTO;
import br.com.alura.codechella.application.usecases.user.CreateUserUseCase;
import br.com.alura.codechella.application.usecases.user.ListAllUsersUseCase;
import br.com.alura.codechella.domain.entities.user.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {
    private final CreateUserUseCase createUserUseCase;
    private final ListAllUsersUseCase listAllUsersUseCase;

    public UserController(CreateUserUseCase createUserUseCase, ListAllUsersUseCase listAllUsersUseCase) {
        this.createUserUseCase = createUserUseCase;
        this.listAllUsersUseCase = listAllUsersUseCase;
    }

    @PostMapping
    public UserDTO createUser(@RequestBody UserDTO userDTO) {
        var userCreated = this.createUserUseCase.createUser(new User(userDTO.cpf(), userDTO.name(), userDTO.birthDate(), userDTO.email()));
        return new UserDTO(userCreated.getCpf(), userCreated.getName(), userCreated.getBirthDate(), userCreated.getEmail());

    }

    @GetMapping
    public List<UserDTO> listAllUsers() {
        return this.listAllUsersUseCase.ListAllUsers()
                .stream()
                .map(user -> new UserDTO(user.getCpf(), user.getName(), user.getBirthDate(), user.getEmail()))
                .collect(Collectors.toList());
    }
}
