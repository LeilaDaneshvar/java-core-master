package com.lemini.modern.records;

public record ValidationError(String field, String message) implements ApiError {
    @Override
    public int setStatus() {
        return 400;
    }
}
