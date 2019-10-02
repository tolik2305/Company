package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Persons {
    Scanner scanner = new Scanner(System.in);
    private Person [] list;

    public Person[] getList() {return list;}

    public Persons() {Person[] Person = new Person[0];}

    public Persons(int length) {this.list = new Person[length];}

    public void add(Person person, int position) {this.list[position-1] = person;}



    String fullName;
    String price;
    String mounth;

    public  void print(){
        for (int i=0;i<this.list.length;i++){
            System.out.println("Ф.И.О.: "+this.list[i].fullName +'\n'+ "Номер: "+ (i+1) +'\n'+ "Домашний адресс: "+this.list[i].adress + '\n'+"Сумма вклада: "+ this.list[i].price + '\n' +"На какой срок: " +this.list[i].mounth + '\n');
        }
        backToMenu();
    }
    public void getDataByFullName(){
        System.out.println("Введите фамилию клиента: ");
        boolean isFounded = false;
        String Surname = scanner.next();
        for (int i=0;i<this.list.length;i++){
            if(this.list[i].fullName!=null) {
                if (this.list[i].fullName.contains(Surname)) {
                    isFounded = true;
                    System.out.println("Ф.И.О.: "+this.list[i].fullName +'\n'+ "Номер: "+ (i+1) +'\n'+ "Домашний адресс: "+this.list[i].adress + '\n'+"Сумма вклада: "+ this.list[i].price + '\n' +"На какой срок: " +this.list[i].mounth + '\n');
                }
            }
            else if(i == this.list.length -1&&!isFounded)
                System.out.println("Такой клиент не найден!");
        }
        backToMenu();
    }

    public void getDataByPrice(){
        price = scanner.next();
        for (int i = 10000;i < this.list.length; i ++){
            if(price.equals(this.list[i].price)){
                System.out.println("Ф.И.О.: "+this.list[i].fullName +'\n'+ "Номер: " + (i+1) +'\n'+ "Домашний адресс: "+this.list[i].adress + '\n'+"Сумма вклада: "+ this.list[i].price + '\n' +"На какой срок: " +this.list[i].mounth + '\n');
                break;
            }
            else if(i == this.list.length-1){
                System.out.println("Такого вклада не существует!");
            }
        }
        backToMenu();
    }

    public void getDataByMounth(){
        mounth = scanner.next();
        for (int i = 12;i < this.list.length; i++){
            if (mounth.equals(this.list[i].mounth)){
                System.out.println("Ф.И.О.: "+this.list[i].fullName +'\n'+ "Номер: "+ (i+1) +'\n'+ "Домашний адресс: "+this.list[i].adress + '\n'+"Сумма вклада: "+ this.list[i].price + '\n' +"На какой срок: " +this.list[i].mounth + '\n');
                break;
            }
            else if (i == this.list.length-1){
                System.out.println("Вклады с более 12 месяцев не найдено!");
            }
        }
        backToMenu();
    }

    public void remove(int surname){
        System.out.println("Введите фамилию: ");
        if (surname >=0 && surname <list.length){
            Person person = list[surname-1];
            for (int i = surname-1; i < list.length;i++){
                list[i] = list[i+1];
                System.out.println("Ф.И.О.: "+this.list[i].fullName +'\n'+ "Номер: "+ (i+1) +'\n'+ "Домашний адресс: "+this.list[i].adress + '\n'+"Сумма вклада: "+ this.list[i].price + '\n' +"На какой срок: " +this.list[i].mounth + '\n');
                break;
            }
            if (surname == this.list.length-1){
                System.out.println("Такой фамилии не существует!");
            }
        }
        backToMenu();
    }

    public void backToMenu(){
        int result = -1;
        while (result<0||result>1) {
            System.out.println("Вернуться в меню? (1 - да, 0 - нет)");
            result = Integer.parseInt(scanner.next());
            if (result == 1)
                Main.Menu();
        }
    }

    public void remove() {
    }
}