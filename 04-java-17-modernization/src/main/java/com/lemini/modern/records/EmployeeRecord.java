package com.lemini.modern.records;

public record EmployeeRecord(String name, String lastName, String email, double age) {

    // Custom helper method inside a Record
    public String getFullName() {
        return name + " " + lastName;
    }
}
