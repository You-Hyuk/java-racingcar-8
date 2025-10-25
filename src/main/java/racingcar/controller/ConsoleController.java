package racingcar.controller;

import java.util.List;
import racingcar.service.NameParser;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class ConsoleController {

    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    private final NameParser nameParser = new NameParser();

    public void executeConsole() {
        String names = inputView.printNamePrompt();
        int count = inputView.printCountPrompt();
        List<String> nameList = nameParser.parseName(names);
    }

}
