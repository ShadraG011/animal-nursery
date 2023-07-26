

import java.io.IOException;
import java.util.Scanner;

class Controller implements AutoCloseable {

    private InputData id = new InputData();;
    private ShowAnimals sa = new ShowAnimals();
    private View v = new View();
    private Scanner sc = new Scanner(System.in, "utf-8");
    private Counter c = new Counter();
    private ChangeAnimalCommands cac = new ChangeAnimalCommands();
    private DeleteAnimal da = new DeleteAnimal();

    /**
     * Метод навигации по меню.
     */
    public void menu() {
        String point = "";
        boolean flag = true;
        while (!point.equalsIgnoreCase("5")) {
            System.out.print("\033[H\033[2J");
            v.menuUI();
            point = sc.nextLine();
            switch (point) {
                case "1":
                    do {
                        System.out.print("\033[H\033[2J");
                        c.add();
                        System.out.print("Добавить другое животное? (д/н): ");
                    } while (!sc.nextLine().equalsIgnoreCase("н"));
                    break;
                case "2":
                    if (c.countAnimals != 0) {
                        do {
                            System.out.print("\033[H\033[2J");
                            sa.showAnimalList(c, v.separator());
                            cac.changeCommands(c);
                            System.out.print("Повторить изменение? (д/н): ");
                        } while (!sc.nextLine().equalsIgnoreCase("н"));
                    } else {
                        v.continueWork();
                        sc.nextLine();
                    }
                    break;
                case "3":
                    if (c.countAnimals != 0) {
                        System.out.print("\033[H\033[2J");
                        sa.showAnimalList(c, v.separator());
                        System.out.println("Для выхода в меню нажмите Enter...");
                        sc.nextLine();
                    } else {
                        v.continueWork();
                        sc.nextLine();
                    }
                    break;
                case "4":
                    do {
                        if (c.countAnimals != 0) {
                            System.out.print("\033[H\033[2J");
                            sa.showAnimalList(c, v.separator());
                            da.delAnimal(c);
                            System.out.print("Повторить удаление? (д/н): ");
                        } else {
                            v.continueWork();
                            sc.nextLine();
                            flag = false;
                        }
                    } while (flag && !sc.nextLine().equalsIgnoreCase("н"));
                    break;
                case "5":
                    System.out.println("Спасибо, что использовали наше приложение!");
                    break;
                default:
                    System.out.println("Такого пункта нет в меню!");
                    break;
            }
        }
    }

    /**
     * Метод для открытия ресурса InputData.
     * 
     * @return объекст класса InputData.
     */
    public InputData open() {
        return id;
    }

    @Override
    public void close() throws IOException {
        id = null;
    };
}
