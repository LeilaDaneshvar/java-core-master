package com.lemini.java17.records;

public record EmployeeRecord(String name, String lastName, String email, double age) {

    // Custom helper method inside a Record
    public String getFullName() {
        return name + " " + lastName;
    }
}
