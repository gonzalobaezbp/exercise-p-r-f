package co.com.bancolombia.model.account.exceptions.message;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum TechnicalErrorMessage {

    TECHNICAL_REST_CLIENT_ERROR("SCT0010", "Technical error rest client"),
    EXTERNAR_MESSAGE_ERROR("SFT9999", "Error");

    private final String code;
    private final String message;

}
