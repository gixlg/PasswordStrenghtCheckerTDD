package it.gixlg.tdd.constraint;

public class LenghtConstraint implements PasswordConstraint{

    public boolean isValid(String passwordText) {
        return passwordText.length() > 7;
    }

}