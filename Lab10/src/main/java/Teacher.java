public class Teacher implements Workable, Teachable {
    private final String name;
    private final int experience;
    private final String subject;
    private final int students;
    public Teacher(String name, int experience, String subject, int students) {
        this.name = name;
        this.experience = experience;
        this.subject = subject;
        this.students = students;
    }
    @Override
    public void work() { System.out.println("Учитель " + name + " готовит занятия по предмету: " + subject); }
    @Override
    public int getExperience() { return experience; }
    @Override
    public void teach() { System.out.println("Учитель " + name + " обучает учеников: " + students); }
    @Override
    public int getStudents() { return students; }
}
