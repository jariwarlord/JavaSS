
public class HumanTestDrive {
	public static void main(String[] args) { 
		Human one = new Human();
		one.Gpa = 3;
		one.Age = 12;
		one.name = "Burak";
		Human two = new Human();
		two.Gpa = 2;
		two.Age = 21;
		two.name = "Mert";
		Human three = new Human();
		three.Gpa = 4;
		three.Age = 20;
		three.name = "Arda";
		one.talk();
		two.talk();
		three.talk();
	} 
}
