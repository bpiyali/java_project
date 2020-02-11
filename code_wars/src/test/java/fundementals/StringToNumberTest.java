package fundementals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToNumberTest {
    @Test
    public void test1(){
        assertEquals(1234 , StringToNumber.stringToNumber("1234"));
    }

    @Test
    public void test2(){
        assertEquals(6057 , StringToNumber.stringToNumber("6057"));
    }

    @Test
    public void test5(){
        for(int i = 0; i < 100; ++i) {
            int t = (int)Math.round(Math.random() * 500000);
            assertEquals(t , StringToNumber.stringToNumber(Integer.toString(t)));
        }
    }

}
