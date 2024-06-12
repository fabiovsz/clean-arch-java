package br.com.alura.codechella.domain.entities.user;

import br.com.alura.codechella.domain.Address;

import java.time.LocalDate;

public class UserFactory {
    private User user;

    public User userWithNameCpfBirthDate(String name, String cpf, LocalDate birthDate) {
        this.user = new User(cpf, name, birthDate, "");
        return this.user;
    }

    public User insertAddress(String cep, Integer number, String addressDetails) {
        this.user.setAddress(new Address(cep, number, addressDetails));
        return this.user;
    }
}
