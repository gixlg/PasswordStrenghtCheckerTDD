package it.gixlg.tdd;

import static org.junit.Assert.assertEquals;

import it.gixlg.tdd.constraint.*;
import org.junit.Test;

public class PasswordStrenghtCheckerTest {
    @Test
    public void passwordTooShort() {
        PasswordConstraint constraint = new LenghtConstraint();
        assertEquals(false, new Password("", constraint).isValid());
        assertEquals(false, new Password("aaa", constraint).isValid());
        assertEquals(false, new Password("aaaaaa", constraint).isValid());
    }

//    @Test
//    public void passwordIsGood() {
//        assertEquals(true, new Password("abcdefgh").isValid());
//    }

    @Test
    public void passwordContainsNoAlpha() {
        PasswordConstraint constraint = new DigitConstraint();
        assertEquals(false, new Password("13245678", constraint).isValid());
    }

    @Test
    public void passwordContainsNoDigit() {
        PasswordConstraint constraint =  new AlphaConstraint();
        assertEquals(false, new Password("abcdefgh",constraint).isValid());
    }

    @Test
    public void passwordWithDigitLowecaseAndUppercaseContains() {
        PasswordConstraint constraint = new DigitConstraint(new LowercaseConstraint(new UppercaseConstraint()));
        assertEquals(false, new Password("abcdefgh",constraint).isValid());
    }
}
