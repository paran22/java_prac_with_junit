import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringTest {

    @Test
    void equals() {
        String str1 = "abc";
        String str2 = "abc";

        Assertions.assertThat(str1.equals(str2)).isEqualTo(true);
    }
}
