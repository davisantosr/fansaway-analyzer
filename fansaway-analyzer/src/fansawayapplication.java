import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class fansawayapplication {
	
	public static void main(String[] args) throws IOException {
		
		final Path path = Paths.get(RESOURCE);
		final List<String> lines = Files.readAllLines(path);
		int total = 0;
		for(final String line : lines) {
			final String[] columns = line.split(",");
			final int amount = Integer.parseInt(columns[1]);
			total += amount;	
			
		}
		
		System.out.println("The Total of fans at arena:  " + total);		
				
	}
	
	private static final String RESOURCE = "C:\\Temp\\visitorsanalyzer\\resources.txt";

}
