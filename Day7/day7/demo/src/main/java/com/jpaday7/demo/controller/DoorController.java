package com.jpaday7.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.jpaday7.demo.model.Door;
import com.jpaday7.demo.service.DoorService;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class DoorController {
    public DoorService doorService;

    public DoorController(DoorService doorService) {
        this.doorService = doorService;
    }
    
    @PostMapping("/api/door")
    public ResponseEntity<Door> post(@RequestBody Door door)
    {
        Door obj=doorService.post(door);
        return new ResponseEntity<>(obj,HttpStatus.CREATED);
    }
    
    @GetMapping("/api/door")
    public ResponseEntity<List<Door>> get()
    {
        List<Door> obj2=doorService.getting();
        return new ResponseEntity<>(obj2,HttpStatus.OK);
    }    
    
    @GetMapping("/api/door/{doorId}")
    public ResponseEntity<Door> getbyId(@PathVariable int doorId)
    {
        Door obj3=doorService.getbyId(doorId);
        return new ResponseEntity<>(obj3,HttpStatus.OK);
    }

    @GetMapping("/api/door/accessType/{accessType}")
    public ResponseEntity<List<Door>> gett(@PathVariable String accessType)
    {
        List<Door> obj4=doorService.getacc(accessType);
        return new ResponseEntity<>(obj4,HttpStatus.OK);
    }  
    
}
