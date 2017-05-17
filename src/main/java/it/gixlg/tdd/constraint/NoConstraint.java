package it.gixlg.tdd.constraint;

public class NoConstraint implements PasswordConstraint{

    public boolean isValid(String passwordText) {
        return true;
    }

}