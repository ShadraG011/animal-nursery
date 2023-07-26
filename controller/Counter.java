import java.util.ArrayList;

public class Counter {
    private static Cats cats = new Cats();
    private static Dogs dogs = new Dogs();
    private static Hamsters hamsters = new Hamsters();
    private static Horses horses = new Horses();
    private static Donkeys donkeys = new Donkeys();
    private static Camels camels = new Camels();
    public int countAnimals = 0;

    /**
     * Метод для инициализации ArrayList со списком домашних животных.
     * 
     * @return ArrayList домашних животных
     */
    public ArrayList<HomePets> getPetsClass() {
        ArrayList<HomePets> animals = new ArrayList<>();
        animals.add(cats);
        animals.add(dogs);
        animals.add(hamsters);
        return animals;
    }

    /**
     * Метод для инициализации ArrayList со списком вьючных животных.
     * 
     * @return ArrayList вьючных животных
     */
    public ArrayList<PackAnimals> getPackClass() {
        ArrayList<PackAnimals> animals = new ArrayList<>();
        animals.add(horses);
        animals.add(donkeys);
        animals.add(camels);
        return animals;
    }

    /**
     * Метод работающий в блоке "try-with-resources" для добавления новых животных с
     * определением каждого в нужный класс и выбрасывания исключения.
     */
    public void add() {
        try (Controller c = new Controller()) {
            switch (c.open().correctType().toLowerCase()) {
                case "кошка":
                    countAnimals++;
                    cats.addPetInList(new Cats(c.open().correctName() + " " + countAnimals, c.open().inputCommands(),
                            c.open().correctBirthday()));
                    break;
                case "собака":
                    countAnimals++;
                    dogs.addPetInList(new Dogs(c.open().correctName() + " " + countAnimals, c.open().inputCommands(),
                            c.open().correctBirthday()));
                    break;
                case "хомяк":
                    countAnimals++;
                    hamsters.addPetInList(
                            new Hamsters(c.open().correctName() + " " + countAnimals, c.open().inputCommands(),
                                    c.open().correctBirthday()));
                    break;
                case "лошадь":
                    countAnimals++;
                    horses.addPackAnimalsInList(
                            new Horses(c.open().correctName() + " " + countAnimals, c.open().inputCommands(),
                                    c.open().correctBirthday()));
                    break;
                case "осел":
                    countAnimals++;
                    donkeys.addPackAnimalsInList(
                            new Donkeys(c.open().correctName() + " " + countAnimals, c.open().inputCommands(),
                                    c.open().correctBirthday()));
                    break;
                case "верблюд":
                    countAnimals++;
                    camels.addPackAnimalsInList(
                            new Camels(c.open().correctName() + " " + countAnimals, c.open().inputCommands(),
                                    c.open().correctBirthday()));
                    break;
            }
            c.close();
        } catch (Exception e) {
            throw new RuntimeException("Ввод данных прерван!");
        }
    }
}
