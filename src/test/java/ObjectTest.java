import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


public class ObjectTest {

    @Test
    void equals() {
        Value v1 = new Value(10);
        Value v2 = new Value(10);

        Assertions.assertThat(v1.equals(v2)).isEqualTo(false);
    }

}
