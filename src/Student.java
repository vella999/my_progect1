public class Student extends Person {
    private int grade;

    public Student(String name, int age) {
        super(name, age);
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public void performDuty() {
        System.out.println("Студент " + getName() + " учится на " + grade+" курсе");
    }

    public void study() {
        System.out.println("Студент " + getName() + " делает домашнее задание");
    }

    @Override
    public void callPersonToDuty() {
        System.out.println(getName() + " учит уроки усердно)");
        System.out.println("Возраст " + getAge());
    }

    public void tik(){
        System.out.println("У "+getName()+" есть студенческий билет");
    }
}

