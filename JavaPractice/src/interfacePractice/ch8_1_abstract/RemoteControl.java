package interfacePractice.ch8_1_abstract;

/*
 * �������̽��� �޼ҵ�� ���� ����� �ʿ� ���� �߻� �޼ҵ�� ����
 * 
 * ��� public abstract�� Ư���� ���� ������ 
 * public abstract �����ϴ��� �ڵ������� ������ �������� �ٴ´�.
 * 
 * */
public interface RemoteControl {
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// �߻� �޼ҵ�
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
