package kz.first.project.demo.database;

import kz.first.project.demo.prop.Laptop;

import java.util.ArrayList;

public class DButil {
    private static ArrayList<Laptop> laptops = new ArrayList<>();
    static {
        laptops.add(new Laptop("Macbook pro",1499.99,8,256,"Intel Core i7"));
        laptops.add(new Laptop("Asus tuf Gaming",999.99,16,512,"AMD ryzen 5"));
        laptops.add(new Laptop("Asus tuf Gaming",999.99,16,512,"AMD ryzen 5"));
        laptops.add(new Laptop("Asus tuf Gaming",999.99,16,512,"AMD ryzen 5"));
        laptops.add(new Laptop("Asus tuf Gaming",999.99,16,512,"AMD ryzen 5"));
        laptops.add(new Laptop("Asus tuf Gaming",999.99,16,512,"AMD ryzen 5"));
    }
    public static ArrayList<Laptop> getLaptops(){
        return laptops;
    }
    public static void addLaptop(Laptop laptop){
        laptops.add(laptop);
    }
}
