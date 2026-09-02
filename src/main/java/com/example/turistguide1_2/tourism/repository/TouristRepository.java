package com.example.turistguide1_2.tourism.repository;

import org.springframework.stereotype.Repository;
import com.example.turistguide1_2.tourism.model.TouristAttraction;

import java.util.ArrayList;

@Repository
public class TouristRepository {
    ArrayList<TouristAttraction> data = new ArrayList<>();


    public TouristRepository() {
        TouristAttraction touristAttraction1 = new TouristAttraction("D'Angleterre Hotel", "Danmarks mest exclusive hotel med de bedste desserter!");
        TouristAttraction touristAttraction2 = new TouristAttraction("Netto", "Den billigste supermarked i Danmark med gode varer!");
        TouristAttraction touristAttraction3 = new TouristAttraction("EK", "Top erhvervsakademi i Danmark!");
        data.add(touristAttraction1);
        data.add(touristAttraction2);
        data.add(touristAttraction3);
    }

    // Read
    public ArrayList<TouristAttraction> getAllData() {
        return data;
    }

    public TouristAttraction getDataByName(String name) {
        for (TouristAttraction attraction : data) {
            if (attraction.getTouristAttractionName().equalsIgnoreCase(name)) {
                return attraction;
            }

        }
        return null;
    }

    // create
    public TouristAttraction addData(TouristAttraction attraction) {
        data.add(attraction);
        return attraction;
    }

    //Update
    public TouristAttraction updateAttraction(String name, TouristAttraction updatedAttraction) {
        TouristAttraction existing = getDataByName(name);
        if (existing != null) {
            existing.setTouristAttractionName(updatedAttraction.getTouristAttractionName());
            existing.setTouristAttractionDescription(updatedAttraction.getTouristAttractionDescription());
            return existing;
        }
        return null;
    }

    // delete
    public boolean deleteAttraction(String name) {
        TouristAttraction attraction = getDataByName(name);
        if (attraction != null) {
            data.remove(attraction);
            return true;
        }

        return false;
    }
}