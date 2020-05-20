package Week1.Task4;

/** Создайте 3 собаки и присвойте им имена сразу при инициализации объекта (через конструктор)
 * и попросите каждую собаку гавкнуть свое имя (вызвать функцию bark)
 *  */
public class Task4 {
    public static void main(String[] args){
        Dog dog1 = new Dog ("Стефан");
        Dog dog2 = new Dog ("Стивен");
        Dog dog3 = new Dog ("Ричард");

        dog1.bark();
        dog2.bark();
        dog3.bark();
    }
}

class Dog{
    private String name;

    public Dog (String name) {
        this.name = name;
    }

    public void bark(){
        System.out.println("whoof! my name is " + this.name + ", whoof!");
    }
}
