import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ArraysTest {
    @Test
    void copyOfRangeTest() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        // {1, 2, 3, 4}
        int[] copyArray = Arrays.copyOfRange(array, 0, 4);
        Assertions.assertThat(copyArray[0]).isEqualTo(1);
        Assertions.assertThat(copyArray[copyArray.length - 1]).isEqualTo(4);
    }

}
