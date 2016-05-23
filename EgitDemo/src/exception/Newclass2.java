package exception;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Newclass2 {
	
	private static final String filename = "input.txt";
	
	public static void main(String[] args) throws IOException //throws IOException


	{



	{



	

		BufferedReader rd = null;
		File file=new File(filename);



		System.out.println("Abdul hakeem (sp13-bse-110)");
		System.out.println("Abdul hakeem (sp13-bse-110)");




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

		
	// Close the file.
			System.out.println("Abdul Rehman Ali");
			System.out.println("SP13-BSE-004 ");


			System.out.println("Mustafa here, please enter your commits below (sp13-bse-092)");

			try {
				rd.close();
			}
			catch (IOException ex) {
				System.err.println("An IOException was caught!");
				ex.printStackTrace();
			}





			System.out.println("name Najeebullah");
			System.out.println("Reg sp13-bse-076");

			System.out.println("Sofware Construction Lab");
			System.out.println("Name::Sohail...........++........RegNum::Sp13-Bse-083");

			

			System.out.println("Bushra here, please enter your commits below");
			System.out.println("NIAZ AHMAD, roll number:SP13-BSE-063");


		}


		System.out.println("M.Bilal");
		System.out.println("Sp13-bse-106");


		System.out.println("AMIR TANOLI");
		System.out.println("FA12-BSE-246");

		System.out.println("Usman Alam ");
		System.out.println("sp13-bse-077");


		}

		System.out.println("Hamaad chaudhery");
		System.out.println("Sp13-bse-099");


		System.out.println("Committed By Me---- Ahmed ALI Sp13-Bse-081");




		




		












	}
	
	
	
}

