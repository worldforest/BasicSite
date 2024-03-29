package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JUnitTest {
    @DisplayName("1+2=3이다")
    @Test
    public void junitTest(){
        int a = 1;
        int b = 2;
        int sum =3;

        Assertions.assertEquals(sum, a+b);
    }

    @DisplayName("1+2=4이다")
    @Test
    public void junitFailedTest(){
        int a = 1;
        int b = 2;
        int sum =4;

        Assertions.assertEquals(sum, a+b);
    }
}
