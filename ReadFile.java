
import java.util.*;
import java.io.*;
//This Program will read the whole text file
// and save it in a String Variable called myfile.
public class ReadFile {

	public static void main(String[] args) {
		File file=new File("C:/Users/Gaurav/workspace/Study/src/Saturday_04_04/myfile.txt");
		
		try{
			Scanner fileScanner= new Scanner(file);
			try{
				String myfile=fileScanner.nextLine();
				while(fileScanner.hasNextLine()){
					myfile=myfile+ "\n"+fileScanner.nextLine();
				}
				System.out.println(myfile);
			}finally{
				fileScanner.close();
				
			}
		}catch(IOException e){
			e.printStackTrace();
		}
		

	}

}
