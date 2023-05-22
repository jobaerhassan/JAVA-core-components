package EighthLecture;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_tester {
	public static void main(String[] args) {
		  
		File inpFile = new File("C:/Users/ComputerWorld/Desktop/inp.text"); //file extension name must be in inp..correction:: no no. inp.text will also acceptable.
		File outFile=new File("C:/Users/ComputerWorld/Desktop/out.text"); 
		// --------------------------------------------------------way 1 of read a file-------------------------------------------------------------//
//		try {
//			Scanner scanner =new Scanner(inpFile);
//			while(scanner.hasNext())
//			{
//				String tempString= scanner.nextLine();
//				
//				System.out.println(tempString);
//			}
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
////			e.printStackTrace();
//			System.out.println("file not found");
//		}
		//-----------------------------------------------------------------------way 2:-----------------------------------------------
//		try {
//			FileReader fileReader=new FileReader(inpFile);
//			Scanner scanner = new Scanner(fileReader);
//			while(scanner.hasNext())
//			{
//				String tempString= scanner.nextLine();
//				System.out.println(tempString);
//			}
//		} catch (Exception e) {
//			System.out.println("file not Found.");
//		}
//		FileReader.close();
		//------------------------------------------------------------way 2 finished----------------------------------------------------------------------------------//
		//----------------------------------------------file writer from a input file -------------------------------------------
//		try {
//			FileWriter fileWriter=new FileWriter(outFile);
//			FileReader fileReader =new FileReader(inpFile);
//			Scanner scanner=new Scanner(fileReader);
//			while(scanner.hasNext())
//			{
//				String tempString= scanner.nextLine();
//				System.out.println(tempString);
//				fileWriter.write(tempString+"\n");
//			}
//			fileWriter.close();
//			
//		} catch (IOException e) {
//			
//			System.out.println("writing file failed!");
//		}
		//-------------------------------file writer from a input file ends-------------------------------------------------------------------------------------------//
		
		
		//-------------------------------file writer from system or scanner-------------------------------------------------------------//
		try {
//			File newFile = new File("C:/Users/ComputerWorld/Desktop/out.text");
			FileWriter fileWriter=new FileWriter(outFile);
			Scanner scanner = new Scanner(System.in);
			while(scanner.hasNext())
			{
					String typeString = scanner.nextLine();
					fileWriter.write(typeString);
			}
			fileWriter.close();
		} catch (Exception e) {
			System.out.println("failed");
		}
		
	}
}
