package simpleremote;

//
// This is the invoker
//
public class SimpleRemoteControl {

	// 커맨드를 저장할 슬롯 1개 
	// 이 슬롯에 1개의 기기를 제어한다. 
	Command slot;
 
	public SimpleRemoteControl() {}
 
	// 슬롯을 가지고 제어할 명령을 설정하는 메소드 
	// 리모컨의 기능을 바꾸고 싶을 때
	// 이 메소드를 사용해서 바꾸면 된다. 
	public void setCommand(Command command) {
		slot = command;
	}
 
	// 버튼을 눌렀을 때 호출하는 메소드
	// 슬롯에 연결된 커맨드 객체의 execute() 메소드만 호출하면 된다.
	public void buttonWasPressed() {
		slot.execute();
	}
}


