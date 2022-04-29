package be.intecbrusselsbe;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;


public class IOMainApp {
	

	public static void main(String[] args) {
		

    Path pearlPath = Path.of("../../FromPriyankaToPearl/message.txt");
		
		try{
			
			if (Files.notExists(pearlPath.getParent())) {
				Files.createDirectories(pearlPath.getParent());
	
			}
				
			if (Files.notExists(pearlPath )) {
				Files.createFile(pearlPath);
			}
				
		}catch (IOException e) {
			e.printStackTrace();
		}
		
       System.out.println("This message is for message.txt: ");
		
		
		try (FileWriter fileWriter = new FileWriter("../../FromPriyankaToPearl/message.txt");
				BufferedWriter  bufferedWriter =new BufferedWriter(fileWriter)){
			bufferedWriter.write("Hello Pearl,");
			bufferedWriter.write(" You are one of the best instructor.");
						
		}catch (IOException e) {
			e.printStackTrace();
			}
			
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(pearlPath.toString()))){
			
			String line;
			while ((line = bufferedReader.readLine())!=null){
				System.out.println(line);	
			} 	
		}catch(IOException e) {
				e.printStackTrace();	
			}
        
		
		Path animalPath = Path.of("../../FromPriyankaToPearl/animal.txt");
		
		
		try {
			if (Files.notExists(animalPath.getParent())) {
				Files.createDirectories(pearlPath.getParent());
	
			}
				
			if (Files.notExists(animalPath )) {
				Files.createFile(animalPath);
			}
				
		}catch (IOException e) {
			e.printStackTrace();
		}


			System.out.println("This message is for animal.txt: ");
			
        try (FileWriter fileWriter = new FileWriter("../../FromPriyankaToPearl/animal.txt");
				BufferedWriter  bufferedWriter =new BufferedWriter(fileWriter)){
			bufferedWriter.write(" My favourite animal is Panda. ");
			bufferedWriter.write(" It's fun to watch rolling dowm here and there.");
						
		}catch (IOException e) {
			e.printStackTrace();
			}
			
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(animalPath.toString()))){
			
			String line;
			while ((line = bufferedReader.readLine())!=null){
				System.out.println(line);	
			} 	
		}catch(IOException e) {
				e.printStackTrace();	
			}

        
        
        System.out.println("Making instance of animal: ");
        
		Animal animal = new Animal("Panda",false);
		Animal animal1 = new Animal("White Tiger", false);
		
		try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(
				new FileOutputStream("../../FromPriyankaToPearl/animal.txt")) ) {
			
			objectOutputStream.writeObject(animal);
			objectOutputStream.writeObject(animal1);
			

			
		} catch( FileNotFoundException e) {
			e.printStackTrace();
			
		} catch(IOException e) {
			e.printStackTrace();
			
		}
		try(ObjectInputStream objectInputStream = new ObjectInputStream(
				new FileInputStream ("../../FromPriyankaToPearl/animal.txt"))){

			
			Animal wildanimal;
			while((wildanimal = (Animal) objectInputStream.readObject())!=null) {
				System.out.println(wildanimal);
				
			}
			
		} catch (EOFException e)	{
			System.out.println("The end.");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException  e) {
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		}
		
		
		}
		
		
	}
	
	

	


