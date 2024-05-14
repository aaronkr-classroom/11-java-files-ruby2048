import java.io.*;
import java.util.*;

public class Ex1204 {
	public static void main(String[] args) {
		File file = new File("members.txt");
		
		try {
			if(!file.exists()) {
				file.createNewFile();
			}
			FileWriter fw = new FileWriter(file);
			Scanner input = new Scanner(System.in);
			
			boolean quit = false;
			while (!quit) {
				System.out.print("ID : ");
				String uid = input.next();
				fw.write("ID : " + uid + " ");
				
				System.out.print("name : ");
				String uname = input.next();
				fw.write("name : " + uname + "\n");
				
				System.out.print("계속 진행? Y | N ");
				String str = input.next();
				
				if(str.toUpperCase().equals("N")) {
					quit = true;
				}
			}
			fw.close();
			System.out.println("파일 쓰기 성공!");
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
}