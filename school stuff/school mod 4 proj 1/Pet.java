public class Pet {
    private String petType = "-1";
    private String petName = "-1";
    private int petAge = -1;
    private int dogSpaces = -1;
    private int catSpaces = -1;
    private int daysStay = 0;
    private double amountDue = -1;


    // Constructor method
    public Pet(String petName, int catSpaces, int dogSpaces, String petType, int petAge, int daysStay, double amountDue){
        this.petName = petName;
        this.petType = petType;
        if(this.petType == "cat"){
            this.catSpaces = catSpaces;
        } else if (this.petType == "dog"){
            this.dogSpaces = dogSpaces;
        };
        this.petAge = petAge;
        this.daysStay = daysStay;
        this.amountDue = amountDue;
    }

    
    // Accessors
    public String getPetType(String[] args){
        return this.petType;
    };
    
    public String getPetName(String[] args) {
        return this.petName;
    };

    public int getPetAge() {
        return this.petAge;
    };

    public int getDogSpaces() {
        return this.dogSpaces;
    };

    public int getCatSpaces() {
        return this.catSpaces;
    };

    public int getDaysStay() {
        return this.daysStay;
    };
    
    public double getAmountDue() {
        return this.amountDue;
    };


    // Mutators
    public void setPetAge(int age) {
        this.petAge = age;
        return;
    };

    public void setPetType(String petType){
        this.petType = petType;
        return;
    };
        
    public void setPetName(String petName) {
        this.petName = petName;
        return;
    };
    
    public void setDogSpaces(int spaces) {
        this.dogSpaces = spaces;
        return;
    };
    
    public void setCatSpaces(int spaces) {
        this.catSpaces = spaces;
        return;
    };
    
    public void setDaysStay(int days) {
        this.daysStay = days;
        return;
    };

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
        return;
    };
    
};
