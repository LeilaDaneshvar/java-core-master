package com.lemini.java17.textblocks;

public class TextBlocksDemo {

    /**
     * get Old way: string concatenation and escaped quotes.
     */
    public String getOldWayJson() {
        return "{\n" +
               "  \"name\": \"John\",\n" +
               "  \"role\": \"Backend Developer\"\n" +
               "}";
    }

    /**
     * The modern way Text Blocks
     * everything between the triple quotes is preserved exactly as typed.
     */
    public String getNewWayJson() {
        return """
               {
                 "name": "John",
                 "role": "Backend Developer"
               }""";
    }

    /**
     * Perfect for database queries in Spring Boot Repositories.
     */
    public String getSqlQuery() {
        return """
               SELECT id, name, email
               FROM users
               WHERE active = true and created_at > '2024-01-01'
               ORDER BY created_at DESC;
               """;
    }

}
