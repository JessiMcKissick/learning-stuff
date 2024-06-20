public class Cat {
    private String name;
    private int catSpaceNumber;

    //Constructor
    public Cat(String name, int catSpace){
        this.name = name;
        this.catSpaceNumber = catSpace;
    };


    // Accessors
    public int getCatSpaceNumber(){
        return this.catSpaceNumber;
    };
    
    public String getCatName() {
        return this.name;
    };


    // Mutator(s)
    public void setCatSpaceNumber(int space) {
        this.catSpaceNumber = space;
    };

    public void setCatName(String name) {
        this.name = name;
    };
}
