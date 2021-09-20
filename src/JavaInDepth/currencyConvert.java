package JavaInDepth;

public class currencyConvert {

    double[] numbers;

    void setExhenges(double[] rates){
        numbers = rates;
    }
    void updateExhenges(int indexVal, double value){
        numbers[indexVal] = value;
    }
    double getExhenges(int indexVal){
        return numbers[indexVal];
    }
    double computExhenges(int indexVal, double amount){
        return amount * getExhenges(indexVal);
    }

    public static void main(String[] args) {
        currencyConvert cc = new currencyConvert();
         double[] rates = {63.0,3.0,3.0,55,18,107,2};
         cc.setExhenges(rates);
        cc.printCurrencies();
        System.out.println();

        rates = new double[] {61.0,3.10,4.0,55,18,107,2};
        cc.setExhenges(rates);
        cc.printCurrencies();
        System.out.println();

        cc.updateExhenges(3, 50);
        System.out.println("Money order calc : " +cc.computExhenges(2,10));
    }

    void printCurrencies() {
        System.out.println("rupee: " + numbers[0]);
        System.out.println("dirham: " + numbers[1]);
        System.out.println("real: " + numbers[2]);
        System.out.println("chilean_peso: " + numbers[3]);
        System.out.println("mexican_peso: " + numbers[4]);
        System.out.println("_yen: " + numbers[5]);
        System.out.println("$australian: " + numbers[6]);
    }

}
