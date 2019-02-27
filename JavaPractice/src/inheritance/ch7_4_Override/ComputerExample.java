package inheritance.ch7_4_Override;

/*
 * �޼ҵ� ������(@Override)
 *  : ��ӵ� �޼ҵ��� ������ �ڽ� Ŭ������ ���� ���� ���,
 *    �ڽ� Ŭ�������� ������ �޼ҵ带 �������ϴ� ���� ���Ѵ�.
 *    
 *    �θ� ��ü�� �޼ҵ�� �������Ƿ�
 *    �ڽ� ��ü���� �޼ҵ带 ȣ���ϸ� �������̵��� �ڽ� �޼ҵ尡 ȣ��ȴ�.
 * */
public class ComputerExample {
	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("������ : " + calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("������ : " + computer.areaCircle(r));
	}
}
