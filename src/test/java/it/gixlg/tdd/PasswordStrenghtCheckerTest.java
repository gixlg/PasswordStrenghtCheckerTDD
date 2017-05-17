package it.gixlg.tdd;

import static org.junit.Assert.assertEquals;

import it.gixlg.tdd.constraint.AlphaConstraint;
import it.gixlg.tdd.constraint.DigitConstraint;
import it.gixlg.tdd.constraint.LenghtConstraint;
import org.junit.Test;

public class PasswordStrenghtCheckerTest {
    @Test
    public void passwordTooShort() {
        assertEquals(false, new Password("", new LenghtConstraint()).isValid());
        assertEquals(false, new Password("aaa", new LenghtConstraint()).isValid());
        assertEquals(false, new Password("aaaaaa", new LenghtConstraint()).isValid());
    }

//    @Test
//    public void passwordIsGood() {
//        assertEquals(true, new Password("abcdefgh").isValid());
//    }

    @Test
    public void passwordContainsNoAlpha() {
        assertEquals(false, new Password("13245678", new DigitConstraint()).isValid());
    }

    @Test
    public void passwordContainsNoDigit() {
        assertEquals(false, new Password("abcdefgh", new AlphaConstraint()).isValid());
    }
}
