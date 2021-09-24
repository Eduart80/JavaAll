package InterfaceAbstract;

public class ImplementedClass implements InterfaseClass {
    // class that impliment from Interface class
    @Override
    public void lumi(String name, int gjatesia) {
        System.out.println("River "+name+", is " + gjatesia+"m long.");
    }

    @Override
    public void mali(String name, int lartesia) {
        System.out.println("Mali quhet " + name +", dhe eshte "+ lartesia+"m i larte");
    }


}
