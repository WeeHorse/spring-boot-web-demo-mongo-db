package com.example.demo.rest;

import com.example.demo.model.Malaki;
import com.example.demo.service.MalakiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MalakiController {

    @Autowired
    MalakiService malakiService;
    
    @RequestMapping("/malakis")
    public Malaki[] getMalakiList(){
        return malakiService.getMalakiList().toArray(new Malaki[0]);
    }
    
    @RequestMapping(value = "/malakis", method = RequestMethod.POST)
    public void addMalaki(@RequestBody Malaki malaki){
        malakiService.addMalakiToList(malaki);
    }

    @GetMapping("/malakis/{id}")
    public Malaki getMalaki(@PathVariable("id") String id){
        return malakiService.getMalakiById(id);
    }

    @PutMapping("/malakis/{id}")
    public void updateMalaki(@PathVariable("id") String id, @RequestBody Malaki malaki){
        malakiService.updateNameById(id, malaki.getName());
    }

    @PatchMapping("/malakis/{id}")
    public void updateMalakiname(@PathVariable("id") String id, @RequestBody Malaki malaki){
        malakiService.updateNameById(id, malaki.getName());
    }

}
