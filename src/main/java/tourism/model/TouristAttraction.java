package tourism.model;

public class TouristAttraction {
    String name;
    String description;


    // CONSTRUCTOR
    public TouristAttraction(String name, String description){
        this.name = name;
        this.description = description;
    }

    // GETTERS
    public String getTouristAttractionName(){
        return name;
    }

    public String getTouristAttractionDescription(){
        return description;
    }

    // SETTERS

    public String setTouristAttractionName(String name){
        return this.name = name;
    }

    public String setTouristAttractionDescription(String description){
        return this.description = description;
    }


    // TO STRING
    @Override
    public String toString(){
        return "Name: " + this.name + "\n Description: " + this.description
    }
}
