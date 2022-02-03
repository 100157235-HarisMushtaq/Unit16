
public class MainClass {
    public static void main(String[] args){
        Calculator2 c1 = new Calculator2();
        Calculator2 c2 = new Calculator2();
        
        c1.name = "calc 1";
        c2.name = "calc 2";
        
        System.out.print(c1.name + "calculated" + c1.add(3, 4));
        System.out.print(c2.name + "calculated" + c1.add(29, 5));
    }
    
}
