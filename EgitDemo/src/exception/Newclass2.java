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
		System.out.println("Abdul hakeem (sp13-bse-110)");
		System.out.println("Abdul hakeem (sp13-bse-110)");
		//file.createNewFile();
		try {
			// Open the file for reading.
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
<<<<<<< HEAD

			System.out.println("Qandeel Haider  Sp13-BSE-066");

			System.out.println("Mustafa here, please enter your commits below (sp13-bse-092)");


=======
			System.out.println("Mustafa here, please enter your commits below (sp13-bse-092)");

>>>>>>> branch 'master' of https://github.com/bushra-qadir/Exception
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
