package inheritance.ch7_4_Override;

/*
 * 메소드 재정의(@Override)
 *  : 상속된 메소드의 내용이 자식 클래스에 맞지 않을 경우,
 *    자식 클래스에서 동일한 메소드를 재정의하는 것을 말한다.
 *    
 *    부모 객체의 메소드는 숨겨지므로
 *    자식 객체에서 메소드를 호출하면 오버라이딩된 자식 메소드가 호출된다.
 * */
public class ComputerExample {
	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원면적 : " + calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원면적 : " + computer.areaCircle(r));
	}
}
