package chapter16.generic2;

public class GenericPrinter<T extends Material> { // 상속받은것만 들어올 수 있게 설정
	
	private T material;
	
	@Override
	public String toString() {
		return material.toString();
	}
	
	//Getter Setter
	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}


	

}
