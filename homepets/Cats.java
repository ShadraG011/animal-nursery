
public class Cats extends HomePets{
    private String TYPE = "Кошка";

    @Override
    public String getAnimalType() {
        return super.getAnimalType() + ": " + TYPE;
    }
    
    public Cats() {
    }

    public Cats(String name, String[] commands, int[] birthday) {
        setAnimalName(name);
        setCommands(commands);
        setBithday(birthday);
    }
}
