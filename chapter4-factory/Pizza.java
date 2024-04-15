import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    String name; 

    Dough dough; 
    Sauce sauce; 
    Veggies veggies[]; 
    Cheese cheese; 
    Pepperoni perpperoni;
    Clams clam; 

    List<String> toppings = new ArrayList<String>();
    
    // 추상 메소드로 변경함
    abstract void prepare();

    void bake() { 
        System.out.println("175도에서 25분 간 굽기");
    }

    void cut() { 
        System.out.println("피자를 사선으로 자르기");
    }

    void box() { 
        System.out.println("상자에 피자 담기");
    }

    public String getName() {
        return name; 
    }
    
    public String toString() { 
        // 피자 이름을 출력하는 부분
    }

}

