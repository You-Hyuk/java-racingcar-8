package racingcar.controller;

import racingcar.view.InputView;
import racingcar.view.OutputView;

public class ConsoleController {

    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();

    public void executeConsole() {
        String names = inputView.printNamePrompt();
        int count = inputView.printCountPrompt();
    }

}
