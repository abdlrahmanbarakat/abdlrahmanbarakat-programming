package St;

public class mainst {

	public static void main(String[] args) {

		student.smile();
		
			student student1 = new student();
		System.out.println("student1: name: "+ student1.getName() + " / age: " + student1.getAge() + " / gender: " + student1.getGender() + " / Specialization: " + student1.getSpecialization() + " / hobby: "+ student1.getHobby() );
			student1.study();
		System.out.println("student1: mood: " + student1.getMood() + " /hungry: " + student1.getHungry() + " /energy:" + student1.getEnergy());
		
			student student2 = new student("Ahlam",20,"female","cyber security","tennis",2,5,1);
		System.out.println("student2: name: "+ student2.getName() + " / age: " + student2.getAge() + " / gender: " + student2.getGender() + " / Specialization: " + student2.getSpecialization() + " / hobby: "+ student2.getHobby() );
			student2.sport();
		System.out.println("student2: mood: " + student2.getMood() + " / hungry: " + student2.getHungry() + " / energy:" + student2.getEnergy());

					student2.setName("raya");
					student2.setAge(21);
					student2.setSpecialization("engineer");
					student2.setHobby("art");
		System.out.println("student2: name: "+ student2.getName() + " / age: " + student2.getAge() + " / gender: " + student2.getGender() + " / Specialization: " + student2.getSpecialization() + " / hobby: "+ student2.getHobby() );

		
		
	}

}
