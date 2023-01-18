package chapter15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.StringTokenizer;

public class StringTotalMain {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		Person person1 = new Person();
		System.out.println(person1);
		Class pClass = Class.forName("chapter15.Person");
		System.out.println(pClass);
		Person person2 = (Person) pClass.newInstance();
		System.out.println(person2);
		
		//=========================
		//String Class 의 정보 가져오기
		Class strClass = Class.forName("java.lang.String");
		System.out.println(strClass);
		System.out.println();
		//String Class의 생성자들 정보 가져오기
		System.out.println("-------Constructor-------");
		Constructor[] cons = strClass.getConstructors();
		for(Constructor c : cons) {
			System.out.println(c);
		}
		
		System.out.println("-------Field-------");
		
		Field[] field = strClass.getFields();
		for(Field f : field) {
			System.out.println(f);
		}
		
		System.out.println("-------Method-------");
		
		Method[] method = strClass.getMethods();
		for(Method m : method) {
			System.out.println(m);
		}
		

		//===============Tokenizer================
//		StringTokenizer(1,2,3)
//		1.사용할 String문자열, 2.분리하는 기준, 3.자르는 기준 표시 여부
		String str = "Have a Nice Day";	
		
		StringTokenizer obj = new StringTokenizer(str, " ", false); //str을 " "기준으로//기준안보여줌(false)-default
		
		while(obj.hasMoreTokens()) {
			String t = obj.nextToken();
			System.out.println(t);
		} //tokens를 각각보여줌
		
		
		
	}

}
