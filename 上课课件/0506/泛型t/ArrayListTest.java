package c0304.泛型t;

import java.util.*;

class Test1 {
	public static void main(String[] args) {
		Dog ououDog = new Dog("欧欧", "雪娜瑞");
		Dog yayaDog = new Dog("亚亚", "拉布拉多");
		Dog meimeiDog = new Dog("美美", "雪娜瑞");
		Dog feifeiDog = new Dog("菲菲", "拉布拉多");		
		
		List<Dog> dogs = new ArrayList<Dog>();
		dogs.add(ououDog);
		dogs.add(yayaDog);
		dogs.add(meimeiDog);
		dogs.add(2, feifeiDog); // 添加feifeiDog到指定位置		
		
		System.out.println("共计有" + dogs.size() + "条狗狗。");
		
		System.out.println("分别是：");
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

