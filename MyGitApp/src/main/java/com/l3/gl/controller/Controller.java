package com.l3.gl.controller;

import com.l3.gl.model.User;
import com.l3.gl.model.Product;
import com.l3.gl.view.Ui;

import java.util.ArrayList;

public class Controller {

    private Ui ui;
    private ArrayList<User> users;
    private ArrayList<Product> products;

    public Controller() {
        ui = new Ui();
        users = new ArrayList<>();
        products = new ArrayList<>();

        // مثال: ربط زر الواجهة بإضافة مستخدم
        ui.getButton().addActionListener(e -> addUser("Alice", 25));
    }

    public void addUser(String name, int age) {
        User user = new User(name, age);
        users.add(user);
        System.out.println("Added user: " + name);
    }

    public void addProduct(String name, double price) {
        Product product = new Product(name, price);
        products.add(new Product(name, price));
        System.out.println("Added product: " + name);
    }

    public void printUsers() {
        System.out.println("Users:");
        for (User u : users) System.out.println(u.getName() + " - " + u.getAge());
    }

    public void printProducts() {
        System.out.println("Products:");
        for (Product p : products) System.out.println(p.getName() + " - " + p.getPrice());
    }

    public void start() {
        ui.show();
    }

    public static void main(String[] args) {
        Controller app = new Controller();
        app.start();

        // اختبار الوظائف
        app.addUser("Bob", 30);
        app.addProduct("Laptop", 1200);
        app.printUsers();
        app.printProducts();
    }
}
