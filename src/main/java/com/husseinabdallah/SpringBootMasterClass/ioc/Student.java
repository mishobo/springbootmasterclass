package com.husseinabdallah.SpringBootMasterClass.ioc;

public class Student {
    // Class data members
    private final int id;
    private final MathCheat mathCheat;

    // Constructor of Student class
    public Student(int id, MathCheat mathCheat) {
        this.id = id;
        this.mathCheat = mathCheat;
    }

    // Method
    public void cheating() {
        System.out.println("My ID is: " + id);
        mathCheat.mathCheating();
    }
}

class Main {
    public static void main(String[] args) {
        Student student = new Student(1, new MathCheat());
        student.cheating();
    }
}
