package InterfaceAbstract;

public interface InterfaseClass {
    String LONGNAME = "Qafa e malit";
    public void lumi(String name, int gjatesia);
    public void mali(String name, int lartesia);
}
/**
 *
 * 1. Interface looks like a class.
 *      * 2. It contains method with ONLY signature, no method with body/code.
 *      *      In other words, all methods inside interface are Abstract by default.
 *      * 3. We can create variable of an Interface,
 *      *      BUT can NEVER create object of an interface.
 *      * 4. A class can implement one or more interfaces.
 *      * 5. class which implements the interface, has to give body to all interface methods.
 *      * 6. By default, all variables are static and final in interface.
 *      * 7. an Interface can extend another Interface.
 *
 * Abstract Class - is special type of class.
 *      * 1. this class can contain methods with ONLY signature (abstract method, like an Interface)
 *      *    and also can contain usual methods (methods with body and signature, like a usual class)
 *      *
 *      * 2. To create abstract class, we have to use "abstract" keyword after the access-modifier.
 *      *
 *      * 3. By default, all methods inside abstract class are normal method.
 *      *    In order to create abstract method, we have to use "abstract" after the access-modifier in the method signature.
 *      *
 *      * 4. We can create variable of abstract-class type, BUT
 *      *    CANNOT create object of an abstract class.
 *
 */