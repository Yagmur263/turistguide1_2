package com.example.turistguide1_2.tourism.service;

import org.springframework.stereotype.Service;
import com.example.turistguide1_2.tourism.model.TouristAttraction;
import com.example.turistguide1_2.tourism.repository.TouristRepository;

import java.util.ArrayList;

@Service

public class TouristService {
    private final TouristRepository touristRepository;
// konstruktør
    public TouristService(TouristRepository touristRepository) {
        this.touristRepository = touristRepository;

    }

    public ArrayList<TouristAttraction> getAllData(){
        return touristRepository.getAllData();

    }

    public TouristAttraction getDataByName(String name){
        return touristRepository.getDataByName(name);
    }

    public TouristAttraction addData(TouristAttraction attraction){
        return touristRepository.addData(attraction);
    }

    public TouristAttraction updateAttractions(String name, TouristAttraction updatedAttraction){
        return touristRepository.updateAttraction(name, updatedAttraction);
    }

    public boolean deleteAttraction (String name) {
        return touristRepository.deleteAttraction(name);
    }
    }











