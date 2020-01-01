import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestIsograms {

    @Test
    public void FixedTests() {
        Isograms  isogram = new Isograms();
        assertEquals(true, isogram.isIsogram("Dermatoglyphics"));
        assertEquals(true, isogram.isIsogram("isogram"));
        assertEquals(false, isogram.isIsogram("moose"));
        assertEquals(false, isogram.isIsogram("isIsogram"));
        assertEquals(false, isogram.isIsogram("aba"));
        assertEquals(false, isogram.isIsogram("moOse"));
        assertEquals(true, isogram.isIsogram("thumbscrewjapingly"));
        assertEquals(true, isogram.isIsogram(""));
    }
}
