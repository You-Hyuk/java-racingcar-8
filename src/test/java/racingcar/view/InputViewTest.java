package racingcar.view;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class InputViewTest {

    private InputView inputView = new InputView();

    @Test
    @DisplayName("입력값 유효성을 검사한다.")
    public void validateInput() throws Exception {
        //given
        inputView.printNamePrompt();

        //when

        //then
    }
}
