import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class COPY {
	public static void main(String args[]) throws IOException {

		FileInputStream fileinput = new FileInputStream("C:/Users/Student/Documents/aish_java/source.txt");
		FileOutputStream fileoutput = new FileOutputStream("DESTINATION.txt");
		int i;
		while (( i = fileinput.read() ) != -1) {
			fileoutput.write(i);
		}
		System.out.println("Succesfully copied one file to another");
		fileinput.close();
		fileoutput.close();
	}
}