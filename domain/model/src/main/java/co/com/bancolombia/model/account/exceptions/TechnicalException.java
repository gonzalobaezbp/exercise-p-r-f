package co.com.bancolombia.model.account.exceptions;

import co.com.bancolombia.model.account.exceptions.message.TechnicalErrorMessage;
import lombok.Getter;

@Getter
public class TechnicalException extends RuntimeException{

    private final TechnicalErrorMessage errorMessage;

    public TechnicalException(Throwable cause, TechnicalErrorMessage errorMessage) {
        super(errorMessage.getMessage(), cause);
        this.errorMessage = errorMessage;
    }
}
