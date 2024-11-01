package Map;

import java.util.HashMap;
import java.util.Map;

public class StudentMap {
    public static void main(String[] args) {

        Map<String, Integer> studentScores = new HashMap<>();

        // Thêm dữ liệu vào Map
        studentScores.put("An", 85);
        studentScores.put("Binh", 90);
        studentScores.put("Chau", 78);


        System.out.println("Danh sách sinh viên và điểm của họ:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println("Tên: " + entry.getKey() + ", Điểm: " + entry.getValue());
        }


        String student = "Binh";
        Integer score = studentScores.get(student);
        if (score != null) {
            System.out.println("\nĐiểm của " + student + ": " + score);
        } else {
            System.out.println("\nKhông tìm thấy sinh viên có tên " + student);
        }


        studentScores.put("An", 88);
        System.out.println("\nĐiểm của An sau khi cập nhật: " + studentScores.get("An"));


        studentScores.remove("Chau");
        System.out.println("\nDanh sách sinh viên sau khi xóa Chau:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println("Tên: " + entry.getKey() + ", Điểm: " + entry.getValue());
        }
    }
}
