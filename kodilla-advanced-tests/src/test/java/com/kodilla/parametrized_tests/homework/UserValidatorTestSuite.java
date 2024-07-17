package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    private UserValidator userValidator = new UserValidator();
    private UserValidator userEmailValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"fas", "FASD", "123", "sD908", "sd4._-"})
    public void shouldReturnTrueForValidateUsername(String username) {
        boolean result = userValidator.validateUsername(username);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {""," ", "12", "ad", "DD", "dFa$#^", "a$", "a3", "r " })
    public void shouldReturnFalseForValidateUsername(String username) {
        boolean result = userValidator.validateUsername(username);
        assertFalse(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {"fas@asa.pl", "FASD@sdasd.asd.asdfgh", "123@ads.pl", "sD908@asd.qw", "sd4._-@df.ds"})
    public void shouldReturnTrueForEmailValidator(String email) {
        boolean result = userEmailValidator.validateEmail(email);
        assertTrue(result);
    }

    @ParameterizedTest
    @ValueSource(strings = {" ", "ase.aawd.qwe", "das323Ds._-", "aD@ad.sfd.asdfgh3", "#$^@addd.pl", "fdsf@dsdf.&*(.dfas.pl", "..@asD.p23", "as..23@asd.54", "fdsf@dsdf._-.dfas.pl" })
    public void shouldReturnFalseForEmailValidator(String email) {
        boolean result = userEmailValidator.validateEmail(email);
        assertFalse(result);
    }
}