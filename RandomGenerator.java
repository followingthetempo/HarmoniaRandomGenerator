import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class RandomGenerator {

	public static void main(String[] args) {
		
		ArrayList<String> characters=new ArrayList<String>();
		//the main Harmonia University cast is the base
		characters.add("Gerolt");
		characters.add("Medley");
		characters.add("Tempo");
		characters.add("Braham");
		characters.add("Axel");
		characters.add("Neville");
		characters.add("Otto");
		characters.add("Wulfric");
		characters.add("Mitzi");
		characters.add("Schwarz");
		characters.add("Julien");
		characters.add("Beau");
		characters.add("Jelle");
		characters.add("Katrina");
		characters.add("Finley");
		characters.add("Corms");
		characters.add("Jokull");
		characters.add("Marcin");
		characters.add("Siri");
		characters.add("Cherry");
		characters.add("Fiona");
		characters.add("Momoko");
		characters.add("Thalia");
		characters.add("Miles");
		
		ArrayList<String> allChars=new ArrayList<String>();
		allChars.addAll(characters);
		//keep prompting user for input until they want to quit
		boolean stop=false;
		Scanner s=new Scanner(System.in); 
		int option;
		
		while (!stop) {
		System.out.println("Time to generate a random character!! Type in the following: ");
		System.out.println("1: Harmonia University Generator\n2: Professor Generator\n3: All Character generator\n4: Quit");
		option=s.nextInt();
		
		if (option==1) {
			System.out.println("The lucky character is: "+generateRandom(characters)+"\n");
		}
		else if(option==2) {
			System.out.println("The lucky character is: "+generateProfessor(characters)+"\n");
		}
		else if (option==3) {
			System.out.println("The lucky character is: "+includeOtherChars(allChars)+"\n");
		}
		else if (option==4) {
			System.out.println("Bye!");
			stop=true;
			
		}else{
			System.out.println("Sorry, what was that?");
			System.out.println("1: Harmonia University Generator\n2: Professor Generator\n3: All Character generator\n4: Quit");
		}
		}
	}
	
	//generate a random character from Castelia Academy
	public static String generateRandom(ArrayList<String> characters) {
			
		Random generator=new Random();
		int result=generator.nextInt(characters.size());
		return characters.get(result);
}
	
	//generate a random Harmonia professor
	public static String generateProfessor(ArrayList<String> characters) {
		int i=0;
		ArrayList<String> professors=new ArrayList<String>();
		while (i<characters.size()) {
			if (characters.get(i).equals("Wulfric")||characters.get(i).equals("Siri")||characters.get(i).equals("Jokull")||characters.get(i).equals("Marcin")||characters.get(i).equals("Mitzi")||characters.get(i).equals("Cherry")||characters.get(i).equals("Finley")||characters.get(i).equals("Beau")||characters.get(i).equals("Jelle")||characters.get(i).equals("Samson")||characters.get(i).equals("Katrina")) {
			professors.add(characters.get(i));
			}
			i++;
		}
		
		Random generator=new Random();
		int n=0;
		
		while (n<5) {
			int result=generator.nextInt(professors.size());
			professors.remove(result);
			n++;
		}
		return professors.get(0);
	}
	//adding my other askblog characters into the array
	public static String includeOtherChars(ArrayList<String> characters) {
		characters.add("Janove");
		characters.add("Kaizer");
		characters.add("Joanne");
		characters.add("Iggy");
		characters.add("Kaoru");
		characters.add("Koen");
		
		return generateRandom(characters);
	}
}
