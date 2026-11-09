public class Engineer extends Professional {
    private final String project;
    public Engineer(String name, int experience, double rating, String project) {
        super(name, experience, rating);
        this.project = project;
    }
    @Override
    public void work() { System.out.println("Проектирует системы"); }
    @Override
    public void displayInfo() { super.displayInfo(); System.out.println("Проект: " + project); }
    public void design() { System.out.println(getName() + " разрабатывает проект «" + project + "»."); }
}
