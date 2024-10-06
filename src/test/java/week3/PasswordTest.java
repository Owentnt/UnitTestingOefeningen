package week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PasswordTest {
    @Test void Validate_PasswordIsNull_ReturnsNullPointerException(){
        Password password = new Password();
        assertThrows(NullPointerException.class, () ->
                password.validate("Owentnt",null));
    }
    @Test void Validate_PasswordCriteriaNotMet_ReturnsIllegalArgumentException(){
        Password password = new Password();
        assertThrows(IllegalArgumentException.class, () ->
                password.validate("Owentnt","prog21082023@"));
        assertThrows(IllegalArgumentException.class, () ->
                password.validate("Owentnt","P21082023@"));
        assertThrows(IllegalArgumentException.class, () ->
                password.validate("Owentnt","Prog@"));
        assertThrows(IllegalArgumentException.class, () ->
                password.validate("Owentnt","Prog21082023"));

    }
    @Test void Validate_PasswordOK_ReturnsOK(){
        Password password = new Password();
        assertEquals("OK",password.validate("Owentnt","Prog21082023@"));
    }
}



//username in password
// correct password