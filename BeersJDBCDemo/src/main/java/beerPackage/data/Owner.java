package beerPackage.data;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@RequiredArgsConstructor

@Entity

public class Owner {
	
	@Id
	@GeneratedValue
	private @Getter @Setter int id;
	
	@NonNull
	private @Getter @Setter String name;

	@OneToOne (mappedBy = "ownerThatOwnsDog")
	private @Getter @Setter Dog dog;
	
	//private @Getter @Setter 
//	List<Dog> dog;
	
	
	
	
	
	@Override
	public String toString() {
		return "Owner [id=" + id + ", name=" + name + "]";
	}
	public Owner( int id, String name)	{
	
		this.id = id;
		this.name = name;
		
	}
	public Owner(int id, String name, Dog dog) {
		this.id = id;
		this.name = name;
		this.dog = dog;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}

	
	public void setName(String name) {
		this.name = name;
	}

	
	public Dog getDog() {
		return dog;
	}

	
	public void setDog(Dog dog) {
		this.dog = dog;
	}

	
	

}
