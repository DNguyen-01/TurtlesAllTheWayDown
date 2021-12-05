import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

import static org.junit.Assert.*;

public class GCDTest {

    @Test
    public void getGCD() {
        //given
        Long p = 10L;
        Long q = 8L;
        Long expected = 2L;
        //when
        Long actual = GCD.getGCD(p,q);
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getGCD2() {
        //given
        Long p = 12L;
        Long q = 10L;
        Long expected = 2L;
        //when
        Long actual = GCD.getGCD(p,q);
        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getGCDTest(){
        //given
        Instant startGCD1 = Instant.now();
        GCD.getGCD(10L,5L);
        Instant finishGCD1 = Instant.now();

        //given
        Instant startGCD2 = Instant.now();
        GCD.getGCD(10L,5L);
        Instant finishGCD2 = Instant.now();

        //when
        long timeElapsed1 = Duration.between(startGCD1, finishGCD1).toMillis();
        long timeElapsed2 = Duration.between(startGCD2, finishGCD2).toMillis();
        Boolean actual = timeElapsed1 > timeElapsed2;

        //then
        Assert.assertTrue(actual);
    }
}