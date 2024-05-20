import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.praktikum.Feline;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineGetFoodTest {
    private final String animalKind;
    private final boolean expected;

    public FelineGetFoodTest(String animalKind, boolean expected) {
        this.animalKind = animalKind;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[] getFoodData() {
        return new Object[][]{
                {"Хищник", true},
                {"Травоядное", false}
        };
    }
// проверяем, что при вводе "Хищник" выдается нужный нам список, при вводе "Травоядное" - список другой
    @Test
    public void getFoodFelineTest() throws Exception {
        Feline feline = new Feline();
        boolean actual = List.of("Животные", "Птицы", "Рыба").equals(feline.getFood(animalKind));
        assertEquals(expected, actual);
    }

}
