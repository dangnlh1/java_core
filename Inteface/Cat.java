package Inteface;

class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Mèo kêu: Meo meo");
    }

    @Override
    public void sleep() {
        System.out.println("Mèo đang ngủ.");
    }
}
