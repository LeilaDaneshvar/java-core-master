package com.lemini.java17.records;

public record ValidationError(String field, String message) implements ApiError {
    @Override
    public int setStatus() {
        return 400;
    }
}
