package day5;


public class Task2 {
    public static void main(String[] args) {
Motobike motobike1=new Motobike("green",1999,"Harley");
System.out.println(motobike1.getColor());
System.out.println(motobike1.getModel());
System.out.println(motobike1.getYear());
    }
}
class Motobike {
    private String color;
    private int year;
    private String model;


    public Motobike(String color, int year, String model) {
        this.color = color;
        this.year = year;
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}


