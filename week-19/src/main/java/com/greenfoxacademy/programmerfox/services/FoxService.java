package com.greenfoxacademy.programmerfox.services;

import com.greenfoxacademy.programmerfox.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {

    private List<Fox> foxPack = new ArrayList<>();

    public FoxService() {
    }

    public void add(Fox fox) {
        foxPack.add(fox);
    }

    public Fox find(String name) {
        for (int i = 0; i < foxPack.size(); i++) {
            if (foxPack.get(i).getName().equalsIgnoreCase(name)) {
                return foxPack.get(i);
            }
        }
        return null;
    }
}
