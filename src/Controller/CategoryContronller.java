package Controller;

import Entity.Category;

import java.util.ArrayList;
import java.util.Scanner;

public class CategoryContronller {
    private ArrayList<Category> categoryArrayList = new ArrayList<>();

    public void addFoodCategory() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã danh mục: ");
        String id = scanner.nextLine();
        System.out.println("Nhập tên danh mục: ");
        String name = scanner.nextLine();
        Category category = new Category(id, name);
        categoryArrayList.add(category);
        System.out.println("Đã thêm thành công");
    }

    public void printListCategory() {
        if (categoryArrayList == null || categoryArrayList.size() == 0) {
            System.out.println("Hiện tại không loại món ăn nào");
            return;
        }
        System.out.printf("%15f %15f %15f %15f\n", "Mã loại đồ ăn", "Tên loại món ăn");
        for (Category category : categoryArrayList) {
            System.out.println(category.toString());
        }
    }
}
