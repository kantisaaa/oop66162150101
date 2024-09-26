class Capacity {
    final double PI = 3.14;
    double capacity;

    // Constructor
    public Capacity() {
        capacity = 0;
    }

    // Method สำหรับคำนวณปริมาตรทรงกลม
    public double getCapacity(double radius) {
        capacity = (4.0 / 3.0) * PI * Math.pow(radius, 3);
        return capacity;
    }

    // Method สำหรับคำนวณปริมาตรทรงสี่เหลี่ยม
    public double getCapacity(double width, double length, double height) {
        capacity = width * length * height;
        return capacity;
    }
}

public class Main {
    public static void main(String[] args) {
        Capacity capacityCalculator = new Capacity();

        // คำนวณปริมาตรทรงกลม รัศมี 5
        double sphereVolume = capacityCalculator.getCapacity(5);
        System.out.println("ปริมาตรทรงกลม (รัศมี 5) = " + sphereVolume);

        // คำนวณปริมาตรทรงสี่เหลี่ยม กว้าง 2, ยาว 3, สูง 4
        double cubeVolume = capacityCalculator.getCapacity(2, 3, 4);
        System.out.println("ปริมาตรทรงสี่เหลี่ยม (กว้าง 2, ยาว 3, สูง 4) = " + cubeVolume);
    }
}
