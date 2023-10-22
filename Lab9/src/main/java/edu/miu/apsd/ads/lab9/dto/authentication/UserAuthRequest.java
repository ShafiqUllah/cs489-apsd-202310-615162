package edu.miu.apsd.ads.lab9.dto.authentication;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAuthRequest {
    @NotBlank(message = "Username cannot be null, empty or blankspace(s)")
    private String username;
    @NotBlank(message = "Password cannot be null, empty or blankspace(s)")
    private String password;
}
