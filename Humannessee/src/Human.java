
public class Human {
	int Age;
	float Gpa;
	String name;
	
	void talk() { 
		if (Gpa > 2.0 && Age < 22) {
			System.out.println("22 yaþýndan küçüðüm ve sýnýfý geçiyorum Adým :  "  +name );
		}
	 else if (Gpa < 2.0 && Age < 22) { 
		System.out.println("22 Yaþýndan küçüðüm ve sýnýfta kalýyorum. Adým : " + name);
	}else { 
		System.out.println("Ýkiside deðilim.. ve Adým : " + name);
	} 
	
}
}