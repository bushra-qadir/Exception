package exception;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Newclass2 {
	
	private static final String filename = "input.txt";
	
	
	public static void main(String[] args) throws IOException //throws IOException
	{

<<<<<<< HEAD
	


=======
>>>>>>> branch 'master' of https://github.com/bushra-qadir/Exception
		BufferedReader rd = null;
		File file=new File(filename);
<<<<<<< HEAD
		System.out.println("Abdul hakeem (sp13-bse-110)");
		System.out.println("Abdul hakeem (sp13-bse-110)");
=======
<<<<<<< HEAD
		
		
=======
		System.out.println("Abdul hakeem (sp13-bse-110)");
		System.out.println("Abdul hakeem (sp13-bse-110)");
>>>>>>> branch 'master' of https://github.com/bushra-qadir/Exception.git
>>>>>>> branch 'master' of https://github.com/bushra-qadir/Exception
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
<<<<<<< HEAD
			// Close the file.


			System.out.println("Abdullah Malik      SP13-BSE-072");

			System.out.println("Mustafa here, please enter your commits below (sp13-bse-092)");



=======
			// Close the file.
			System.out.println("Abdul Rehman Ali");
			System.out.println("SP13-BSE-004 ");
>>>>>>> branch 'master' of https://github.com/bushra-qadir/Exception
			System.out.println("Mustafa here, please enter your commits below (sp13-bse-092)");


			try {
				rd.close();
			}
			catch (IOException ex) {
				System.err.println("An IOException was caught!");
				ex.printStackTrace();
			}
<<<<<<< HEAD

			System.out.println("Sofware Construction Lab");
			System.out.println("Name::Sohail...........++........RegNum::Sp13-Bse-083");
=======
<<<<<<< HEAD
			System.out.println("name Najeebullah");
			System.out.println("Reg sp13-bse-076");
=======
<<<<<<< HEAD
			System.out.println("Sofware Construction Lab");
			System.out.println("Name::Sohail...........++........RegNum::Sp13-Bse-083");
>>>>>>> branch 'master' of https://github.com/bushra-qadir/Exception
>>>>>>> branch 'master' of https://github.com/bushra-qadir/Exception
			
<<<<<<< HEAD

			System.out.println("Bushra here, please enter your commits below");
			System.out.println("NIAZ AHMAD, roll number:SP13-BSE-063");


=======
=======
			System.out.println("Bushra here, please enter your commits below");
			System.out.println("NIAZ AHMAD, roll number:SP13-BSE-063");

		}


		System.out.println("Ahsan Riaz");
		System.out.println("SP13-bse-123");

		System.out.println("Usman Alam ");
		System.out.println("sp13-bse-077");
		


		

		System.out.println("Hamaad chaudhery");
		System.out.println("Sp13-bse-099");

		System.out.println("Committed By Me---- Ahmed ALI Sp13-Bse-081");


		System.out.println("Ahsan Riaz");
		System.out.println("SP13-bse-123");


		System.out.println("AMIR TANOLI");
		System.out.println("FA12-BSE-246");

		System.out.println("Usman Alam ");
		System.out.println("sp13-bse-077");
		

		

		System.out.println("Hamaad chaudhery");
		System.out.println("Sp13-bse-099");

		System.out.println("Committed By Me---- Ahmed ALI Sp13-Bse-081");


		System.out.println("Ahsan Riaz");
		System.out.println("SP13-bse-123");

	}



}
