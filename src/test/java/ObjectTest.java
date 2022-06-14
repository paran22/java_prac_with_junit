import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ObjectTest {

    private Value v1;
    private Value v2;

    @BeforeEach
    void setUp() {
        v1 = new Value(10);
        v2 = new Value(10);
    }

    @Test
    void equalsTest() {
        Assertions.assertThat(v1.equals(v2)).isEqualTo(false);
    }

    @Test
    void hashCodeTest() {
        Assertions.assertThat(System.identityHashCode(v1)).isNotEqualTo(System.identityHashCode(v2));
    }
}
