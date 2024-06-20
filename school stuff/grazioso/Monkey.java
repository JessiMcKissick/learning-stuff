import java.lang.String;

// SPEC //
// ○ Inherits from the RescueAnimal class
// ○ Includes monkey-specific attributes
// ○ Includes mutator and accessor methods for each attribute 

// Acceptable monkey types //
// • Capuchin
// • Guenon
// • Macaque
// • Marmoset 
// • Squirrel monkey
// • Tamarin 

// Monkey specific attributes //
// tail length, height, body length, and species. 

public class Monkey extends RescueAnimal{
    // Relevant data variables set to private to ensure proper access methods
    private String height, bodyLength,species, tailLength;

    public Monkey(String name, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry, String monkeyTailLength, 
    String monkeyHeight, String monkeyBodyLength, String monkeySpecies){
        // Initialize attributes
        setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        setTailLength(monkeyTailLength);
        setHeight(monkeyHeight);
        setBodyLength(monkeyBodyLength);
        setSpecies(monkeySpecies);
    };
    
    // Accessor methods
    // Returns private data correctly
    public String getTailLength(){
        return this.tailLength;
    };
    public String getHeight(){
        return this.height;
    };
    public String getBodyLength(){
        return this.bodyLength;
    };
    public String getSpecies(){
        return this.species;
    };

    // Mutator methods
    // Alters private data safely
    public void setTailLength(String inp){
        this.tailLength = inp;
    };
    public void setHeight(String inp){
        this.height = inp;
    };
    public void setBodyLength(String inp){
        this.bodyLength = inp;
    };
    public void setSpecies(String inp){
        this.species = inp;
    };


}
