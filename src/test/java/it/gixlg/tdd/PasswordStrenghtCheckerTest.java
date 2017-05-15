package it.gixlg.tdd;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PasswordStrenghtCheckerTest {
    @Test
    public void passwordTooShort() {
        assertEquals(false, new Password("").isValid());
        assertEquals(false, new Password("aaa").isValid());
        assertEquals(false, new Password(" ").isValid());
    }

    @Test
    public void passwordIsGood() {
        assertEquals(true, new Password("abcdefgh").isValid());
    }

    @Test
    public void passwordContainsNoAlpha() {
        assertEquals(false, new Password("12345678").isValid());
    }

    @Test
    public void passwordContainsNoDigit() {
        assertEquals(false, new Password("abcdefgh").isValid());
    }
}
