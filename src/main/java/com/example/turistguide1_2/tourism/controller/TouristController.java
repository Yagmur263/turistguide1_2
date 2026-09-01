package com.example.turistguide1_2.tourism.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.turistguide1_2.tourism.model.TouristAttraction;
import com.example.turistguide1_2.tourism.service.TouristService;

import java.util.ArrayList;

@RestController
@RequestMapping("attractions")
public class TouristController{
    private final TouristService touristService;

    public TouristController(TouristService touristService) {
        this.touristService = touristService;
    }

    @GetMapping()
    public ResponseEntity<ArrayList<TouristAttraction>> getAllAttractions(){
        ArrayList<TouristAttraction> attractions = touristService.getAllData();

        if (attractions != null){
            return new ResponseEntity<>(attractions, HttpStatus.OK);
        }
        return new ResponseEntity<>(attractions, HttpStatus.NOT_FOUND);
    }

    @GetMapping("/{name}")
    public ResponseEntity<TouristAttraction> getAttractionByName(@PathVariable String name){
        TouristAttraction attraction = touristService.getDataByName(name);

        if (attraction != null){
            return new ResponseEntity<>(attraction, HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/add")
    public ResponseEntity<TouristAttraction> addAttraction(@RequestBody TouristAttraction attraction){
        TouristAttraction createdAttraction = touristService.addData(attraction);
        return new ResponseEntity<>(createdAttraction, HttpStatus.CREATED);
    }

    @PostMapping("/update")
    public ResponseEntity<TouristAttraction> updateAttractions(@PathVariable String name, TouristAttraction updatedAttraction){
        TouristAttraction updateAttraction = touristService.updateAttractions(name, updatedAttraction);

        if (updateAttraction != null){
            return new ResponseEntity<>(updateAttraction, HttpStatus.OK);
        }

        return new ResponseEntity<>(updateAttraction, HttpStatus.NOT_FOUND);
    }

    @PostMapping("/delete/{name}")
    public ResponseEntity<Boolean> deleteAttractions(@PathVariable String name){
        boolean deleteAttraction = touristService.deleteAttraction(name);

        if (deleteAttraction){
            return new ResponseEntity<>(deleteAttraction, HttpStatus.OK);
        }

        return new ResponseEntity<>(deleteAttraction, HttpStatus.NOT_FOUND);
    }

}
