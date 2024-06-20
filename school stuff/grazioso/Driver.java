import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    // Arraylists to hold animal objects
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();

    public static void main(String[] args) {
        boolean isMenu = true;
        Scanner scnr = new Scanner(System.in);
        initializeDogList();
        initializeMonkeyList();

        while (isMenu == true) {
            displayMenu();
            String input = scnr.nextLine();
            if (input.equals("1")) {
                System.out.println(input);
                intakeNewDog(scnr);
            } else if (input.equals("2")) {
                intakeNewMonkey(scnr);
            } else if (input.equals("3")){
                reserveAnimal(scnr);
            } else if (input.equals("4")){
                printAnimals("dog");
            } else if (input.equals("5")) {
                printAnimals("monkey");
            } else if (input.equals("6")){
                printAnimals("allAvailable");
            } else if (input.equals("q")){
                isMenu = false;
                return;
            }
        };
    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }


    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", false, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    // Adds monkeys to a list for testing
    public static void initializeMonkeyList() {
        // Needless to say I know nothing about monkies
        Monkey monkey1 = new Monkey("bobo", "female", "8", "10.5", "02-03-2021", "United States", "Phase I", false,
                "United States", "10.1", "23.6", "17.8", "Capuchin");
        Monkey monkey2 = new Monkey("timble", "male", "9", "10.5", "02-03-2021", "United States", "in service", false,
                "United States", "13.1", "23.6", "17.8", "Capuchin");
        Monkey monkey3 = new Monkey("robert", "male", "10", "10.5", "02-03-2021", "United States", "in service", true,
                "United States", "12.1", "23.6", "17.8", "Capuchin");
        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
        monkeyList.add(monkey3);
    }

    // Prompts user for various information and validates to create new animal objects and adds them to relevant arraylist,
    public static void intakeNewDog(Scanner scanner) {
        boolean isReserved = false;
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();  
        for (Dog dog : dogList) {
            if (dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; // returns to menu
            }
        }      
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();        
        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();        
        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();        
        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();        
        System.out.println("When was the dog acquired?");
        String acquisitionDate = scanner.nextLine();        
        System.out.println("in what country was the dog acquired?");
        String country = scanner.nextLine();        
        System.out.println("Dog training phase?");
        String trainingStatus = scanner.nextLine();        
        System.out.println("Is the dog reserved? Yes/No");
        String reserved = scanner.nextLine();   
        if(reserved.equalsIgnoreCase("yes")){
            isReserved = true;
        } else if (reserved.equalsIgnoreCase("no")) {
            isReserved = false;
        } else {
            System.out.println("This is not an accepted input");
        }
        System.out.println("In which service country is the dog?");
        String inServiceCountry = scanner.nextLine();
        Dog newDog = new Dog(name,breed,gender,age,weight,acquisitionDate,country,trainingStatus,isReserved,inServiceCountry);
        dogList.add(newDog);
    }


    // Prompts user for various information and validates to create new animal
    // objects and adds them to relevant arraylist,
    public static void intakeNewMonkey(Scanner scanner) {
        String[] acceptableBreeds = {"Capuchin", "Guenon", "Macaque", "Marmoset", "Squirrel monkey", "Tamrin"};
        boolean safeBreed = false;
        boolean isReserved = false;
        System.out.println("What is the monkey's name?");
        String name = scanner.nextLine();
        for (Monkey monkey : monkeyList) {
            if (monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return; // returns to menu
            }
        }
        System.out.println("What is the monkey's species?");
        String species = scanner.nextLine();
        for(int i = 0; i < acceptableBreeds.length; ++i){
            if(species.equalsIgnoreCase(acceptableBreeds[i])){
                safeBreed = true;
            };
        }
        if(!safeBreed){
            System.out.println("\n\nThis is not an accepted breed.\n\n");
            return;
        }
        System.out.println("What is the monkey's gender?");
        String gender = scanner.nextLine();
        System.out.println("What is the monkey's age?");
        String age = scanner.nextLine();
        System.out.println("What is the monkey's weight?");
        String weight = scanner.nextLine();
        System.out.println("What is the monkey's height?");
        String height = scanner.nextLine();            
        System.out.println("What is the monkey's body length?");
        String bodyLength = scanner.nextLine();       
        System.out.println("What is the monkey's tail length?");
        String tailLength = scanner.nextLine();              
        System.out.println("When was the monkey acquired?");
        String acquisitionDate = scanner.nextLine();
        System.out.println("in what country was the monkey acquired?");
        String country = scanner.nextLine();
        System.out.println("monkey training phase?");
        String trainingStatus = scanner.nextLine();
        System.out.println("Is the monkey reserved? Yes/No");
        String reserved = scanner.nextLine();
        if (reserved.equalsIgnoreCase("yes")) {
            isReserved = true;
        } else if (reserved.equalsIgnoreCase("no")) {
            isReserved = false;
        } else {
            System.out.println("This is not an accepted input");
        }
        System.out.println("In which service country is the monkey?");
        String inServiceCountry = scanner.nextLine();
        
        Monkey newMonkey = new Monkey(name,gender,age,weight,acquisitionDate,country,trainingStatus,isReserved,inServiceCountry,tailLength,height,bodyLength,species);
        monkeyList.add(newMonkey);        }

    // Searches for available animals and sets reserved property to true when an animal is found or alerts user there are
    // no available animals if none are found.
    public static void reserveAnimal(Scanner scanner) {
        String availableAnimal = "";

        System.out.println("Input type of animal to be reserved: ");
        String type = scanner.nextLine();
        System.out.println("Input service country of animal to be reserved: ");
        String serviceCountry = scanner.nextLine();
        if (type.equalsIgnoreCase("dog")) {
            for (Dog dog : dogList){
                if(dog.getInServiceLocation().equalsIgnoreCase(serviceCountry)){
                    availableAnimal = dog.getName();
                    dog.setReserved(true);
                    break;
                }
            }
        } else if (type.equalsIgnoreCase("monkey")) {
            for (Monkey monkey : monkeyList) {
                if (monkey.getInServiceLocation().equalsIgnoreCase(serviceCountry)) {
                    availableAnimal = monkey.getName();
                    monkey.setReserved(true);
                    break;
                }
            }
        } else {
            System.out.println("\n\nThis type of animal is not available.\n\n");
            return;
        };
        if(availableAnimal.equalsIgnoreCase("")){
            System.out.println("No available animals with these criteria are available at this time.");
        } else {
            System.out.println("\n\nThe " + type + " named " + availableAnimal + " in " + serviceCountry + " has been reserved for you.\n\n");
        }

    }
    // Prints something dependent on input.
    // printed data includes name, status, country acquired, and reservation status. 
    public static void printAnimals(String typeAnimal) {
        if(typeAnimal.equalsIgnoreCase("dog")){
            for (Dog dog : dogList) {
                System.out.println("Name: " + dog.getName());
                System.out.println("Status: " + dog.getTrainingStatus());
                System.out.println("Country Acquired: " + dog.getAcquisitionLocation());
                System.out.println("Is reserved?: " + dog.getReserved() + "\n");
            }
        } else if (typeAnimal.equalsIgnoreCase("monkey")){
            for (Monkey monkey : monkeyList) {
                System.out.println("Name: " + monkey.getName());
                System.out.println("Status: " + monkey.getTrainingStatus());
                System.out.println("Country Acquired: " + monkey.getAcquisitionLocation());
                System.out.println("Is reserved?: " + monkey.getReserved() + "\n");
            }
        } else if (typeAnimal.equalsIgnoreCase("allAvailable")){
            System.out.println("\n\nMonkies:\n");
            for (Monkey monkey : monkeyList){
                if(monkey.getReserved() == false && monkey.getTrainingStatus().equalsIgnoreCase("in service")){
                    System.out.println("Name: " + monkey.getName());
                    System.out.println("Country Acquired: " + monkey.getAcquisitionLocation() + "\n");
                }
            };
            System.out.println("\n\nDogs:\n\n");
            for (Dog dog : dogList) {
                if (dog.getReserved() == false && dog.getTrainingStatus().equalsIgnoreCase("in service")) {
                    System.out.println("Name: " + dog.getName());
                    System.out.println("Country Acquired: " + dog.getAcquisitionLocation() + "\n");
                }
            };
        }

    }
}

