package hs.tasklistie.auth.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason="Dieser Username wird von einem anderen Account benutzt.")
public class UsernameAlreadyInUseException extends RuntimeException {
}
