public class Principal extends Person{
private int yearsOfExperience;

    public Principal(String name, int age) {
        super(name, age);
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public void performDuty() {
        System.out.println("Директор "+getName()+" управляет школой с опытом в "+yearsOfExperience+" лет");
        System.out.println("Возраст "+getAge());
    }

    public void manage(){
        System.out.println("Директор "+getName()+" проводит собрание с учителями");
    }

    public void str(){
        System.out.println(getName()+" утверждает расписание учащихся");
    }
}
