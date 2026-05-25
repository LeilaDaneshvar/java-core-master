package com.lemini.modern.patternmatching;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class SwitchEnhancementTest {
    
    // Given
    private final SwitchEnhancement enhancement = new SwitchEnhancement();

    @Test
    void shouldReturnCorrectDayType() {

        // When & Then
        assertEquals("Weekday", enhancement.getDayType("Monday"));
        assertEquals("Weekend", enhancement.getDayType("Saturday"));

        assertThrows(IllegalArgumentException.class, () -> enhancement.getDayType("Funday"));
    }


}
