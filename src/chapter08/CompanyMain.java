package chapter08;

public class CompanyMain {

	public static void main(String[] args) {
		//heap(일반적인 객체 생성)
		Company company1 = new Company();
		Company company2 = new Company();
		
		System.out.println(company1);
		System.out.println(company2);//1과 2는 독립적으로 움직인다....
		System.out.println(company1==company2);
		
		System.out.println("----singleton----");
		//데이터영역임Data
		
		Company myCompany1 = Company.getInstance();
		System.out.println(myCompany1);
		Company myCompany2 = Company.getInstance();
		System.out.println(myCompany2);//singleton은 같은곳을 바라본다...
		System.out.println(myCompany1==myCompany2);
		//합계 같은거 할 때...총 수입 같은것.
	}

}
