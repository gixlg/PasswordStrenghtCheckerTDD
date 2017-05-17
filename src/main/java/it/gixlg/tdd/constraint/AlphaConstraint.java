package it.gixlg.tdd.constraint;

public class AlphaConstraint implements PasswordConstraint{

    public boolean isValid(String passwordText) {
        return passwordText.matches(".*[0-9].*");
    }

}