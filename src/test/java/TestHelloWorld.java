import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestHelloWorld {
    String message = "Bob";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testSayHello(){
        message = "Hello,Bob";
        assertEquals(message,messageUtil.sayHello());
    }

    @Test
    public void testSayWelcome(){
        message = "Welcome to cicd demo !";
        assertEquals(message,messageUtil.sayWelcome());
    }
    @Test
    public void dummyTest1(){
        assertEquals("1","1");
    }

    @Test
    public void dummyTest2(){
        assertEquals("2","2");
    }
}
