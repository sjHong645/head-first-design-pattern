package simpleremote;

// 커맨드 패턴의 'client'에 해당하는 부분 
public class RemoteControlTest {
	public static void main(String[] args) {

		// invoker 역할 
		// 필요한 작업을 요청할 때 사용할 커맨드 객체를 인자로 전달받는다. 
		SimpleRemoteControl remote = new SimpleRemoteControl();

		// receiver 역할
		// 요청을 받아서 작업을 처리할 Light 객체
		Light light = new Light();

		GarageDoor garageDoor = new GarageDoor(); 

		// command 객체 생성
		// 이때, receiver를 전달했다. 
		LightOnCommand lightOn = new LightOnCommand(light);

		GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor); 
 
		remote.setCommand(lightOn); // 커맨드 객체를 invoker에 전달 
		remote.buttonWasPressed(); // 버튼을 눌렀다.

		remote.setCommand(garageOpen);
		remote.buttonWasPressed();
    }
	
}


