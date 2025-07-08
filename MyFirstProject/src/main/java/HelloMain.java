
public class HelloMain {
 private static HelloMain obj = new HelloMain();
 int x=10;
  private HelloMain()
  {
	  
  }
  public static HelloMain getInstance()
  {
	  return obj;
  }
  
  public void Display()
  {
	  System.out.println("Test Singleton"+x);
	  x++;
  }
}
