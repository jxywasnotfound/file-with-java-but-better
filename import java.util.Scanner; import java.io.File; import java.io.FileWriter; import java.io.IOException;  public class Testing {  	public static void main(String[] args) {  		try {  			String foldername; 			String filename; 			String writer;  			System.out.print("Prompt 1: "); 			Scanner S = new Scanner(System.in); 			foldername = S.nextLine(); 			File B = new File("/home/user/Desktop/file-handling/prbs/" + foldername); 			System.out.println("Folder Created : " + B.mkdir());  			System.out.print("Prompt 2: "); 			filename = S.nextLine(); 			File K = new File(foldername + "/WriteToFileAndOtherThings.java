import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Testing {

	public static void main(String[] args) {

		try {

			String foldername;
			String filename;
			String writer;

			System.out.print("Prompt 1: ");
			Scanner S = new Scanner(System.in);
			foldername = S.nextLine();
			File B = new File("/home/user/Desktop/file-handling/prbs/" + foldername);
			System.out.println("Folder Created : " + B.mkdir());

			System.out.print("Prompt 2: ");
			filename = S.nextLine();
			File K = new File(foldername + "/" + filename + ".txt");
			System.out.println("File Created: " + K.createNewFile());

			System.out.println("Prompt 3: ");
			FileWriter D = new FileWriter(foldername + "/" + filename + ".txt");
			writer = S.nextLine();
			D.write(writer);
			D.close();
		}

		catch(IOException e) {

			System.out.println("Error");
		}
	}
}
