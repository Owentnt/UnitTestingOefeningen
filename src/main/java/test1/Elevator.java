package test1;

import java.util.List;

public class Elevator {

    public List<Integer> activeButtons(String badge, int currentLevel){
        if (badge == null) throw new NullPointerException("geen toegang zonder bagde");
        return activeButtons(badge,currentLevel);
    }

    }

