package org.tutorials.springBootValidation.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private Long id;

    // User first name should not should be or empty
    @NotEmpty(message = "First name should not be or empty")
    private String firstName;

    // User last name should not should be or empty
    @NotEmpty(message = "Last name should not be or empty")
    private String lastName;

    // User email should not should be or empty
    // User email should be a valid email address
    @NotEmpty(message = "Email should not be or empty")
    @Email(message = "Email should be a valid email address")
    private String email;
}
