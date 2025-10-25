package racingcar.exception;

public enum ErrorMessage {
    INVALID_NAME_LENGTH("이름의 길이가 5자 이하가 아닙니다.");

    private final String description;

    ErrorMessage(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
