import java.util.ArrayList;
import java.util.Scanner;

public class DeleteAnimal {

    private ArrayList<HomePets> petsList;
    private ArrayList<PackAnimals> packList;
    private Scanner sc = new Scanner(System.in, "utf-8");

    /**
     * Метод для удаления животного из базы.
     * 
     * @param c экзепляр класса Counter.
     */
    public void delAnimal(Counter c) {
        petsList = c.getPetsClass();
        packList = c.getPackClass();
        boolean noAnimal = true;
        System.out.print("\nВведите имя животного которого нужно удалить из базы: ");
        String name = sc.nextLine();
        for (int i = 0; i < petsList.size(); i++) {
            for (int j = 0; j < petsList.get(i).showHomePetsList().size(); j++) {
                if (petsList.get(i).showHomePetsList().get(j).getAnimalName().equalsIgnoreCase(name)) {
                    petsList.get(i).showHomePetsList().remove(j);
                    c.countAnimals--;
                    noAnimal = false;
                }
            }
        }

        for (int i = 0; i < packList.size(); i++) {
            for (int j = 0; j < packList.get(i).showPackAnimalsList().size(); j++) {
                if (packList.get(i).showPackAnimalsList().get(j).getAnimalName().equalsIgnoreCase(name)) {
                    packList.get(i).showPackAnimalsList().remove(j);
                    noAnimal = false;
                }
            }
        }

        if (noAnimal) {
            System.out.println("Животное с таким именем не найдено!");
        }
    }
}
