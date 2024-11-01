package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.TreeMap;

public class StudentMap {
    public static void main(String[] args) {

        Map<String, Integer> studentScores = new HashMap<>();

        // Thêm dữ liệu vào Map
        studentScores.put("An", 85);
        studentScores.put("Binh", 90);
        studentScores.put("Chau", 78);

        // Thêm sinh viên mới với `putIfAbsent`
        studentScores.putIfAbsent("Dung", 75);
        studentScores.putIfAbsent("An", 95); // Sẽ không thay đổi vì "An" đã tồn tại


        // Sắp xếp danh sách sinh viên theo tên
        Map<String, Integer> sortedStudentScores = new TreeMap<>(studentScores);

        // In danh sách sinh viên sau khi sắp xếp
        System.out.println("Danh sách sinh viên và điểm của họ (sắp xếp theo tên):");
        sortedStudentScores.forEach((name, score) ->
                System.out.println("Tên: " + name + ", Điểm: " + score)
        );

        // Kiểm tra điểm của một sinh viên và cập nhật với `replace`
        String student = "Binh";
        if (studentScores.containsKey(student)) {
            studentScores.replace(student, 92); // Cập nhật điểm của "Binh"
            System.out.println("\nĐiểm của " + student + " sau khi cập nhật: " + studentScores.get(student));
        } else {
            System.out.println("\nKhông tìm thấy sinh viên có tên " + student);
        }

        // Dùng Iterator để xóa sinh viên
        Iterator<Map.Entry<String, Integer>> iterator = studentScores.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getKey().equals("Chau")) {
                iterator.remove(); // Xóa "Chau" khỏi danh sách
                System.out.println("\n" + entry.getKey() + " đã được xóa khỏi danh sách.");
            }
        }

        // In danh sách sinh viên sau khi cập nhật và xóa
        System.out.println("\nDanh sách sinh viên sau khi cập nhật:");
        studentScores.forEach((name, score) ->
                System.out.println("Tên: " + name + ", Điểm: " + score)
        );
    }
}
