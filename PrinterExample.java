package sec03.exam03;

public class PrinterExample {

	public static void main(String[] args) {
		// PrinterExample 클래스에서 Printer 객체를 생성하고 println()메소드를 호출해서 매개값을 콘솔에 출력
		
		Printer printer = new Printer();
		printer.println(10);
		printer.println(true);
		printer.println(5.7);
		printer.println("홍길동");
		
	}

}
