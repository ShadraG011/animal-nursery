public class Horses extends PackAnimals {
    private String TYPE = "Лошадь";

    @Override
    public String getAnimalType() {
        return super.getAnimalType() + ": " + TYPE;
    }

    public Horses() {
    }

    public Horses(String name, String[] commands, int[] birthday) {
        setAnimalName(name);
        setCommands(commands);
        setBithday(birthday);
    }
}
