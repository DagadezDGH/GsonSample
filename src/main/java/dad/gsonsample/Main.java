package dad.gsonsample;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Persona alguien =new Persona();
		Scanner scanner= new Scanner(System.in);
		String nombre= scanner.nextLine();
		String apellido= scanner.nextLine();
		int edad = scanner.nextInt();
		alguien.setfirstName(nombre);
		alguien.setlastName(apellido);
		alguien.setage(edad);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(alguien);
		System.out.println(json);
		scanner.close();
	}

}