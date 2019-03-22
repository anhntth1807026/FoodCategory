package Controller;

import Entity.Food;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodController {
    private ArrayList<Food> foodArrayList = new ArrayList<>();

    public void addFood() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã món ăn: ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên món ăn: ");
        String name = scanner.nextLine();
        System.out.println("Nhập mô tả ngắn: ");
        String description = scanner.nextLine();
        System.out.println("Nhập giá: ");
        int price = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập ngày tạo: ");
        int createAt = scanner.nextInt();
        scanner.nextLine();
        Food food = new Food(id, name, description, price, createAt);
        foodArrayList.add(food);
        System.out.println("Đã thêm thành công");
    }

    public void printList() {
        if (foodArrayList == null || foodArrayList.size() == 0) {
            System.out.println("Hiện tại không có món ăn nào");
            return;
        }
        System.out.printf("%15f %15f %15f %15f\n", "Ma mon an", "Tên món ăn", "Mô tả","Giá món ăn", "Ngày tạo");
        for (Food food : foodArrayList) {
            System.out.println(food.toString());
        }
    }
}
