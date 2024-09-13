import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name="kiran";
        char target='a';
        System.out.println(search(name, target));

        // System.out.println(Arrays.toString(name.toCharArray())); //to convert into an character array on which for each loop executes
    }

    static boolean search(String str,char target){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    //using for each loop
    static boolean search2(String str,char target){
        if(str.length()==0){
            return false;
        }
       for(int ch:str.toCharArray()){
            if(ch==target){
                return true;
            }
       }
       return false;
    }
}
