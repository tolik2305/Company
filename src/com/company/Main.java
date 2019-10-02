package com.company;

import java.util.Scanner;

public class Main {
    public static Persons persons;

    public static void main(String[] args) {
        persons = new Persons(5);

        persons.add(new Person("Иванов иван иванович", 1, "г.Одесса, ул.филатова", 5000, 12));
        persons.add(new Person("Валенский Перт Максимович", 2, "г.Одесса, вул.Говорова", 6000, 6));
        persons.add(new Person("Валенский Перт Максимович", 3, "г.Одесса, вул.Говорова", 6000, 6));
        persons.add(new Person("Валенский Перт Максимович", 4, "г.Одесса, вул.Говорова", 15000, 16));
        persons.add(new Person("Валенский Перт Максимович", 5, "г.Одесса, вул.Говорова", 6000, 6));

        Menu();
    }

    public static void Menu() {
        int menuNumber = 0;
        Scanner scanner = new Scanner(System.in);
        while (menuNumber == 0) {
            System.out.println("Выберите требуемый пункт: " +
                    "\n1) Выдача сведений о каждом из вкладчиков по фамилии: " +
                    "\n2) Выдача сведений о вкладчиках, вклад которых превышает заданную сумму: " +
                    "\n3) Выдача сведений о вкладчиках, у которых срок договора свыше 12 месяцев: " +
                    "\n4) Удаление записей о вкладчиках с заданной фамилией: " +
                    "\n5) Просмотр полного списка: " +
                    "\n6) Выход" +
                    "\n Введите нужный пункт и нажмите Enter:");
            boolean isCorrectly = false;
            String str = "";
            while (!isCorrectly) {
                str = scanner.next();
                if (str.equals("1") || str.equals("2") || str.equals("3") || str.equals("4") || str.equals("5") || str.equals("6")) {
                    isCorrectly = true;
                } else
                    System.out.println("Введите правильную цифру: ");
            }
            menuNumber = Integer.parseInt(str);
            switch (menuNumber){
                case 1: persons.getDataByFullName();break;
                case 2: persons.getDataByPrice();break;
                case 3: persons.getDataByMounth();break;
                case 4: persons.remove();break;
                case 5: persons.print();break;
                case 6: System.exit(0);break;
                default:System.out.println("Введите номер из списка!"); menuNumber=0;
            }
        }
    }
}