package it.gixlg.tdd.constraint;

public class LowercaseConstraint extends NoConstraint{

    private PasswordConstraint passwordConstraint;

    public LowercaseConstraint(){
        this.passwordConstraint = new NoConstraint();
    }

    public LowercaseConstraint(PasswordConstraint passwordConstraint){
        this.passwordConstraint = passwordConstraint;
    }

    public boolean isValid(String passwordText) {
        return this.passwordConstraint.isValid(passwordText) && passwordText.matches(".*[a-z].*");
    }

}