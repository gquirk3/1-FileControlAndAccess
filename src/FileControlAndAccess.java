import java.nio.charset.Charset;
import java.nio.file.*;
import java.io.*;
import java.util.*;

public class FileControlAndAccess {

	public static void main(String[] args) 
	{
		List<String> lines = new ArrayList();
		lines.add("Hello");
		lines.add("World");
		try {
			Files.write(Paths.get("myFile.txt"), lines,Charset.defaultCharset());
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}

		List<String> readLines = null;
		try {
			readLines = Files.readAllLines(Paths.get("myFile.txt"));
			for(String str : readLines)
				System.out.println(str);
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}

		
		
		// query path
//		Path parent = Paths.get(".");
//		try (DirectoryStream<Path> children = Files.newDirectoryStream(parent)) 
//		{
//			for (Path child : children) {
//				System.out.println(child);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		
		// create directory
//		Path dir = Paths.get("MyNewDirectory");
//		try {
//		    Path newFolder = Files.createDirectories(dir);
//		    System.out.println(newFolder);
//		} catch (FileAlreadyExistsException x) {
//		    System.err.format("directory named %s already exists%n", dir);
//		} catch (IOException x) {
//		    System.err.format("createFile error: %s%n", x);
//		}

				
//		// create file
//		Path file = Paths.get("myFile.txt");
//		try {
//		    // Create the empty file with default permissions, etc.
//		    Path newFile = Files.createFile(file);
//		    System.out.println(newFile);
//		} catch (FileAlreadyExistsException x) {
//		    System.err.format("file named %s" +" already exists%n", file);
//		} catch (IOException x) {
//		    System.err.format("createFile error: %s%n", x);
//		}

		
//		FileSystem fs = FileSystems.getDefault();
//		System.out.println("Separator is: " + fs.getSeparator());
//		System.out.println("The following root directories are available: ");
//		for(Path p : fs.getRootDirectories())
//		{
//			System.out.println(p);
//		}
//
//		Path path = FileSystems.getDefault().getPath("/home/user/images");
//		System.out.println(path);
//		for(int i=0;i<path.getNameCount();i++)
//			System.out.println(path.getName(i));
		// below does the same as for statement - for statement works for all lengths
//		System.out.println(path.getName(0));
//		System.out.println(path.getName(1));
//		System.out.println(path.getName(2));

		

	}

}
