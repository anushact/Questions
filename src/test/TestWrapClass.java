import org.junit.Test;
import static org.junit.Assert.*;

public class TestWrapClass {

    TextWrap tw = new TextWrap();

    @Test
    public void testWrapText(){
        String text = "This is a program";
        tw.wrapText(text, 8);
        String output = "This is \n" +
                "a \n" + "program";
        assertEquals(output, tw.wrapText(text,8));
    }

}