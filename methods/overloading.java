public class overloading {
    public static void main(String[] args) {
        func(45);
        func("kiran");
    }
    static void func(int a){
        System.out.println(a);
    }

    static void func(String name){
        System.out.println(name);
    }
    
}
