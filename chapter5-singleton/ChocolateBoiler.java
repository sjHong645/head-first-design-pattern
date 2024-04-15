
public class ChocolateBoiler {

    private boolean empty; 
    private boolean boiled; 

    private static ChocolateBoiler uniqueInstance; 

    private ChocolateBoiler() {
        empty = true; 
        boiled = false; 
    }

    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            return new ChocolateBoiler(); 
        }

        return uniqueInstance; 
    }

    // 보일러에 우유와 초콜릿을 혼합한 재료를 넣음 
    public void fill() {
        if(isEmpty()) { 
            empty = false; 
            boiled = false;
            
        }
    }

    // 끓인 재료를 다음 단계로 흘려보내는 메소드 
    public void drain() { 
        if(!isEmpty() && isBoiled()){
            
            empty = true; 
        }
    }

    // 재료를 끓임
    public void boil() { 
        if(!isEmpty() && !isBoiled()){
            boiled = true; 
        }
    }

    public boolean isEmpty() { 
        return empty; 
    }

    public boolean isBoiled() { 
        return boiled; 
    }
}


