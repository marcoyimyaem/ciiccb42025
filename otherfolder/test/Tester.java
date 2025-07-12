package otherfolder.test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import otherfolder.task.Task4;

public class Tester {
    @Test
    void testPalin(){

        assertEquals(Task4.checkPalindrom("level"), "Palin");
    }
    @Test
    void testPalin2(){
        assertEquals(Task4.checkPalindrom("levels"), "not Palin");
    }
}
