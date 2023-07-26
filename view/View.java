public class View {
    public void menuUI() {
        System.out.println("\tМеню программы.");
        System.out.println("1. Добавить животное.");
        System.out.println("2. Обучить животное новым командам.");
        System.out.println("3. Показать список животных.");
        System.out.println("4. Удалить животное из базы.");
        System.out.println("5. Выход.");
        System.out.print("Выберите пункт меню: ");
    }

    public void continueWork() {
        System.out.print("\033[H\033[2J");
        System.out.println("Список животных пуст.");
        System.out.println("Для выхода в меню нажмите Enter...");
    }

    public String separator(){
        return "\n---------------------------------------";
    };

}
