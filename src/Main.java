
public class Main {
public static void main(String[] args){
Car car = new Car(4);
car.make = "BMW";
car.model = "x6";
car.year = 2022;
    System.out.println(car.getDescription());
    Motorcycle moto = new Motorcycle("Нет");
    moto.make = "Yamaha";
    moto.model = "YZF-R6";
    moto.year = 2007;
    System.out.println(moto.getDescription());

}
}
//Задача: Система учета транспортных средств
//Условие:
//Создайте базовый класс Vehicle (Транспортное средство) с полями:
//make (марка)
//model (модель)
//year (год выпуска)
//
//В этом классе реализуйте метод:
//getDescription() — который возвращает строку с информацией о транспортном средстве в формате:
//"Марка: [make], Модель: [model], Год: [year]"
//Создайте два дочерних класса:
//1. Car (Автомобиль), который имеет дополнительное поле:
//numberOfDoors (количество дверей) И переопределяет метод getDescription() для добавления информации о количестве дверей.
//2. Motorcycle (Мотоцикл), который имеет дополнительное поле:
//hasSidecar (есть ли коляска) И переопределяет метод getDescription() для добавления информации о наличии коляски.
//
//Требования:
//В каждом классе создайте конструктор для инициализации полей.
//В классе Main создайте объекты классов Car и Motorcycle, вызовите их методы getDescription() и выведите информацию на экран.


