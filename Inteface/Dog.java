package Inteface;

class Dog implements Animal {


    @Override
    public void sound() {
        System.out.println("Chó sủa: Gâu gâu");
    }

    @Override
    public void sleep() {
        System.out.println("Chó đang ngủ.");
    }
}
