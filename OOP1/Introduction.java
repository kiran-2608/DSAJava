// package OOP1;

public class Introduction {
    public static void main(String[] args) {
        // store 5 roll
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        // data of 5 students : {roll n0 , name , marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];



        Student kiran = new Student();  
        
        kiran.rno = 6645;
        kiran.name = "Kiran Kumar";
        // kiran.marks = 75.0f;

        System.out.println(kiran.rno);
        System.out.println(kiran.name);
        System.out.println(kiran.marks);

    }
}

// create a class
// for every single student
class Student {
    int rno;
    String name;
    float marks = 80.8f;
}