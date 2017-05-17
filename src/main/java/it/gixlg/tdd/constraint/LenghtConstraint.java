package it.gixlg.tdd.constraint;

public class LenghtConstraint extends NoConstraint{

    private PasswordConstraint passwordConstraint;

    public LenghtConstraint(){
        this.passwordConstraint = new NoConstraint();
    }

    public LenghtConstraint(PasswordConstraint passwordConstraint){
        this.passwordConstraint = passwordConstraint;
    }

    public boolean isValid(String passwordText) {
        return this.passwordConstraint.isValid(passwordText) && passwordText.length() > 7;
    }

}