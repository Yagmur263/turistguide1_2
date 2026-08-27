package tourism.repository;

import org.springframework.stereotype.Repository;
import tourism.model.TouristAttraction;

import java.util.ArrayList;

@Repository
public class TouristRepository {
    ArrayList<TouristAttraction> data = new ArrayList<>();


    public TouristRepository(){
        TouristAttraction touristAttraction1 = new TouristAttraction("Mount Everest", "En kæmpe sten!");
        TouristAttraction touristAttraction2 = new TouristAttraction("Tsunami", "Pas på herover!");

        data.add(touristAttraction1);
        data.add(touristAttraction2);
    }

}
