package br.com.alura.codechella.domain.entities.user;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UserTest {
    @Test
    public void shoudNotCreateUserWithIncorrectCpf() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new User("123.456.789-99", "John", LocalDate.parse("2000-09-06"), "john@emal.com"));
    }

    @Test
    public void shouldCreateUserWithUserFactory() {
        UserFactory userFactory = new UserFactory();
        User user = userFactory.userWithNameCpfBirthDate(
                "Luka",
                "234.222.453-31",
                LocalDate.parse("2000-10-01")
        );
        Assertions.assertEquals("Luka", user.getName());

        user = userFactory.insertAddress("34111-03", 222, "house");
        Assertions.assertEquals(222, user.getAddress().getNumber());
    }
}
