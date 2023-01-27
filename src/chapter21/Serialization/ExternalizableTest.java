package chapter21.Serialization;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Dog implements Externalizable{ //직렬화된 클래스
	
	String name;
	
	public Dog() {
		
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
	}

	@Override
	public String toString() {
		return name;
	}
	
} // class Dog


public class ExternalizableTest {
	
	public static void main(String[] args) throws IOException {
		
		// Externalizable: interface Externalizable 사용하여 내부의 내용을 쉽게 조작함.
		// writeExternal() / readExternal() 사용하여 직렬화/역직렬화를 수행한다.
		
		Dog myDog = new Dog();
		
		myDog.name = "백설이";
		
		//직렬화
		FileOutputStream fos = new FileOutputStream("external.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		try (fos;oos) {
			oos.writeObject(myDog);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//역직렬화
		FileInputStream fis = new FileInputStream("external.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		try (fis;ois) {
			Dog dog = (Dog) ois.readObject();
			System.out.println(dog);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // main

} //class ExternalizableTes
