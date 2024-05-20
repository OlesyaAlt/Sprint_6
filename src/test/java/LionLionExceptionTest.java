import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.praktikum.Feline;
import ru.yandex.praktikum.Lion;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)

public class LionLionExceptionTest {
    String sex;


    public LionLionExceptionTest(String sex) {
        this.sex = sex;
    }

    @Parameterized.Parameters (name = "{index} sex= {0}")
    public static Object[] getSexData() {
        return new Object[][]{
                {"Оно"},
                {" "},
                {null}
        };
    }
    @Test
    public void createdLion() throws Exception{
        Feline feline = new Feline();
        Exception thrown = assertThrows(Exception.class, () -> new Lion(sex, feline));
        assertEquals("Используйте допустимые значения пола животного - самец или самка", thrown.getMessage());
    }
}
