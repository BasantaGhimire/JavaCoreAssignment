package Assignment_4_Q2;

public class Test {
	
	//String datatype and method named function parameters float i, int f
	
	private String function(float i, int f)  
    {  
        return ("gfg");  
    }
	//String datatype and method named function consist of parameter double i, double f
    private String function(double i, double f)  
    {  
        return ("GFG");  
    }  
    public static void main(String[] args)  
    {  
        Test obj = new Test();  
        System.out.println(obj.function(1., 20)); // passing  first attributes double not float  
    }  
}
