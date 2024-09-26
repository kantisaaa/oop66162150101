interface StudentData {
    void data();
}

interface StudentResult {
    void calGrade(double score); // เพิ่มพารามิเตอร์ score เพื่อรับคะแนน
}

class Student implements StudentData, StudentResult {
    String name = "Somsak kuamlao";
    String major = "Software Engineer";

    @Override
    public void data() {
        System.out.println("ชื่อ: " + name);
        System.out.println("สาขาวิชา: " + major);
    }

    @Override
    public void calGrade(double score) {
        char grade;
        if (score >= 80) {
            grade = 'A';
        } else if (score >= 70) {
            grade = 'B';
        } else if (score >= 60) {
            grade = 'C';
        } else if (score >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("เกรด: " + grade);
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.data();
        student.calGrade(75); // เปลี่ยนค่า score เพื่อทดสอบ
    }
}

