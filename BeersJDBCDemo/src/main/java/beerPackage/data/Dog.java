package beerPackage.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor

@Entity
public class Dog {
	
	
	@Id
	private @Getter @Setter int id;
	@NonNull
	private @Getter @Setter String name;
	@NonNull
	@OneToOne
	private @Getter @Setter Owner ownerThatOwnsDog;
	
	
	
	

	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + ", ownerThatOwnsDog=" + ownerThatOwnsDog + "]";
	}

	public Dog(String name, Owner ownerThatOwnsDog) {
	
	
		this.name = name;
		this.ownerThatOwnsDog = ownerThatOwnsDog;
	}
	
	

	public Dog(int id, String name, Owner ownerThatOwnsDog) {
		super();
		this.id = id;
		this.name = name;
		this.ownerThatOwnsDog = ownerThatOwnsDog;
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

	public Owner getOwnerThatOwnsDog() {
		return ownerThatOwnsDog;
	}
	
	public void setOwnerThatOwnsDog(Owner ownerThatOwnsDog) {
		this.ownerThatOwnsDog = ownerThatOwnsDog;
	}
	
	
	
	
	
}