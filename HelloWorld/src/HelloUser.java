import java.io.*;


public class HelloUser {
	
	public static String userName = " ";
	
	public String userName(){
		return userName;
	}

	public static void main(String[] args){
		
		greetUser();
		
	}
	
	public static void greetUser(){
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Hello ASE2015 - how are you? :)");
		System.out.println("Please enter your name:");
		try {
			userName = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hallo " + userName + " :)");
	}
	
}





