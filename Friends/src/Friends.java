import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Friends {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws FileNotFoundException {

		Scanner inp = new Scanner(System.in);
		Scanner scan = new Scanner(new File(inp.nextLine()));
		int amount= Integer.parseInt(scan.nextLine());
		String[] input = new String[amount]; // # of students to put in
		
		for (int x = 0; x < input.length; x++) // Student|y/n|school
			input[x] = scan.nextLine();
		
		LinkedList<People> listOfStudents = new LinkedList<People>();
		People person;
		String[] info;
		for(int x = 0; x < input.length; x++){
			info = input[x].split("\\|");
			if(info.length==3)
				person = new People(info[0], info[1], info[2]);
			else
				person = new People(info[0], info[1], "");
			listOfStudents.add(person);
		}

		//create the graph, no edges
		Graph friendships = new Graph(amount, listOfStudents); 
		
		for(int x = 0; x < amount; x++){
			input[x] = scan.nextLine();
			info = input[x].split("\\|");
			friendships.addEdge(info[0], info[1]);
		}

	}

}
