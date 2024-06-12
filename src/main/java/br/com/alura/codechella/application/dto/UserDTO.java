package br.com.alura.codechella.application.dto;

import java.time.LocalDate;

public record UserDTO(
         String cpf,
         String name,
         LocalDate birthDate,
         String email
) {

}
