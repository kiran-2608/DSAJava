import java.util.Arrays;

public class variableArguments {
    public static void main(String[] args) {
        func(1,2,3,4,5,678,90,90); //we can pass any number of arguments
        multiple(2,3,"Kiran","kumar","Behera");
    }

    static void multiple(int a,int b,String...v){

    }

    static void func(int...v){ //its takes array of strings
        System.out.println(Arrays.toString(v));

    }
    
}
