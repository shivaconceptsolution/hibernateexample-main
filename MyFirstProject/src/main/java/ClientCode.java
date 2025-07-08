
public class ClientCode {

	public static void main(String[] args) {
		HelloMain obj = HelloMain.getInstance();
		obj.Display();
		HelloMain obj1 = HelloMain.getInstance();
		obj1.Display();

	}

}
