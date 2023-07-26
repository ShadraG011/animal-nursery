

public class Hamsters extends HomePets {
    private String TYPE = "Хомяк";

    @Override
    public String getAnimalType() {
        return super.getAnimalType() + ": " + TYPE;
    }

    public Hamsters() {
    }

    public Hamsters(String name, String[] commands, int[] birthday) {
        setAnimalName(name);
        setCommands(commands);
        setBithday(birthday);
    }
}
