public class scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        {//block scoping
            // int a=78; //already initialised outside the block in the same method,hence you cannot initialise again

            a=69; //we can change the value and its change the original value
            System.out.println(a);
            int c=99;
            //values initialised in this block will reman in block
        }
        int c=100; //can be defined outside the block
        // System.out.println(c); //cannot use outside the block
        System.out.println(a); // prints 69 as it changed the original value

        //scoping in for loop
        for(int i=0;i<4;i++){
            System.out.println(i);
            int num=90;
            int a=10;
        }
    }

    static void random(){
        int num=69; //only access this variable in this function
        System.out.println(num);
    }
    
}


// important note: 
//Anything initialised outside the block you can definetly use inside the block
//Anything initialised inside the block you can definetly initialised outside the block but cannot use outside