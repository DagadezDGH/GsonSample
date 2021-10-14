package dad.gsonsample;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Persona alguien =new Persona();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Introduzca un nombre");
		String nombre= scanner.nextLine();
		System.out.println("Introduzca un apellido");
		String apellido= scanner.nextLine();
		System.out.println("Introduzca la edad");
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