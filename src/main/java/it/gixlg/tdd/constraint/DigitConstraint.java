package it.gixlg.tdd.constraint;

public class DigitConstraint implements PasswordConstraint{

    public boolean isValid(String passwordText) {
        return passwordText.matches(".*[a-z].*");
    }

}