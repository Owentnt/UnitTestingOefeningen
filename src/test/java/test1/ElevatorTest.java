package test1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ElevatorTest {
    @Test
    void Guest_Has_No_Badge(){
        Elevator elevator = new Elevator();
        assertThrows(NullPointerException.class, () ->
                elevator.activeButtons(null,0));

    }
}


//gebruiker geen badge
// gebruiker floor 0 and 10
// gebruiker gaat naar kamer
// Staff
// gebruiker op verdieping < 0
