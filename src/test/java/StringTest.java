import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;

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

    @Test
    void createStringAndEquals() {
        String str3 = new String("abc");
        Assertions.assertThat(str1 == str2).isTrue();
        Assertions.assertThat(str1 == str3).isFalse();
        Assertions.assertThat(str1.equals(str3)).isTrue();
    }

    @Test
    void charAtTest() {
        Assertions.assertThat(str1.charAt(1)).isEqualTo('b');
    }

    @Test
    void compareTo() {
        // 같으면
        Assertions.assertThat(str1.compareTo("abc")).isEqualTo(0);
        // 사전순 이후
        Assertions.assertThat(str1.compareTo("aaa")).isEqualTo(1);
        // 사전순 이전
        Assertions.assertThat(str1.compareTo("bbb")).isEqualTo(-1);
    }

    @Test
    void concat() {
        String str3 = str1.concat(str2);
        Assertions.assertThat(str3).isEqualTo("abcabc");
    }

    @Test
    void contains() {
        Assertions.assertThat(str1.contains("c")).isTrue();
        Assertions.assertThat(str1.contains("z")).isFalse();
    }

    @Test
    void endsWith() {
        Assertions.assertThat(str1.endsWith("c")).isTrue();
        Assertions.assertThat(str1.endsWith("z")).isFalse();
    }

    @Test
    void equalsIgnoreCase() {
        String str3 = "ABC";
        Assertions.assertThat(str1.equals(str3)).isFalse();
        Assertions.assertThat(str1.equalsIgnoreCase(str3)).isTrue();
    }

    @Test
    void indexOfWithChar() {
        Assertions.assertThat(str1.indexOf('b')).isEqualTo(1);
        Assertions.assertThat(str1.indexOf('o')).isEqualTo(-1);

        Assertions.assertThat(str1.indexOf('b', 1)).isEqualTo(1);
        Assertions.assertThat(str1.indexOf('b', 2)).isEqualTo(-1);
    }

    @Test
    void indexOfWithStr() {
        Assertions.assertThat(str1.indexOf("bc")).isEqualTo(1);
        Assertions.assertThat(str1.indexOf("cd")).isEqualTo(-1);

        Assertions.assertThat(str1.indexOf("bc", 1)).isEqualTo(1);
        Assertions.assertThat(str1.indexOf("bc", 2)).isEqualTo(-1);
    }

    @Test
    void lastIndexOf() {
        Assertions.assertThat(str1.lastIndexOf("bc")).isEqualTo(1);
        Assertions.assertThat(str1.lastIndexOf("c")).isEqualTo(2);
    }

    @Test
    void length() {
        Assertions.assertThat(str1.length()).isEqualTo(3);
    }

    @Test
    void replace() {
        Assertions.assertThat(str1.replace("b", "c")).isEqualTo("acc");
    }

    @Test
    void replaceAll() {
        String str3 = "aba";
        Assertions.assertThat(str3.replaceAll("a", "cd")).isEqualTo("cdbcd");
    }

    @Test
    void replaceFirst() {
        String str3 = "aba";
        Assertions.assertThat(str3.replaceFirst("a", "cd")).isEqualTo("cdba");
    }

    @Test
    void split() {
        String str3 = "a,b,c,d,e";
        String[] str3s = new String[]{"a", "b", "c", "d", "e"};
        Assertions.assertThat(str3.split(",")).isEqualTo(str3s);
    }

    @Test
    void splitWithLimit() {
        String str3 = "a,b,c,d,e";
        String[] str3s = new String[]{"a", "b,c,d,e"};
        Assertions.assertThat(str3.split(",", 2)).isEqualTo(str3s);
    }

    @Test
    void substring() {
        Assertions.assertThat(str1.substring(1)).isEqualTo("bc");
        Assertions.assertThat(str1.substring(0, 1)).isEqualTo("a");
    }

    @Test
    void toLowerCase() {
        String str3 = "aBC";
        Assertions.assertThat(str3.toLowerCase()).isEqualTo("abc");
    }

    @Test
    void toUpperCase() {
        String str3 = "Abc";
        Assertions.assertThat(str3.toUpperCase()).isEqualTo("ABC");
    }

    @Test
    void toStringTest() {
        Assertions.assertThat(str1.toString()).isEqualTo("abc");
    }

    @Test
    void trim() {
        String str3 = "   abcd ef   ";
        Assertions.assertThat(str3.trim()).isEqualTo("abcd ef");
    }

    @Test
    void valueOf() {
        int num = 12345;
        Assertions.assertThat(String.valueOf(num)).isEqualTo("12345");
    }

    @Test
    void join() {
        String[] animals = new String[]{"cat", "dog", "bear"};
        Assertions.assertThat(String.join("-", animals)).isEqualTo("cat-dog-bear");
    }

    @Test
    void stringJoiner() {
        StringJoiner sj = new StringJoiner(",", "[", "]");
        String[] strArr = new String[]{"aaa", "bbb", "ccc"};
        for (String s : strArr) {
            sj.add(s);
        }
        Assertions.assertThat(sj.toString()).isEqualTo("[aaa,bbb,ccc]");
    }

    @Test
    void getBytes() throws UnsupportedEncodingException {
        byte[] utf8_str = "가".getBytes(StandardCharsets.UTF_8);
        String str = new String(utf8_str, StandardCharsets.UTF_8);
        Assertions.assertThat(str).isEqualTo("가");
    }

    @Test
    void format() {
        String str = String.format("%d 더하기 %d는 %d입니다.", 3, 5, 3+5);
        Assertions.assertThat(str).isEqualTo("3 더하기 5는 8입니다.");
    }






}
