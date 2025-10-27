package racingcar.domain;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarsTest {

    @Test
    @DisplayName("자동차가 무작위 값이 4 이상인 경우에 움직인다.")
    public void moveIfRandomValueOverFour() throws Exception {
        //given
        Car pobi = new Car("pobi", 0);
        Car woni = new Car("woni", 0);
        Cars cars = new Cars(List.of(pobi, woni));
        List<Integer> randomValues = List.of(3, 5);
        int minPassValue = 4;

        //when
        cars.race(randomValues, minPassValue);

        //then
        Assertions.assertThat(pobi.getMoveCount())
                .isEqualTo(0);

        Assertions.assertThat(woni.getMoveCount())
                .isEqualTo(1);
    }

    @Test
    @DisplayName("여러 명의 우승자가 존재하는 경우 쉼표(,)를 이용해 구분한다.")
    public void dsa() throws Exception {
        //given
        Car pobi = new Car("pobi", 3);
        Car woni = new Car("woni", 3);
        Cars cars = new Cars(List.of(pobi, woni));
        String delimiter = ",";

        //when
        Cars winners = cars.findWinners();
        String output = winners.joinNames(delimiter);

        //then
        Assertions.assertThat(output)
                .isEqualTo("pobi,woni");
    }
}
