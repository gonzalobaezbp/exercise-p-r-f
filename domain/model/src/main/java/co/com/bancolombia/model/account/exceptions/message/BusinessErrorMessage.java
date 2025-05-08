package co.com.bancolombia.model.account.exceptions.message;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum BusinessErrorMessage {

    INVALID_REQUEST("SFB0000", "Invalid request"),
    ACCOUNT_VALIDATION_ERROR("SFB0001", "Account invalid error"),
    ACCOUNT_FIND_ERROR("SFB0002", "Account find error"),
    CHANNEL_TRANSACTION_NOT_FOUND("SFB0003", "Channel transaction not fount");

    private final String code;
    private final String message;

}
