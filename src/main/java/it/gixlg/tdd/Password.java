package it.gixlg.tdd;

public class Password {

    private String password;

    public Password(String password) {
        this.password = password;
    }

    public boolean isValid(){
        return this.password.length() > 7
            && this.password.matches(".*[a-z].*")
            && this.password.matches(".*[0-9].*");
    }
}
