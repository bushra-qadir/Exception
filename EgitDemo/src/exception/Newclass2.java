package exception;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Newclass2 {
	
	private static final String filename = "input.txt";
	
	public static void main(String[] args) throws IOException //throws IOException
	{
	
		BufferedReader rd = null;
		File file=new File(filename);
		//file.createNewFile();
		try {
			// Open the file for reading.
			System.out.println("Ali imtiaz");
			System.out.println("sp13-bse-005");
			
			rd = new BufferedReader(new FileReader(new File(filename)));
			
			// Read all contents of the file.
			String inputLine = null;
			while((inputLine = rd.readLine()) != null)
				System.out.println(inputLine);
		}
		catch(IOException ex) {
			System.err.println("An IOException was caught!");
			ex.printStackTrace();
		}
		finally {
			// Close the file.
			System.out.println("Mustafa here, please enter your commits below (sp13-bse-092)");

			try {
				rd.close();
			}
			catch (IOException ex) {
				System.err.println("An IOException was caught!");
				ex.printStackTrace();
			}
			
		}
<<<<<<< HEAD
		System.out.println("Committed By Me---- Ahmed ALI Sp13-Bse-081");

=======
		System.out.println("Ahsan Riaz");
		System.out.println("SP13-bse-123");
>>>>>>> branch 'master' of https://github.com/bushra-qadir/exception
	}
	
	
	
}
