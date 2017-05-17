package it.gixlg.tdd.constraint;

public class DigitConstraint extends NoConstraint{

    private PasswordConstraint passwordConstraint;

    public DigitConstraint(){
        this.passwordConstraint = new NoConstraint();
    }

    public DigitConstraint(PasswordConstraint passwordConstraint){
        this.passwordConstraint = passwordConstraint;
    }

    public boolean isValid(String passwordText) {
        return this.passwordConstraint.isValid(passwordText) && passwordText.matches(".*[a-z].*");
    }

}