package c0304.����t;

import java.util.*;

class Test1 {
	public static void main(String[] args) {
		Dog ououDog = new Dog("ŷŷ", "ѩ����");
		Dog yayaDog = new Dog("����", "��������");
		Dog meimeiDog = new Dog("����", "ѩ����");
		Dog feifeiDog = new Dog("�Ʒ�", "��������");		
		
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(ououDog);
		dogs.add(yayaDog);
		dogs.add(meimeiDog);
		dogs.add(2, feifeiDog); // ���feifeiDog��ָ��λ��		
		
		System.out.println("������" + dogs.size() + "��������");
		
		System.out.println("�ֱ��ǣ�");
		for (int i = 0; i < dogs.size(); i++) {
			//Dog dog = (Dog) dogs.get(i);
			Dog dog = dogs.get(i);
			System.out.println(dog.getName() + "\t"+ dog.getBreed());
		}
	}
}

class Dog{
	String name;
	String breed;
	
	public Dog() {
	}
	public Dog(String name,String breed) {
		this.name = name;
		this.breed = breed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}


}

