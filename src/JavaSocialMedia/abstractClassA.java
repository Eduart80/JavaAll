package JavaSocialMedia;

public class abstractClassA {
    public static void main(String[] args) {
        abstractClassB a1 =new abstractClassB(){
             void add()
            {
                System.out.println("Abstract Class");
            }
        };

        a1.add();
        a1.kolla();
        System.out.println(a1.SOT);
    }

}
