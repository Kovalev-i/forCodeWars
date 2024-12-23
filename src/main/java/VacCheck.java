
/*
Задача 1
Написать функцию, определяющую ближайшую дату отправки списка в страховую с условием,
что отправка осуществляется 1, 10 и 20 числа каждого месяца в 18:00.
Если дата отправки попадает на рабочий/праздничный день -
то отправка осуществляется в предыдущий рабочий день.
дата запроса == текущему времени.
Можно использовать функцию:
public getVacCheck(java.sql.Date modDate); - проверяет дату, является ли она рабочей.
если выходной - возвращает ближайший рабочий день следующий за выходными.
Возвращает переменную типа java.sql.Date
 */

import java.sql.Date;

public class VacCheck {
    /**
     * Метод возвращает эту же дату, если передан будний день.
     * Если передан выходной день, метод возвращает ближайший будний день
     */
    public Date getVacCheck(Date modDate) {
        long millisInOneDay = 24 * 60 * 60 * 1000;
        return switch (modDate.getDay()) {
            case 0 -> new Date(modDate.getTime() + millisInOneDay);
            case 1, 2, 3, 4, 5 -> modDate;
            case 6 -> new Date(modDate.getTime() + 2 * millisInOneDay);
            default -> throw new IllegalStateException("Unexpected value: " + modDate.getDay());
        };
    }
}