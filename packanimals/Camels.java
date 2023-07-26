public class Camels extends PackAnimals {
    private String TYPE = "Верблюд";

    @Override
    public String getAnimalType() {
        return super.getAnimalType() + ": " + TYPE;
    }

    public Camels() {

    }

    public Camels(String name, String[] commands, int[] birthday) {
        setAnimalName(name);
        setCommands(commands);
        setBithday(birthday);
    }
}
