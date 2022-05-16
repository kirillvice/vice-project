package day5;
public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("");
        car1.setColor("");
        car1.setYear(2022);
        System.out.println(car1.getModel());
        System.out.println(car1.getColor());
        System.out.println(car1.getYear());
    }
}
class Car {
    private String model;
    private String color;
    private int year;

    public void setModel(String model) {
        if (model.isEmpty()){
            System.out.println("Пустое имя");

        }else{
            this.model = model;
        }
    }

    public String getModel() {
        return model;
    }

    public void setColor(String color) {
        if (color.isEmpty()) {
            System.out.println("неуказан цвет");
        }else {
            this.color = color;
        }
    }

    public String getColor() {
        return color;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
}


