package com.example.demo.service;

import com.example.demo.model.Malaki;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class MalakiService {

    List<Malaki> malakiList = new ArrayList<>(
            Arrays.asList(
                    new Malaki("Mallet", "1"),
                    new Malaki("Mush", "2")
            )
    );

    public List<Malaki>getMalakiList(){
        return malakiList;
    }

    public void addMalakiToList(Malaki malaki){
        malakiList.add(malaki);
    }

    public Malaki getMalakiById(String id){
        for (Malaki malaki: malakiList) {
            if(malaki.getId().equals(id)){
                return malaki;
            }
        }
        return null;
    }

    public void updateNameById(String id, String name){
        for (Malaki malaki: malakiList) {
            if(malaki.getId().equals(id)){
                malaki.setName(name);
            }
        }
    }

}
