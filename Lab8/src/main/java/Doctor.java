public class Doctor extends Professional {
    private final String specialization;
    public Doctor(String name, int experience, double rating, String specialization) {
        super(name, experience, rating);
        this.specialization = specialization;
    }
    @Override
    public void work() { System.out.println("Лечит пациентов"); }
    @Override
    public void displayInfo() { super.displayInfo(); System.out.println("Специализация: " + specialization); }
    public void diagnose() { System.out.println(getName() + " проводит диагностику."); }
}
