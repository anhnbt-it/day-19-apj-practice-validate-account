import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/29/2020
 * Time: 10:43 AM
 */
class AccountValidateExampleTest {

    private final AccountValidateExample accountValidate = new AccountValidateExample();

    @Test
    @DisplayName("123abc")
    void test1() {
        String regex = "123abc";
        boolean actual = accountValidate.validate(regex);
        assertTrue(actual);
    }

    @Test
    @DisplayName("_abc123")
    void test2() {
        String regex = "_abc123";
        boolean actual = accountValidate.validate(regex);
        assertTrue(actual);
    }

    @Test
    @DisplayName("______")
    void test3() {
        String regex = "______";
        boolean actual = accountValidate.validate(regex);
        assertTrue(actual);
    }

    @Test
    @DisplayName("123456")
    void test4() {
        String regex = "123456";
        boolean actual = accountValidate.validate(regex);
        assertTrue(actual);
    }

    @Test
    @DisplayName(".@")
    void test5() {
        String regex = ".@";
        boolean actual = accountValidate.validate(regex);
        assertFalse(actual);
    }

    @Test
    @DisplayName("12345")
    void test6() {
        String regex = "12345";
        boolean actual = accountValidate.validate(regex);
        assertFalse(actual);
    }

    @Test
    @DisplayName("1234_")
    void test7() {
        String regex = "1234_";
        boolean actual = accountValidate.validate(regex);
        assertFalse(actual);
    }

    @Test
    @DisplayName("abcde")
    void test8() {
        String regex = "abcde";
        boolean actual = accountValidate.validate(regex);
        assertFalse(actual);
    }
}