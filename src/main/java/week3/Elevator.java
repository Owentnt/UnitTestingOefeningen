package week3;

import java.util.ArrayList;
import java.util.List;

public class Elevator {
    public List<Integer> activeButtons(String badge, int currentLevel) {
        if (badge == null) {
            throw new IllegalArgumentException("A user without a badge is not allowed to use the elevator");
        }

        List<Integer> activeFloors = new ArrayList<>();

        if (badge.equals("S")) {
            for (int i = -2; i <= 10; i++) {
                activeFloors.add(i);
            }
        } else {
            try {
                int floor = Integer.parseInt(badge.substring(0, 1));
                activeFloors.add(0);
                activeFloors.add(floor);
                activeFloors.add(10);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Invalid badge");
            }
        }

        if (!activeFloors.contains(currentLevel)) {
            throw new IllegalArgumentException("The user is on a floor where they are not allowed");
        }

        activeFloors.remove(Integer.valueOf(currentLevel));

        return activeFloors;
    }
}