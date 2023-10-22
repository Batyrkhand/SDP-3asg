import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в систему умного дома!");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Хотите включить систему умного дома? (Да/Нет): ");
        String response = scanner.nextLine();

        if (response.equalsIgnoreCase("Да")) {
            OldHomeDevice oldDevice = new OldHomeDevice();
            SmartHomeDevice smartHomeDevice = new OldDeviceAdapter(oldDevice);

            while (true) {
                System.out.println("Выберите действие:");
                System.out.println("1. Включить устройство");
                System.out.println("2. Установить яркость");
                System.out.println("3. Показать текущую яркость");
                System.out.println("4. Выключить систему умного дома");
                System.out.print("Ваш выбор (1/2/3/4): ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        smartHomeDevice.turnOn();
                        break;
                    case 2:
                        System.out.print("Введите уровень яркости (0-100): ");
                        int brightness = scanner.nextInt();
                        smartHomeDevice.setBrightness(brightness);
                        break;
                    case 3:
                        int currentBrightness = smartHomeDevice.getBrightness();
                        System.out.println("Текущая яркость: " + currentBrightness);
                        break;
                    case 4:
                        System.out.println("Выключение системы умного дома.");
                        smartHomeDevice.turnOff();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Некорректный выбор. Попробуйте ещё раз.");
                }
            }
        } else {
            System.out.println("Вы отказались от включения системы умного дома. Программа завершена.");
        }
    }
}
