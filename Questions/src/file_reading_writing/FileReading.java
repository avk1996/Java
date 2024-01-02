package file_reading_writing;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) throws IOException {
		File file = new File("F:\\Abhishek\\cdac\\Java\\JavaOutRepo\\RoughWork.txt");
		FileInputStream inputStream = new FileInputStream(file);
		byte bytes[] = new byte[(int)file.length()];
		int numOfBytes = inputStream.read(bytes);
		System.out.println("Data copied successfully...");
		System.out.println(numOfBytes);
	}

}
