package chapter11;

public class HttpServletMain {

	public static void main(String[] args) {
		
		method(new LoginService());
		method(new FileDownloadService());	
	}
	
	//메소드명 method
//	static void method() {
//		HttpServlet down = new FileDownloadService();
//		HttpServlet login = new LoginService();
//		down.service();
//		login.service();
		
	public static void method(HttpServlet http) {
		http.service();
	}

}
