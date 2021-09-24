package Arrays;

public class stringArray {
    public static void main(String[] args) {
        String[] array = {"dola","sdola","loli","moli","gaqo","somatrice","dola","loli"};
        System.out.println( gjejString(array, "dola"));
        findDub(array, "loli");
    }
    public static String gjejString(String[] kerko, String gjeje){
        String searchIndex = "";
        int count = 0;
        for(int i=0; i<kerko.length;i++){
            if(gjeje == kerko[i]){
                searchIndex = kerko[i];
                count++;
            }
        }
        return "Name: " + searchIndex +" is present " + count + " time.";
    }
    public static void findDub(String[] value, String value2){
        String name= "";
        int timeShow = 0;
        for (int i=0; i <= value.length-1; i++){
            if(value2.contains(value[i])){
                timeShow++;
                name= value[i];
            }
        }
        if(timeShow >1){
            System.out.println("The name: " + name + ", is present " + timeShow + " times");
        }else{
            System.out.println("Name not present.");
        }
    }
}
