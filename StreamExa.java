package StreamsExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class StreamExa {
	
	public static void main(String args[]) {
		
	List<String> lista = Arrays.asList("Javier", "Camilo", "Carlos", "Karen", "Sebastian",
			"Julian","Chloe","Christopher","Cecilia");

	lista.stream().filter(s -> s.startsWith("Ch")).map(String::toUpperCase).sorted().forEach(System.out::println);
	
	}
	
}
