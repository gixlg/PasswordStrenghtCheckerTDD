package it.gixlg.tdd.constraint;

public class AlphaConstraint extends NoConstraint{

    private PasswordConstraint passwordConstraint;

    public AlphaConstraint(){
        this.passwordConstraint = new NoConstraint();
    }

    public AlphaConstraint(PasswordConstraint passwordConstraint){
        this.passwordConstraint = passwordConstraint;
    }

    public boolean isValid(String passwordText) {
        return this.passwordConstraint.isValid(passwordText) && passwordText.matches(".*[0-9].*");
    }

}