import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTests {
    private  final boolean expected;
    private final String name;

    public AccountTests( boolean expected,String name) {
        this.expected = expected;
        this.name = name;
    }

    Account account;

    @Parameterized.Parameters
    public static Object[][] getNameData() {
        return new Object[][] {
                {true, "T Ш" },
                {true, "Тимоти Шаламе" },
                {false, "" },
                {false, null },
                {false, "Тимоти" },
                {false, " Тимоти Шаламе " },
                {false, "Тимоти Шаламе " },
                {false, "Тимоти  Шаламе" },
        };
    }

    @Test
    public void checkNameToEmbossTests (){
        Account account = new Account(name);
        boolean actual = account.checkNameToEmboss();
        assertEquals(expected,actual);

    }
}
