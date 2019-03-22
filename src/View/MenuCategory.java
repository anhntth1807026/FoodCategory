package View;

import Controller.CategoryContronller;

import java.util.Scanner;

public class MenuCategory {

    public void createCategory() {
        Scanner scanner = new Scanner(System.in);
        CategoryContronller categoryContronller = new CategoryContronller();
        while (true) {
            System.out.println("————————Foodydi———————");
            System.out.println("1. Thêm loại món ăn ");
            System.out.println("2. Hiển thị danh sách loại món ăn.");
            System.out.println("3. Thoát chương trình.");
            System.out.println("————————————————————");
            System.out.println("Nhập lựa chọn của bạn: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    categoryContronller.addFoodCategory();
                    break;
                case 2:
                    categoryContronller.printListCategory();
                    break;
                case 3:
                    System.out.println("Thoát");
                    break;
                default:
                    System.out.println("Lựa chọn sai, vui lòng nhập số trong khoảng từ 1 đến 3.");
                    break;
            }
            if (choice == 3) {
                System.out.println("Hẹn gặp lại.");
                break;
            }
        }
    }
}