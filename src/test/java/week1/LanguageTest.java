package week1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LanguageTest {
    @Test
    void sayHelloEnglish(){
        Greetings greetings = new Greetings();
        String actual = greetings.sayHello("Owen","English");
        Assertions.assertEquals("Hello Owen!",actual);
    }
    @Test
    void sayHelloSpanish(){
        Greetings greetings = new Greetings();
        String actual = greetings.sayHello("Owen","Spanish");
        Assertions.assertEquals("Hola Owen!",actual);
    }
    @Test
    void sayHelloFrench(){
        Greetings greetings = new Greetings();
        String actual = greetings.sayHello("Owen","French");
        Assertions.assertEquals("Bonjour Owen!",actual);
    }
    @Test
    void sayHelloEmptyInput(){
        Greetings greetings = new Greetings();
        String actual = greetings.sayHello("Owen","");
        Assertions.assertEquals("What language do you speak",actual);
    }
    @Test
    void sayHelloWhitespaces(){
        Greetings greetings = new Greetings();
        String actual = greetings.sayHello("Owen","\t\n");
        Assertions.assertEquals("What language do you speak",actual);
    }
    @Test
    void sayHelloNull(){
        Greetings greetings = new Greetings();
        String actual = greetings.sayHello("Owen",null);
        Assertions.assertEquals("What language do you speak",actual);
    }


}
