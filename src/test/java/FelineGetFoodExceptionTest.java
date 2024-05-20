import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.praktikum.Feline;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class FelineGetFoodExceptionTest {
    private final String animalKind;


    public FelineGetFoodExceptionTest(String animalKind) {
        this.animalKind = animalKind;
    }

    @Parameterized.Parameters (name = "{index} kind= {0}")
    public static Object[] getFoodData() {
        return new Object[][]{
                {"Насекомое"},
                {" "}
        };
    }

    @Test
    public void getFoodFelineTes() throws Exception  {
        Feline feline = new Feline();
        Exception thrown = assertThrows(Exception.class, () -> feline.getFood(animalKind));
        assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", thrown.getMessage());
    }
}
