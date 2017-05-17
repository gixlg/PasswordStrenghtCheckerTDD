package it.gixlg.tdd.constraint;

public class UppercaseConstraint extends NoConstraint{

    private PasswordConstraint passwordConstraint;

    public UppercaseConstraint(){
        this.passwordConstraint = new NoConstraint();
    }

    public UppercaseConstraint(PasswordConstraint passwordConstraint){
        this.passwordConstraint = passwordConstraint;
    }

    public boolean isValid(String passwordText) {
        return this.passwordConstraint.isValid(passwordText) && passwordText.matches(".*[A-Z].*");
    }

}