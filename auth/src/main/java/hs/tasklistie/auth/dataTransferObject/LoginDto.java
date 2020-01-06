package hs.tasklistie.auth.dataTransferObject;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class LoginDto {

    @NotBlank @NotNull @NotEmpty(message = "Sie müssen dieses Feld ausfüllen.")
    private String username;
    @NotBlank @NotNull @NotEmpty(message = "Sie müssen dieses Feld ausfüllen.")
    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
