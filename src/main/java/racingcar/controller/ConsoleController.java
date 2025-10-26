package racingcar.controller;

import java.util.List;
import racingcar.entity.RaceResult;
import racingcar.service.NameParser;
import racingcar.service.RacingHandler;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class ConsoleController {

    private final InputView inputView = new InputView();
    private final OutputView outputView = new OutputView();
    private final NameParser nameParser = new NameParser();
    private final RacingHandler racingHandler = new RacingHandler();

    public void executeConsole() {
        String names = inputView.printNamePrompt();
        int count = inputView.printCountPrompt();
        List<String> nameList = nameParser.parseName(names);
        outputView.printRaceExecutePrompt();
        RaceResult raceResult = racingHandler.executeRace(nameList, count);
        outputView.printRaceLogs(raceResult.getRaceLogs());
        outputView.printRaceWinners(raceResult.getWinners());
    }

}
