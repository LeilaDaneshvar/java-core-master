package com.lemini.java17.records;

public record UserProfileResponse(
        UserDTO user,
        AddressDTO address,
        boolean isActive) {
}
