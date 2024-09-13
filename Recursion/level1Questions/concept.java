// package level1Questions;

public class concept {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        // fun(n--);  it pass the value first and then subtracts

        fun(--n); // subtracts first then pass the value

         
    }
}
