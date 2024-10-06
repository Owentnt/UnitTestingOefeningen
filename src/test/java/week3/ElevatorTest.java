package week3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ElevatorTest {
    @Test
    void ActiveButtons_NoBadge_ReturnsIllegalArgumentException() {
        Elevator elevator = new Elevator();
        assertThrows(IllegalArgumentException.class, () -> elevator.activeButtons(null, 0));
    }

    @Test
    void ActiveButtons_NonExistingFloor_ReturnsIllegalArgumentException() {
        Elevator elevator = new Elevator();
        assertThrows(IllegalArgumentException.class, () -> elevator.activeButtons("", 1200));
    }

    @Test
    void ActiveButtons_AllowedFloorsForGuests_ReturnsExpectedFloors() {
        Elevator elevator = new Elevator();
        List<Integer> expectedFloors = Arrays.asList(0, 4, 10);

        assertEquals(expectedFloors, elevator.activeButtons("405", 0));
        assertEquals(expectedFloors, elevator.activeButtons("405", 10));
        assertEquals(expectedFloors, elevator.activeButtons("405", 4));
    }

    @Test
    void ActiveButtons_UnAuthorizedFloorsForGuests_ReturnsIllegalArgumentException() {
        Elevator elevator = new Elevator();
        assertThrows(IllegalArgumentException.class, () -> elevator.activeButtons("405", -2));
        assertThrows(IllegalArgumentException.class, () -> elevator.activeButtons("405", -1));
    }

    @Test
    void ActiveButtons_AuthorizedFloorsForStaff_ReturnsAllFloorsExceptCurrent() {
        Elevator elevator = new Elevator();
        List<Integer> expectedFloors = new ArrayList<>();
        for (int i = -2; i <= 10; i++) {
            if (i != -2) {
                expectedFloors.add(i);
            }
        }

        assertEquals(expectedFloors, elevator.activeButtons("S", -2));
    }
}
//geen badge
// onbestaande verdieping
// verboden verdieping
// staff badge
//badge is not a correct number or not S
