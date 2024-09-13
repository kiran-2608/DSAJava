

public class into {
    public static void main(String[] args) {
        int[] nums={23,45,78,12,90,34};
        int target=12;
        int ans=linearSearch(nums,target);
        System.out.println(ans);
    }

    //search in the array:return the index if item found
    //otherwiswe if item found return -1
    static int linearSearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        //run the for loop
        for(int index=0;index<arr.length;index++){
            //check for element at every index if it is = target
            int element=arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }

    //search the target and return the element
    static int linearSearch2(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        //run the for loop
        for(int element:arr){
            if(element==target){
                return element;
            }
        }
        return -1;
    }

    //search the target and return true or false
     static boolean linearSearch3(int[] arr,int target){
        if(arr.length==0){
            return false;
        }
        //run the for loop
        for(int element:arr){
            if(element==target){
                return true;
            }
        }
        return false;
    }

}
