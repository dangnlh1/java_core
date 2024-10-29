package Encapsulation;

class Person {
    private int age;  // Đóng gói thuộc tính age

    public Person(int age) {
        setAge(age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {  // Kiểm tra giá trị hợp lệ
            this.age = age;
        } else {
            System.out.println("Tuổi không hợp lệ!");
        }
    }
}
