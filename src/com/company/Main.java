package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите размер массива продуктов: ");
        int size = input.nextInt();
        Product[] products = new Product[size];
        String name=null;
        for (int i = 0; i < size; i++) {
            System.out.println("Введите название продукта: ");
             name = reader.readLine();;
            System.out.println("Введите цену продукта: ");
            float price = input.nextFloat();
            System.out.println("Введите количество продукта: ");
            int quantity =  input.nextInt();;
            products[i] = new Product(name, price, quantity);; // Заполняем массив элементами, введёнными с клавиатуры
        }

        System.out.println("Вывод продуктов: ");
        for(Product product : products) {
            System.out.println(product.toString());
        }
        Arrays.sort(products, new SortedByName());
        System.out.println("\nСортировка по названию");

        for(Product product : products) {
            System.out.println(product.toString());
        }

        Arrays.sort(products, new SortedByPrice());
        System.out.println("\nСортировка по цене");
        for(Product product : products) {
            System.out.println(product.toString());
        }




    }
}
