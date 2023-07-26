
public class Dogs extends HomePets {
    private String TYPE = "Собака";

    @Override
    public String getAnimalType() {
        return super.getAnimalType() + ": " + TYPE;
    }

    public Dogs() {
    }

    public Dogs(String name, String[] commands, int[] birthday) {
        setAnimalName(name);
        setCommands(commands);
        setBithday(birthday);
    }
}
