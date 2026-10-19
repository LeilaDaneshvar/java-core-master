
package com.lemini.java17.textblocks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TextBlocksDemoTest {

    private final TextBlocksDemo demo = new TextBlocksDemo();

    @Test
    public void testJsonFormatting() {
        // Given
        String oldWayJson = demo.getOldWayJson();
        String modernWayJson = demo.getNewWayJson();

        // Then
        // prove that both methods return the same JSON string, even though they are
        // created differently
        assertEquals(modernWayJson, oldWayJson);
    }

    @Test
    void testSqlQueryIsPreserved() {
        // When
        String query = demo.getSqlQuery();

        // Then
        assertTrue(query.contains("SELECT id"));
        assertTrue(query.contains("WHERE active = true"));
    }

}
