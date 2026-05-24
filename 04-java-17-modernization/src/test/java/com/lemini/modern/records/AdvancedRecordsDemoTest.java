package com.lemini.modern.records;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.lemini.modern.records.AddressDTO;
import com.lemini.modern.records.UserDTO;
import com.lemini.modern.records.UserProfileResponse;

public class AdvancedRecordsDemoTest {

    @Test
    void demoNestedRecords() {
        // Given
        AddressDTO address = new AddressDTO("Stone Rd", "Toronto", "CANADA");
        UserDTO user = new UserDTO("John", "John.Smith@gmail.com", 20);

        // When
        UserProfileResponse response = new UserProfileResponse(user, address, true);

        // Then
        // Prove that the composition works
        assertTrue(response.isActive());
        assertEquals("John", response.user().username());
        assertEquals("John.Smith@gmail.com", response.user().email());
        assertEquals(20, response.user().age());
        assertEquals("Stone Rd", response.address().street());
        assertEquals("Toronto", response.address().city());
        assertEquals("CANADA", response.address().country());
    }

    @Test
    void demoRecordCustomMethods() {
        // Given
        EmployeeRecord employee = new EmployeeRecord("Tom", "Hanks", "Tom.Hanks@gmail.com", 65);

        // When
        // Demonstrate the custom method we added to the Record
        String fullName = employee.getFullName();

        // Then
        // Prove that the custom method works
        assertEquals("Tom Hanks", fullName);
    }
}
