
public class Human {
	int Age;
	float Gpa;
	String name;
	
	void talk() { 
		if (Gpa > 2.0 && Age < 22) {
			System.out.println("22 ya��ndan k�����m ve s�n�f� ge�iyorum Ad�m :  "  +name );
		}
	 else if (Gpa < 2.0 && Age < 22) { 
		System.out.println("22 Ya��ndan k�����m ve s�n�fta kal�yorum. Ad�m : " + name);
	}else { 
		System.out.println("�kiside de�ilim.. ve Ad�m : " + name);
	} 
	
}
}