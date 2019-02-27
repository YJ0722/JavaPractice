package interfacePractice.ch8_1_abstract;

/*
 * 인터페이스의 메소드는 실행 블록이 필요 없는 추상 메소드로 선언
 * 
 * 모두 public abstract의 특성을 갖기 때문에 
 * public abstract 생략하더라도 자동적으로 컴파일 과정에서 붙는다.
 * 
 * */
public interface RemoteControl {
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// 추상 메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
}
