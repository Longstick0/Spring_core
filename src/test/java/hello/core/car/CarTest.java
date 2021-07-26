package hello.core.car;

import TIre.AmericaTire;
import TIre.Car;
import TIre.KoreanTire;
import TIre.Tire;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class CarTest {
    @Test
    public void EquipKoreanTireTest() {
        Tire tire1 = new KoreanTire();
        Car car1 = new Car(tire1);

        assertThat("장착된 타이어: 코리아 타이어").isEqualTo(car1.getTireBrand());
    }

    @Test
    public void EquipAmericanTireTest() {
        Tire tire2 = new AmericaTire();
        Car car2 = new Car(tire2);

        assertThat("장착된 타이어: 미국 타이어").isEqualTo(car2.getTireBrand());
    }
}
