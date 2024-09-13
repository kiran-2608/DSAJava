public class intro {
    public static void main(String[] args) {
        
        //syntax
        // datatype[] variable_name = new datatype[size];

        //store 5 roll numbers
        // int[] rno = new int[5];
        //or directly
        // int[] rno2={1,2,3,4,5};

        // breaking down the steps
        int[] rno; //declaration of array.rno is getting defined in the stack
        rno=new int[5]; //initialisation:actually here object is being created in the memory
        System.out.println(rno[1]);

        String[] arr=new String[4];
        System.out.println(arr[1]);
    }
    
}
