package com.sample;

import com.sample.model.Race;

import java.util.ArrayList;
import java.util.List;

public class RaceService {

    public List getAvailableSubraces(Race race){

        List subraces = new ArrayList();

        subraces.add("darkelf");

        return subraces;
    }
}
