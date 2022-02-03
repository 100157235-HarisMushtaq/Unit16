public class Calculator2 {
    String name;
    
        public int add(int x, int y){
            return x + y;  
        }
        public int subtract(int x, int y){
            return x - y;  
        }
        public int multiply(int x, int y){
            return x * y;  
        }
        public int divide(int x, int y){
            return x / y;  
        }
        public int modulus(int x, int y){
            return x % y; 
        }
   
    public void setName(String name)
    {
        this.name = name;
    }        
    
    public String getName()
    {
        return name;
    }
}
