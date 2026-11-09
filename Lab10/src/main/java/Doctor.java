public class Doctor implements Workable, Teachable {
    private final String name;
    private final int experience;
    private final String specialization;
    private final int students;
    public Doctor(String name, int experience, String specialization, int students) {
        this.name = name;
        this.experience = experience;
        this.specialization = specialization;
        this.students = students;
    }
    @Override
    public void work() { System.out.println("Врач " + name + " (" + specialization + ") лечит пациентов."); }
    @Override
    public int getExperience() { return experience; }
    @Override
    public void teach() { System.out.println("Врач " + name + " обучает студентов-медиков: " + students); }
    @Override
    public int getStudents() { return students; }
}
