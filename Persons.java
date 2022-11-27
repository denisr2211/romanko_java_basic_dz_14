/* ДЗ 14. Фитнес трекер
    1. Сделайте программу для фитнес трекера, которая будет регистрировать нового пользователя создавая ему аккаунт,
    принимая следующие параметры:
        a. Неизменяемые (задаются только при создании аккаунта, и могут быть получены только с помощью геттеров):
            - Имя
            - Дата рождения (отдельно день, месяц, год)
            - Емейл
            - Телефон
        b. Изменяемые:
            - Фамилия
            - Вес
            - Давление
            - Количество пройденных за день шагов
    2. Создавать каждого пользователя необходимо через конструктор, принимая все поля на вход конструктора.
    3. Добавить метод printAccountInfo() при вызове которого распечатывать все данные о пользователе
    4. После приема года - высчитывать возраст пользователя во внутреннюю переменную age (отталкиваясь просто
    от 2020 года, усложнять тут не будем), для которой сделать только геттер и выводить на экран вместе с остальными
    полями в методе printAccountInfo(); в конструкторе либо геттерах/сеттерах не используем вывод в консоль
    5. В main-классе создать 3-5 пользователей и распечатать данные каждого вызвав метод printAccountInfo();
    для двух пользователей изменить несколько полей и распечатать новые данные повторно
*/

public class Persons extends FitnessTracker {

    Persons(String name, String surname, String dateOfBirth, String email, String number, int weight, String bloodPressure, int stepsPerDay) {
        super(name, surname, dateOfBirth, email, number, weight, bloodPressure, stepsPerDay);
    }

    public static void main(String[] args) {
        Persons person1 = new Persons("Will", "Smith", "01/02/1992", "will_smith@gmail.com",
                "777555999", 82, "123/85", 17300);

        Persons person2 = new Persons("Jackie", "Chan", "07/12/1987", "jackie_chan@gmail.com",
                "555999777", 60, "110/75", 25000);

        Persons person3 = new Persons("Sherlock", "Holmes", "11/07/1957", "sherlock_holmes@gmail.com",
                "1234509876", 73, "117/80", 5000);


        accountInfo(person1);
        accountInfo(person2);
        accountInfo(person3);

        person1.setWeight(85);
        person1.setStepsPerDay(15300);
        person1.setBloodPressure("130/90");

        person2.setSurname("Ivanov");
        person2.setStepsPerDay(12700);
        person2.setWeight(63);

        //changes was successfully accomplished;

        accountInfo(person1);
        accountInfo(person2);

    }
}
