package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    private static final String NAME_PROMPT = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String COUNT_PROMPT = "시도할 횟수는 몇 회인가요?";

    public String readName() {
        System.out.println(NAME_PROMPT);
        return Console.readLine();
    }

    public String readCount() {
        System.out.println(COUNT_PROMPT);
        return Console.readLine();
    }
}
