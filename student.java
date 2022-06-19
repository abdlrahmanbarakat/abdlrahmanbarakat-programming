package St;

public class student {
	
	private String name;
	private int age;
	private String gender;
	private String Specialization;
	private String hobby;
	
	private int mood;
	private int hungry;
	private int energy;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSpecialization() {
		return Specialization;
	}
	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public int getMood() {
		return mood;
	}
	public void setMood(int mood) {
		this.mood = mood;
	}
	public int getHungry() {
		return hungry;
	}
	public void setHungry(int hungry) {
		this.hungry = hungry;
	}
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}
	
	
	
	public student()
	{
	 name= "abd";
	 age = 19;
	 gender = "male";
	 Specialization = "computer science";
	 hobby = "football";
	 
	 mood = 5;
	 hungry = 6;
	 energy = 3;
	}
	public student(String name, int age, String gender, String Specialization, String hobby, int mood, int hungry, int energy)
	{
	this.name=name;
	this.age=age;
	this.gender=gender;
	this.Specialization=Specialization;
	this.hobby=hobby;
	this.mood=mood;
	this.hungry=hungry;
	this.energy=energy;
	}
	
	public void study()
	{
		mood--;
		hungry++;
		energy--;	
	System.out.println("I am studying right now");	
	}
	public void university()
	{
		mood--;
		hungry++;
		energy--;	
	System.out.println("I am going to university");
	}
	public void sleep() 
	{
		mood++;
		hungry++;
		energy++;	
	System.out.println("good night .. zzz");
	}
	public void sport()
	{
		mood++;
		hungry++;
		energy--;	
	System.out.println("I am at the gym");
	}
	public void eat()
	{
		mood++;
		hungry--;
		energy++;	
	System.out.println("I'm eating now .. delicious");
	}
	public static void smile()
	{
		System.out.println("I am happy");
	}
	 
}
