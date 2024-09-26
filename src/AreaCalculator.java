public class AreaCalculator {

    // Overloading method สำหรับหาพื้นที่ของทรงกลม
    public static double calculateArea(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Overloading method สำหรับหาพื้นที่ของสี่เหลี่ยม
    public static double calculateArea(double width, double length, double height) {
        return width * length * height;
    }

    public static void main(String[] args) {
        // คำนวณพื้นที่ของทรงกลม
        double radius = 5.0;
        double sphereArea = calculateArea(radius);
        System.out.println("ปริมาตรของทรงกลมที่มีรัศมี " + radius + " คือ: " + sphereArea);

        // คำนวณพื้นที่ของสี่เหลี่ยม
        double width = 4.0;
        double length = 3.0;
        double height = 2.0;
        double rectangularPrismArea = calculateArea(width, length, height);
        System.out.println("ปริมาตรของสี่เหลี่ยมที่มี กว้าง " + width + " ยาว " + length + " สูง " + height + " คือ: " + rectangularPrismArea);
    }
}