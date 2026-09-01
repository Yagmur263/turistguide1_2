package tourism.service;

import org.springframework.stereotype.Service;
import tourism.model.TouristAttraction;
import tourism.repository.TouristRepository;

import java.util.ArrayList;
import java.util.List;

@Service

public class TouristService {
    private final TouristRepository touristRepository;
// konstruktør
    public TouristService(TouristRepository touristRepository) {
        this.touristRepository = touristRepository;

    }

    public List<TouristAttraction> getAlldata(){
        return touristRepository.getAlldata();

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











