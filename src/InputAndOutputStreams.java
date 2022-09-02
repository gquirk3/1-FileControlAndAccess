import java.nio.charset.Charset;
import java.nio.file.*;
import java.io.*;
import java.util.*;

public class InputAndOutputStreams {

	public static void main(String[] args) 
	{
		
		// pauses for user input - write and read user input
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
				try {
					System.out.println("Enter something: ");
					String str = br.readLine();
					System.out.println("You entered: " + str);
				} catch (IOException ioe) {
				}

		
		// human readable
//		Path path = Paths.get("example.txt");
//		try (BufferedWriter bufferedWriter =
//			Files.newBufferedWriter(path, Charset.defaultCharset(),
//				StandardOpenOption.CREATE);
//			PrintWriter printWriter =
//				new PrintWriter(bufferedWriter)) {
//				printWriter.println("PrintWriter is easy to use.");
//				printWriter.println(1234);
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//
//		path = Paths.get("example.txt");
//		try 
//		{
//			BufferedReader br = Files.newBufferedReader(path, Charset.defaultCharset());
//			String line = br.readLine();
//			while (line != null) {
//				System.out.println(line);
//				line = br.readLine();
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		
		// Binary
//		Path path = Paths.get("example.bin");
//		try (OutputStream outputStream = 	Files.newOutputStream(path,
//		StandardOpenOption.CREATE, StandardOpenOption.APPEND);
//			BufferedOutputStream buffered =	new BufferedOutputStream(outputStream)) 
//		{
//				// manipulate buffered, not outputStream
//				buffered.write(10);
//				buffered.write(12);
//				buffered.write(42);
//				buffered.close();
//			} catch (IOException e) {
//			// do something with e
//			}
//
//		path = Paths.get("example.bin");
//		try (InputStream inputStream = Files.newInputStream(path, StandardOpenOption.READ);
//			BufferedInputStream buffered = new BufferedInputStream(inputStream)) 
//		{
//				byte[] byteArray = new byte[100];
//				int n = buffered.read(byteArray);
//				for(int i=0;i<n;i++)
//					System.out.println(byteArray[i]);
//				// manipulate buffered, not inputStream
//				
//			} catch (IOException e) {
//				// do something with e
//			}
//

	}

}
