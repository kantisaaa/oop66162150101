import java.util.Scanner;

public class TemCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] celsiusTemps = new double[10];

        for (int i = 0; i < celsiusTemps.length; i++) {
            System.out.print("กรุณาป้อนอุณหภูมิที่ " + (i + 1) + " (องศาเซลเซียส): ");
            try {
                celsiusTemps[i] = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("ข้อมูลที่ป้อนไม่ถูกต้อง กรุณาป้อนตัวเลขเท่านั้น");
                i--;
            }
        }

        double highestCelsius = celsiusTemps[0];
        double lowestCelsius = celsiusTemps[0];
        double highestFahrenheit = celsiusToFahrenheit(highestCelsius);
        double lowestFahrenheit = celsiusToFahrenheit(lowestCelsius);

        for (double celsiusTemp : celsiusTemps) {
            double fahrenheitTemp = celsiusToFahrenheit(celsiusTemp);
            if (fahrenheitTemp > highestFahrenheit) {
                highestFahrenheit = fahrenheitTemp;
                highestCelsius = celsiusTemp;
            }
            if (fahrenheitTemp < lowestFahrenheit) {
                lowestFahrenheit = fahrenheitTemp;
                lowestCelsius = celsiusTemp;
            }
        }
        System.out.println("อุณหภูมิสูงสุด: " + highestCelsius + " องศาเซลเซียส (" + highestFahrenheit + " องศาฟาเรนไฮต์)");
        System.out.println("อุณหภูมิต่ำสุด: " + lowestCelsius + " องศาเซลเซียส (" + lowestFahrenheit + " องศาฟาเรนไฮต์)");
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 1.8 + 32);
    }
}