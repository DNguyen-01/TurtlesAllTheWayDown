import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {


    @Test
    public void testFactorialFive(){
        //given
        Long expected = 120L;
        //when
        Long actual = Factorial.computeFactorial(5);
        //then
        Assert.assertEquals(expected,actual);


    }

    @Test
    public void testFactorialTen() {
        //given
        Long expected = 3628800L;
        //when
        Long actual = Factorial.computeFactorial(10);
        //then
        Assert.assertEquals(expected, actual);
    }

}