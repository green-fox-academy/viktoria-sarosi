package com.greenfoxacademy.dependency.gfa;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    ArrayList<String> names;

    public StudentService() {
        names = new ArrayList<>();
        names.add("Sanyi");
        names.add("Lilla");
        names.add("John");
    }

    public ArrayList<String> findAll() {
        return names;
    }

    public void save(String student) {
        names.add(student);
    }

    public int count(ArrayList names){
        return names.size();
    }

    public String check(String name, ArrayList names){
        if(names.contains(name)){
            return name + " is a GFA student.";
        }else {
            return name + " is not a GFA student.";
        }
    }
}
