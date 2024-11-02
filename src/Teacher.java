public class Teacher extends Person{
private String subject;

    public Teacher(String name, int age) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void performDuty() {
        System.out.println("Учитель "+getName()+" преподает предмет "+subject);
    }

    public void teach(){
        System.out.println("Учитель "+getName()+" объясняет новую тему по "+subject);
    }

    @Override
    public void callPersonToDuty() {
        System.out.println("Учитель "+getName()+" объясняет урок по " +getSubject());
    }

    public void dop(){
        System.out.println(getName()+" проводит дополнительные занятия по "+getSubject());
    }
}
