public class Main {
    public static void main(String[] args) {
        SmartDevice smartDevice = new SmartDevice("Sony", "Bravia", "Negro");
        SmartPhone smartPhone = new SmartPhone("Samsung", "Galaxy S22", "Gris", "Android 12", "Exynos 2200");
        SmartWatch smartWatch = new SmartWatch("Xiaomi", "Mi Watch Lite", "Negro", "1.39 pulgadas", "TPU");

        System.out.println(smartDevice);
        System.out.println(smartPhone);
        System.out.println(smartWatch);
    }
}
