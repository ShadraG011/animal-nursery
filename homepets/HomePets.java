
import java.util.ArrayList;

public class HomePets {
    private String ANIMAL_TYPE = "Домашнее животное";
    private String animalName;
    private String[] commands;
    private int[] bithday;

    private ArrayList<HomePets> homePetsList = new ArrayList<HomePets>();
    
    public void addPetInList(HomePets pets){
        if (!pets.animalName.equals(null) && pets.bithday != null && !pets.ANIMAL_TYPE.equals(null) && pets.commands != null) {
            homePetsList.add(pets);
        }
    }

    public ArrayList<HomePets> showHomePetsList(){
        return homePetsList;
    }
    
    public String getAnimalType() {
        return ANIMAL_TYPE;
    };

    public String[] getCommands() {
        return commands;
    };

    public void setCommands(String[] commands) {
        this.commands = commands;
    };

    public String getAnimalName() {
        return animalName;
    };

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    };

    public int[] getBithday() {
        return bithday;
    };

    public void setBithday(int[] bithday) {
        this.bithday = bithday;
    };
}