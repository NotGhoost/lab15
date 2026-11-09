public class Main {
    public static void main(String[] args) {
        // new Furniture(...) создать нельзя: Furniture — абстрактный класс.
        Furniture[] furniture = {
            new Table("Письменный стол", "Дерево", 250, 4),
            new Table("Рабочий стол", "Металл", 320, 4),
            new Table("Офисный стол", "ДСП", 180, 4),
            new Chair("Стул", "Дерево", 80, true),
            new Chair("Табурет", "Дерево", 50, false)
        };
        for (Furniture item : furniture) {
            item.displayInfo();
            System.out.println();
        }
    }
}
