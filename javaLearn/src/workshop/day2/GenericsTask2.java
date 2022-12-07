package workshop.day2;

public class GenericsTask2 {
	   public static void main(String[] args) {
	      System.out.println("Result: " + 
	            Compute.compute("add", Long.valueOf(1), Long.valueOf(2)));
	      System.out.println("Result: " + 
	            Compute.compute("minus", 2, 1));
	      System.out.println("Result: " + 
	            Compute.compute("mul", 2.0f, 5.5f));
	      System.out.println("Result: " + 
	            Compute.compute("div", 8.0, 0.0));
	      System.out.println("Result: " + 
	            Compute.compute("div", 3, 1));
	   }
	}

	class Compute {
	   public static <T extends Number> double compute(String op, T x, T y) {
	      // Todo
	      // Implement all 4 operations (add/minus/mul/div)
	      // as seen in static main(). For op "div", check for and handle
	      // "divide by zero" errors by returning 0.0 for such cases
		   
		   switch(op) {
		   case "add": return Double.sum(x, y);
		   }
	      
	   }
	   public static <T> T add(T x,T y) {
		   return (x.getClass())(x+y);
	   }
	}

