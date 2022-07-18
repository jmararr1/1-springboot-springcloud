package com.jorge.customer;

public record CustomerRegistrationRequest (
        String firstName,
        String lastName,
        String email) {
}
