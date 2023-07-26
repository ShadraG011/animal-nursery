public class Donkeys extends PackAnimals {
    private String TYPE = "Осел";

    @Override
    public String getAnimalType() {
        return super.getAnimalType() + ": " + TYPE;
    }

    public Donkeys() {

    }

    public Donkeys(String name, String[] commands, int[] birthday) {
        setAnimalName(name);
        setCommands(commands);
        setBithday(birthday);
    }
}
