package racingcar.exception;

public enum ErrorMessage {
    INVALID_NAME_LENGTH("이름의 길이가 5자 이하가 아닙니다."),
    INVALID_NUMBER_INPUT("숫자 입력이 잘못되었습니다."),
    DUPLICATE_NAME("동일한 이름이 존재합니다."),
    COUNT_OUT_OF_RANGE("시도 횟수는 1 이상이어야 합니다.");

    private final String description;

    ErrorMessage(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
