package View;

import Controller.FoodController;

import java.util.Scanner;

public class MenuCreator {

    public void createMenu() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("————————Foodydi———————");
            System.out.println("1. Thêm món ăn");
            System.out.println("2. Hiển thị danh sách món ăn.");
            System.out.println("3. Thoát chương trình.");
            System.out.println("————————————————————");
            System.out.println("Nhập lựa chọn của bạn: ");
            FoodController controller = new FoodController();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    controller.addFood();
                    break;
                case 2:
                    controller.printList();
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

