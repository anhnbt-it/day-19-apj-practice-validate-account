import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/29/2020
 * Time: 10:43 AM
 */
class AccountValidateExampleTest {

    private AccountValidateExample accountValidate = new AccountValidateExample();

    @Test
    @DisplayName("123abc")
    void test1() {
        String regex = "123abc";
        boolean actual = accountValidate.validate(regex);
        assertEquals(true, actual);
    }

    @Test
    @DisplayName("_abc123")
    void test2() {
        String regex = "_abc123";
        boolean actual = accountValidate.validate(regex);
        assertEquals(true, actual);
    }
}