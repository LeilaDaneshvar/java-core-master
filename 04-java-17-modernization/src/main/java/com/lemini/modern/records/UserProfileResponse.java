package com.lemini.modern.records;

public record UserProfileResponse(
        UserDTO user,
        AddressDTO address,
        boolean isActive) {
}
