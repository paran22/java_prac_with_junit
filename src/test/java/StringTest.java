import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringTest {

    private String str1;
    private String str2;

    @BeforeEach
    void setUp() {
        str1 = "abc";
        str2 = "abc";
    }

    @Test
    void equalsTest() {
        Assertions.assertThat(str1.equals(str2)).isEqualTo(true);
    }

    @Test
    void hashCodeTest() {
        Assertions.assertThat(str1.hashCode()).isEqualTo(str2.hashCode());
    }
}
