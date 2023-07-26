import java.util.ArrayList;
import java.util.Scanner;

public class ChangeAnimalCommands {

    private ArrayList<HomePets> petsList;
    private ArrayList<PackAnimals> packList;
    private InputData id = new InputData();
    private Scanner sc = new Scanner(System.in, "utf-8");

    /**
     * Метод для изменения списка команд которым обучено животное
     * 
     * @param c экземпляр класса Counter
     */
    public void changeCommands(Counter c) {
        petsList = c.getPetsClass();
        packList = c.getPackClass();
        boolean noAnimal = true;
        System.out.print("\nВведите имя животного которое нужно обучить: ");
        String name = sc.nextLine();
        for (int i = 0; i < petsList.size(); i++) {
            for (int j = 0; j < petsList.get(i).showHomePetsList().size(); j++) {
                if (petsList.get(i).showHomePetsList().get(j).getAnimalName().equalsIgnoreCase(name)) {
                    petsList.get(i).showHomePetsList().get(j).setCommands(id.inputCommands());
                    noAnimal = false;
                }
            }
        }

        for (int i = 0; i < packList.size(); i++) {
            for (int j = 0; j < packList.get(i).showPackAnimalsList().size(); j++) {
                if (packList.get(i).showPackAnimalsList().get(j).getAnimalName().equalsIgnoreCase(name)) {
                    packList.get(i).showPackAnimalsList().get(j).setCommands(id.inputCommands());
                    noAnimal = false;
                }
            }
        }

        if (noAnimal) {
            System.out.println("Животное с таким именем не найдено!");
        }
    }
}
