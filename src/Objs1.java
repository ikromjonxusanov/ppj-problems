//
//class Person {
//    public String name;
//    public Car car = null;
//
//    public Person(String name, Car car) {
//        this.name = name;
//        this.car = car;
//    }
//    public Person(String name) {
//        this.name = name;
//    }
//
//    public static Car[] getCars(Person[] persons) {
//        int numberOfCars = 0;
//        for (Person person : persons) {
//            if (person.car != null) {
//                numberOfCars++;
//            }
//        }
//        Car[] cars = new Car[numberOfCars];
//        int index = 0;
//        for (Person person : persons) {
//            if (person.car != null) {
//                cars[index++] = person.car;
//            }
//        }
//        return cars;
//    }
//
//    public static Car[] expensiveCars(Person[] persons, int minPrice) {
//        int numberOfCars = 0;
//        for (Person person : persons) {
//            if (person.car != null && person.car.price >= minPrice) {
//                numberOfCars++;
//            }
//        }
//        Car[] cars = new Car[numberOfCars];
//        int index = 0;
//        for (Person person : persons) {
//            if (person.car != null && person.car.price >= minPrice) {
//                cars[index++] = person.car;
//            }
//        }
//        return cars;
//    }
//
//    public static int getPrice(Person[] persons, String name) {
//        for (Person person : persons) {
//            if (person.name.equals(name)) {
//                if (person.car == null) {
//                    return -1;
//                }
//                return person.car.price;
//            }
//        }
//        return -2;
//    }
//    @Override
//    public String toString() {
//        return this.name + " " + (this.car == null ? "" : this.car.toString());
//    }
//}

//class Car {
//    public String make;
//    public int price;
//    public Car(String make, int price) {
//        this.make = make;
//        this.price = price;
//    }
//
//    @Override
//    public String toString() {
//        return this.make + " " + this.price;
//    }
//}

public class Objs1 {
    public static void main (String[] args) {
//        Car c1 = new Car("Ford", 15000);
//        Car c2 = new Car("Dodge", 11100);
//        Car c3 = new Car("Buick", 11000);
//        Person john = new Person("John", c1);
//        Person mary = new Person("Mary", c2);
//        Person kate = new Person("Kate");
//        Person lucy = new Person("Lucy", c3);
//        Person adam = new Person("Adam",
//                new Car("Opel", 18000));
//        Person[] persons = {
//                john, mary, kate, lucy, adam, new Person("Jill"),
//                new Person("Josh", new Car("Buick",12500))};
//
//        Car[] cars = Person.getCars(persons);
//        for (Car c : cars)
//            System.out.print(c + " "); // or c.info();
//        System.out.println();
//
//        cars = Person.expensiveCars(persons, 12000);
//        for (Car c : cars)
//            System.out.print(c + " "); // or c.info();
//        System.out.println();
//        String name = "Adam";
//        System.out.println("Price of " + name + "'s car: " +
//                Person.getPrice(persons, name));
    }
}