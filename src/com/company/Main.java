package com.company;

import com.company.Product.*;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Product [] cars = {
                new Product(0,
                        "Opel",
                        "Speedster",
                        1700.00),
                new Product(1,
                        "Opel",
                        "Antara",
                        20000.00,
                        2015,
                        "White",
                        "KA9923XA"),
                new Product(2,
                        "BMW",
                        "I3",
                        35000.00,
                        2020,
                        "Blue",
                        "AA5675AA")
        };

        Scanner sc = new Scanner(System.in);
        ControllerLogic logic = new ControllerLogic();
        System.out.println("В списке есть Opel и BMW Введите выбранную марку: ");
        String mark = sc.nextLine();
        System.out.println(logic.getCarsByMark(cars, mark));
        System.out.println("В списке есть Opel и BMW Введите выбранную марку: ");
        mark = sc.nextLine();
        System.out.println("Ведите сколько лет машина в експлуатации: ");
        int explYear = sc.nextInt();
        System.out.println(logic.getCarByMarkWithExpl(cars, mark, explYear));
        System.out.println("Введите год машины, в списке есть 2015, 2020: ");
        int carYear = sc.nextInt();
        System.out.println("Ведите минимальную цену авто");
        double price = sc.nextDouble();
        System.out.println(logic.getCarByYearAndPrice(cars, carYear, price));

    }







}
