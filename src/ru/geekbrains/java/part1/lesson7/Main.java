package ru.geekbrains.java.part1.lesson7;

/**
 * 1. Расширить задачу про котов и тарелки с едой. (брать из методички)
 * <p>
 * 2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
 * (например, в миске 10 еды, а кот пытается покушать 15-20).
 * <p>
 * 3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны).
 * Если коту удалось покушать (хватило еды), сытость = true.
 * <p>
 * 4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает,
 * то есть не может быть наполовину сыт (это сделано для упрощения логики программы).
 * <p>
 * 5. Создать массив котов и тарелку с едой,
 * попросить всех котов покушать из этой тарелки и потом вывести информацию о сытости котов в консоль.
 * <p>
 * 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("Creating objects...");
        Cat[] cats = {
                new Cat("Tom", 5),
                new Cat("Bob", 10),
                new Cat("Jam", 20),
        };
        Plate plate = new Plate(0);
        printStatus(cats, plate);

        System.out.println("Feel the plate with 20 food...");
        plate.increaseFood(20);
        printStatus(cats, plate);

        System.out.println("Feed the cats...");
        for (Cat cat : cats)
            cat.eat(plate);
        printStatus(cats, plate);

    }

    private static void printStatus(Cat[] cats, Plate plate) {
        for (Cat cat : cats)
            cat.info();
        plate.info();
        System.out.println();
    }


}
