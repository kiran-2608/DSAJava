// Amazon

// Firts Missing Positive ( level : hard )

public class LeetCode41 {
    public static void main(String[] args) {
        
        int[] arr = {3 , 4 , -1 , 1};
        int ans = firstMissingPositive(arr);
        System.out.println(ans);


    }

    static int firstMissingPositive(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correctIndex = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                swap(arr , i , correctIndex);
            }
            else {
                i++;
            }
        }

        // Search for firts Missig Number
        for(int index = 0 ; index < arr.length ; index++) {
            if(arr[index] != index + 1) {
                return index + 1;
            }
        }

        // case 2
        return arr.length + 1;
    }

    static void swap(int[] arr , int first , int second) {
        int temp = arr[first];
        
        // arr[first] = arr[second];
        // arr[second] = temp;

        arr[first] = arr[second];
        arr[second] = temp;
        
    }
} 
