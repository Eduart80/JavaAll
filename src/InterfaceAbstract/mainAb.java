package InterfaceAbstract;

public class mainAb extends ImplementedClass {
    // it extend from AbstractClass
    public static void main(String[] args) {
        ImplementedClass mn = new ImplementedClass();
        mn.lumi("Shkumbin", 120);
        mn.mali("Dajti",1616);
        // Accsess field var from interface class name
        // or object from class was implemented
        System.out.println(mn.LONGNAME);
        System.out.println(InterfaseClass.LONGNAME);



    }
}
