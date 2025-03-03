package tn.esprit.application.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.application.entities.Application;
import tn.esprit.application.services.ApplicationService;

import java.util.List;

@RestController
@RequestMapping("application")
public class ApplicationController {
    @Autowired
    private ApplicationService applicationService;

    @GetMapping("get-all")
    public ResponseEntity<List<Application>> getAll() {
        return new ResponseEntity<>(applicationService.findAll(), HttpStatus.OK);
    }
    @GetMapping("get-by-id")
    public ResponseEntity<Application> getById(@RequestParam("id") Long id) {
        return new ResponseEntity<>(applicationService.findById(id), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<Application> create(@RequestBody Application application) {
        return new ResponseEntity<>(applicationService.save(application), HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity<Application> update(@RequestBody Application application) {
        return new ResponseEntity<>(applicationService.save(application), HttpStatus.OK);
    }
    @DeleteMapping
    public ResponseEntity<String> delete(@RequestParam("id") Long id) {
        applicationService.delete(id);
        return new ResponseEntity<>("deleted",HttpStatus.OK);
    }
}
