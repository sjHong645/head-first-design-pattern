
public class Singleton {

    private static Singleton uniqueInstance; 

    // 기타 인스턴스 변수

    private Singleton() {} // 생성자를 private으로 선언했기 때문에
                           // Singleton 클래스에서만 클래스의 인스턴스를 만들 수 있음

    
    // Singleton 클래스의 인스턴스를 만들어서
    // return한다. 
    public static Singleton getInstance() { 
        if (uniqueInstance == null) { 
            uniqueInstance = new Singleton(); 
        }

        return uniqueInstance; 
    }

    // 기타 메소드 
}


