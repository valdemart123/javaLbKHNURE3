package com.company;

import java.util.ArrayList;

public class ControllerLogic {
    ArrayList <Product> tmpCars = new ArrayList ();

    public String getCarsByMark (Product[] car, String mark) {

        String result = "";

        for (int i = 0; i<car.length; i++) {
            if (car[i].getMark().equals(mark)) {
                result += car[i].toString() + "\n";
                tmpCars.add(car[i]);
            }
        }
        return result;
    }

    public String getCarByMarkWithExpl (Product[] car, String mark, int explYears){
        String result = "";
        getCarsByMark(car, mark);
        for (int i=0; i<tmpCars.size(); i++){
            int explData = getCurrentYear() - tmpCars.get(i).getYear();
            if (explData>explYears) {
                result += tmpCars.get(i).toString() + "\n";
            }
        }
        return result;
    }

    public static int getCurrentYear()
    {
        java.util.Calendar calendar = java.util.Calendar.getInstance(java.util.TimeZone.getDefault(), java.util.Locale.getDefault());
        calendar.setTime(new java.util.Date());
        return calendar.get(java.util.Calendar.YEAR);
    }
    public String getCarByYearAndPrice (Product[] car, int year, double price)
    {
        String result = "";
        for (Product selected : car) {
            if (selected.getYear()==year && selected.getPrice()>price) {
                return result+=selected.toString();
            }
        }
        return result;
    }


}
