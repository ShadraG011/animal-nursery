import java.util.ArrayList;

public class PackAnimals {
    private String ANIMAL_TYPE = "Вьючное животное";
    private String animalName;
    private String[] commands;
    private int[] bithday;

    private ArrayList<PackAnimals> packAnimalsList = new ArrayList<PackAnimals>();
    
    public void addPackAnimalsInList(PackAnimals packAnimals){
        if (!packAnimals.animalName.equals(null) && packAnimals.bithday != null && !packAnimals.ANIMAL_TYPE.equals(null) && packAnimals.commands != null) {
            packAnimalsList.add(packAnimals);
        }
    }

    public ArrayList<PackAnimals> showPackAnimalsList(){
        return packAnimalsList;
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

    protected void setAnimalName(String animalName) {
        this.animalName = animalName;
    };

    public int[] getBithday() {
        return bithday;
    };

    protected void setBithday(int[] bithday) {
        this.bithday = bithday;
    };
}
