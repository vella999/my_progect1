public class Main {
    public static void main(String[] args) {
Student student = new Student("Вася",15);
student.study();
student.setGrade(1);
student.performDuty();
student.callPersonToDuty();
student.setName("Васи");
student.tik();
    System.out.println();
Teacher teacher = new Teacher("Светлана Сергеевна", 35);
teacher.setSubject("Информатика");
teacher.performDuty();
teacher.setSubject("Информатике");
teacher.callPersonToDuty();
teacher.teach();
teacher.setSubject("Математике");
teacher.dop();
        System.out.println();
Principal principal = new Principal("Гертруда Альбертовна", 65);
principal.setYearsOfExperience(40);
principal.performDuty();
principal.manage();
principal.str();
    }
}



