import java.util.Scanner;
import java.util.Arrays;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CharCount {
	public static char[] readFile(String fileToRead){
		// change max size here
		// (maximum number of characters in your file)
		int max_size = 4452097;
		int controle = 0;

		char text[]= new char[max_size];

		Path path = Paths.get(fileToRead);
		try (Scanner sc = new Scanner(Files.newBufferedReader(path, StandardCharsets.UTF_8))){
			while (sc.hasNext()){
				// reads a line
				String line = sc.nextLine();

				// adds each character to the 'chars' array
				for (int i=0 ; i<line.length() ; i++){
					char c = line.charAt(i);
					text[controle] = c;
					controle++;
				}
			}

		} catch (IOException x){
			System.err.format("I/O error: %s%n", x);
		}

		return text;
	}

	public static void main(String[] args){
		// checks for argument
		if (args.length < 1) {
			System.out.println("Error: Missing filename.");
			System.exit(0);
		} else if (args.length > 1) {
			System.out.println("Error: Too many arguments. Please provide only one filename.");
			System.exit(0);
		}

		String filename = args[0];
		char[] text = readFile(filename);

		// initializes the frequency list with 0s
		long[] freq = new long[128];
		Arrays.fill(freq, 0);

		// counts the frequency for every char
		for(int i=0 ; i < text.length ; i++) freq[text[i]]++;

		// prints each character and its frequency
		for(int i=32 ; i <= 127 ; i++){
			char c = (char) i;
			System.out.println(i+": "+c+" ["+freq[i]+"]");
		}
	}
}
