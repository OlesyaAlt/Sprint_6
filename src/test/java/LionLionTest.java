import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.praktikum.Feline;
import ru.yandex.praktikum.Lion;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)

public class LionLionTest {
    private final String sex;
    private final boolean expected;

    public LionLionTest(String sex, boolean expected) throws Exception {
        this.sex = sex;
        this.expected = expected;
    }

    @Parameterized.Parameters (name = "{index} sex= {0}")
    public static Object[] getSexData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }
        @Test
        public void doesHaveMane() throws Exception{
            Feline feline = new Feline();
            Lion lion = new Lion(sex, feline);
            assertEquals(expected, lion.doesHaveMane());
        }
    }








