package Week1.Task2;

/**
 * Дописать недостающие функции принтеру
 * <p>
 * Раскомментируйте код и допишите недостающие функции
 */
public class Task2 {
    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.sayHelloWorld();
        printer.greetUserByName("Dasha");

        /** подсказка: функция должна вывести в консоль "Hello Dasha Ivanova"*/
        printer.greetUserByNameAndSurname("Dasha", "Ivanova");

        /** подсказка: функция должна вернуть "Hello Dasha Ivanova" */
        String message = printer.getGreetingMessage("Dasha", "Ivanova");
        System.out.println(message);
    }
}

class Printer {
    public void sayHelloWorld() {
        System.out.println("Hello World");
    }

    public void greetUserByName(String name) {
        System.out.println("Hello " + name);
    }

    public void greetUserByNameAndSurname(String name, String surname) {
        System.out.println("Hello " + name + " " + surname);
    }

    public String getGreetingMessage(String name, String surname) {
        return "Hello " + name + " " + surname;
    }
}