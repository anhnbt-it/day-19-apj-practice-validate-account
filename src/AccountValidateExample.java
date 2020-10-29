import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by IntelliJ IDEA.
 * User: AnhNBT (anhnbt.it@gmail.com)
 * Date: 10/29/2020
 * Time: 10:32 AM
 */
public class AccountValidateExample {

    /*
     * Không chứa các ký tự đặc biệt
     * Phải dài hơn 6 ký tự
     * Không chứa các ký tự viết hoa
     * Cho phép dấu gạch dưới
     * ^: Bắt đầu chuỗi regex
     * [_a-z0-9]: Ký tự cho phép dấu gạch dưới
     * chỉ là các chữ thường từ a-z hoặc 0-9
     * {6,}: Ít nhất 6 ký tự
     * $: Kết thúc chuỗi regex
     */

    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public AccountValidateExample() {}

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
