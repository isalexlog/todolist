package hs.tasklistie.auth.dataTransferObject;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class SignupDto {

    @NotBlank @NotNull @NotEmpty(message = "Sie müssen dieses Feld ausfüllen.")
    private String username;
    @NotBlank @NotNull @NotEmpty(message = "Sie müssen dieses Feld ausfüllen.")
    @Size(min=8, max=32, message="Bitte wählen Sie einen Passwort, der länger als 8 Symbole und kürzer als 32 Symbole ist.")
    private String password;
    @NotBlank @NotNull @NotEmpty(message = "Sie müssen dieses Feld ausfüllen.")
    private String passwordConfirm;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }
}
