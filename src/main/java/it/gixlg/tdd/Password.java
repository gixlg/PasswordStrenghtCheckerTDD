package it.gixlg.tdd;

import it.gixlg.tdd.constraint.PasswordConstraint;

import java.util.ArrayList;
import java.util.Set;
import java.lang.reflect.*;

public class Password {

    private String password;
    private ArrayList<PasswordConstraint> passwordConstraints = new ArrayList<PasswordConstraint>();

    public Password(String password) {
        this.password = password;
    }

    public Password(String password, PasswordConstraint passwordConstraint) {
        this.password = password;
        this.addConstraint(passwordConstraint);
    }

    private void addConstraint(PasswordConstraint passwordConstraint){
        passwordConstraints.add(passwordConstraint);
    }

    public boolean isValid() {
        for (PasswordConstraint passwordConstraint : passwordConstraints) {
            if  (!passwordConstraint.isValid(this.password)) return false;
        }
        return true;
    }
}
