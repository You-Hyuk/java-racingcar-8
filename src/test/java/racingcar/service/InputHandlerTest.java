package racingcar.service;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.exception.ErrorMessage;

public class InputHandlerTest {

    private final InputHandler inputHandler = new InputHandler();

    @Test
    @DisplayName("5자를 넘는 이름을 포함한 경우 예외가 발생한다.")
    public void failIfNameLengthExceedFive() throws Exception {
        //given
        String names = "pobi,woni,jun,benson";

        //when && then
        Assertions.assertThatThrownBy(() -> inputHandler.parseName(names))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorMessage.INVALID_NAME_LENGTH.getDescription());
    }

    @Test
    @DisplayName("동일한 이름을 포함한 경우 예외가 발생한다.")
    public void failIfDuplicateNameExist() throws Exception {
        //given
        String names = "pobi,woni,pobi,james";

        //when && then
        Assertions.assertThatThrownBy(() -> inputHandler.parseName(names))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorMessage.DUPLICATE_NAME.getDescription());
    }

    @Test
    @DisplayName("쉼표(,)를 기준으로 이름을 파싱한다.")
    public void parseNamesByCommaDelimiter() throws Exception {
        //given
        String names = "pobi,jun,woni";

        //when
        List<String> nameList = inputHandler.parseName(names);

        //then
        Assertions.assertThat(nameList)
                .containsExactly("pobi", "jun", "woni");
    }

    @Test
    @DisplayName("시도 횟수 입력이 숫자가 아닌 경우 예외가 발생한다.")
    public void failIfCountNotNumeric() throws Exception {
        //given
        String count = "NOT NUMBER";

        //when && then
        Assertions.assertThatThrownBy(() -> inputHandler.validateNumberFormat(count))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage(ErrorMessage.INVALID_NUMBER_INPUT.getDescription());
    }
}
