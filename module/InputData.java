import java.util.Arrays;
import java.util.Scanner;

public class InputData {

    private String[] listTypes = new String[] { "лошадь", "осел", "верблюд", "кошка", "собака", "хомяк" };
    private Scanner sc = new Scanner(System.in, "UTF-8");

    /**
     * Метод для конвертирования строчной даты рождения в массив.
     * 
     * @return массив даты рождения [день, месяц, год]
     */
    public int[] correctBirthday() {
        String values = chechBithData();
        if (values != null) {
            int[] birthData = new int[3];
            for (int i = 0; i < values.split(" ").length; i++) {
                birthData[i] = Integer.parseInt(values.split(" ")[i]);
            }
            return birthData;
        }
        return null;
    }

    /**
     * Метод для проверки введеной даты рождения по шаблону.
     * 
     * @return строку даты рождения.
     */
    private String chechBithData() {
        System.out.print("Введите дату рождения: ");
        String birthday = sc.nextLine();
        while (!birthday.matches("\\d{2} \\d{2} \\d{4}") && !birthday.equalsIgnoreCase("н")) {
            System.out.print(
                    "Ошибка ввода даты рождения (шаблон для ввода: dd mm yyyy)\nПовторите попытку (для выхода введите 'н'): ");
            birthday = sc.nextLine();
        }
        return !birthday.equalsIgnoreCase("н") ? birthday : null;
    }

    /**
     * Метод для ввода команд которым обучено животное.
     * 
     * @return список команд.
     */
    public String[] inputCommands() {
        String[] commands;
        int countCommand = 0;
        System.out.print("Введите количество команд, которые выполняет животное: ");
        boolean flag;
        do {
            try {
                countCommand = sc.nextInt();
                sc.nextLine();
                flag = false;
            } catch (Exception e) {
                System.out.print("Ошибка ввода!\nПожалуйста введите количество выполняемых команд цифрой: ");
                sc.nextLine();
                flag = true;
            }
        } while (flag);

        commands = new String[countCommand];

        for (int i = 0; i < commands.length; i++) {
            System.out.printf("Введите %d-ю команду: ", (i + 1));
            commands[i] = sc.nextLine();
        }
        return commands;
    }

    /**
     * Метод для ввода имени животного.
     * 
     * @return имя животного
     */
    public String correctName() {
        System.out.print("Введите имя для животного: ");
        return sc.nextLine();
    }

    /**
     * Метод для проверки введеного поддерживаемого типа животного из списка.
     * 
     * @return корректный и поддерживаемый тип животного.
     */
    public String correctType() {
        String type;
        boolean flag = true;
        System.out.printf("Введите тип животного из списка %s: ", Arrays.toString(listTypes));
        do {
            type = sc.nextLine();
            if (!type.equalsIgnoreCase("н")) {
                for (int i = 0; i < listTypes.length; i++) {
                    if (listTypes[i].equalsIgnoreCase(type)) {
                        flag = false;
                    }
                }
                if (flag)
                    System.out.print(
                            "Ошибка ввода!\nЖивотное такого типа не может содержаться в нашем питомнике.\nПовторите попытку ввода (для выхода введите 'н'): ");
                            System.out.println(type + " | ");
            }
        } while (flag && !type.equalsIgnoreCase("н"));
        return type.equalsIgnoreCase("н") ? "н" : type;
    }

}
