import java.util.ArrayList;

public class ShowAnimals {
    private ArrayList<HomePets> petsList;
    private ArrayList<PackAnimals> packList;

    /**
     * Метод для вывода на экран всех добавленны животных со списком команд которым
     * их обучили.
     * 
     * @param c - экземпляр класса Counter.
     * @param separator - разделительная черта.
     */
    public void showAnimalList(Counter c, String separator) {
        petsList = c.getPetsClass();
        packList = c.getPackClass();

        System.out.println("\nВсего животных: " + c.countAnimals);
        System.out.println("Список Домашних животных:");

        for (int i = 0; i < petsList.size(); i++) {
            if (petsList.get(i).showHomePetsList().size() > 0) {
                for (int j = 0; j < petsList.get(i).showHomePetsList().size(); j++) {
                    System.out.println("\n" + petsList.get(i).showHomePetsList().get(j).getAnimalType());

                    System.out.printf("Имя животного: %s\n", petsList.get(i).showHomePetsList().get(j).getAnimalName());

                    System.out.print("Список команд: ");
                    for (int k = 0; k < petsList.get(i).showHomePetsList().get(j).getCommands().length; k++) {
                        System.out.print(petsList.get(i).showHomePetsList().get(j).getCommands()[k] + " ");
                    }

                    System.out.printf("\nДата рождения:\nДень: %d Месяц: %d Год: %d\n",
                            petsList.get(i).showHomePetsList().get(j).getBithday()[0],
                            petsList.get(i).showHomePetsList().get(j).getBithday()[1],
                            petsList.get(i).showHomePetsList().get(j).getBithday()[2]);
                }
            } else {
                System.out.printf("\nСписок животного \"%s\" пуст.",
                        petsList.get(i).getAnimalType());
                System.out.println();
            }
        }
        System.out.println(separator);
        System.out.println("\nСписок Вьючных животных:");
        for (int i = 0; i < packList.size(); i++) {
            if (packList.get(i).showPackAnimalsList().size() > 0) {
                for (int j = 0; j < packList.get(i).showPackAnimalsList().size(); j++) {
                    System.out.println("\n" + packList.get(i).showPackAnimalsList().get(j).getAnimalType());

                    System.out.printf("Имя животного: %s\n",
                            packList.get(i).showPackAnimalsList().get(j).getAnimalName());

                    System.out.print("Список команд:");
                    for (int k = 0; k < packList.get(i).showPackAnimalsList().get(j).getCommands().length; k++) {
                        System.out.print(packList.get(i).showPackAnimalsList().get(j).getCommands()[k] + " ");
                    }

                    System.out.printf("\nДата рождения:\nДень: %d Месяц: %d Год: %d\n",
                            packList.get(i).showPackAnimalsList().get(j).getBithday()[0],
                            packList.get(i).showPackAnimalsList().get(j).getBithday()[1],
                            packList.get(i).showPackAnimalsList().get(j).getBithday()[2]);
                }
            } else {
                System.out.printf("\nСписок животного \"%s\" пуст.",
                        packList.get(i).getAnimalType());
                System.out.println();
            }
        }
    }
}
