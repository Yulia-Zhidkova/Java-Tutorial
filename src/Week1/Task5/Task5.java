package Week1.Task5;

/**
 * Создайте класс кошки, объект кошки и попросите кошку мяукнуть свое имя (вывести имя в консоль)
 */
public class Task5 {
    public static void main(String[] args) {

        Cat cat = new Cat("Barsik");
        cat.meow();

    }
}

//ваш код здесь (подсказка: создайте здесь класс кошки, у кошки должно быть имя)
class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    public void meow() {
        System.out.println("Мяу, меня зовут " + this.name);
    }


}
