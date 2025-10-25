package racingcar.service;

import java.util.List;
import racingcar.exception.ErrorMessage;

public class NameParser {

    private static final String NAME_DELIMITER = ",";

    public List<String> parseName(String names) {
        String[] splitNames = names.split(NAME_DELIMITER);
        for (String name : splitNames) {
            validateNameLength(name);
        }

        return List.of(splitNames);
    }

    private void validateNameLength(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_NAME_LENGTH.getDescription());
        }
    }
}
