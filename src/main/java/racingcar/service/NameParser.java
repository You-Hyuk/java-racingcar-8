package racingcar.service;

import java.util.List;

public class NameParser {

    private static final String NAME_DELIMITER = ",";

    public List<String> parseName(String names) {
        return List.of(names.split(NAME_DELIMITER));
    }
}
