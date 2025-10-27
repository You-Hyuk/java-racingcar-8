package racingcar.service;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import racingcar.exception.ErrorMessage;

public class InputHandler {

    private static final String NAME_DELIMITER = ",";

    public List<String> parseName(String names) {
        String[] splitNames = names.split(NAME_DELIMITER);
        for (String name : splitNames) {
            validateNameLength(name);
        }

        return List.of(splitNames);
    }

    public int validateNumberFormat(String count) {
        try {
            return Integer.parseInt(Console.readLine());
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_NUMBER_INPUT.getDescription());
        }
    }

    private void validateNameLength(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_NAME_LENGTH.getDescription());
        }
    }
}
