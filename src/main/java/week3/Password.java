package week3;

public class Password {
    public String validate(String username,String password) {
        if (password == null){
            throw new NullPointerException("Password is empty");
        }
        String validation = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[%£&@#€$(){}<>/?+]).{8,}$";
        if (!password.matches(validation) || password.toLowerCase().contains(username.toLowerCase())){
            throw new IllegalArgumentException("Password does not meet the criteria or contains the username");
        }
        return "OK";
    }
    }

