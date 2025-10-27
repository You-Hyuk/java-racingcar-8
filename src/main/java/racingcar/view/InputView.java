package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.exception.ErrorMessage;

public class InputView {

    private static final String NAME_PROMPT = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String COUNT_PROMPT = "시도할 횟수는 몇 회인가요?";

    public String printNamePrompt() {
        System.out.println(NAME_PROMPT);
        return Console.readLine();
    }

    public int printCountPrompt() {
        System.out.println(COUNT_PROMPT);
        try {
            return Integer.parseInt(Console.readLine());
        } catch (NumberFormatException exception) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_NUMBER_INPUT.getDescription());
        }
    }
}
