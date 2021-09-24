package Arrays;

public class arrayMaxNumb {
    public static void main(String[] args) {
        int[] arraySample = {21,3,44,5,2,11,4,33,51,};
        System.out.println(maxArrayNumb(arraySample));
    }
    public static int maxArrayNumb(int[] numbers) {
        int max = numbers[0];
        for(int i=0; i<numbers.length;i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }


}
