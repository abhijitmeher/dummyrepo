public class Test {

    public static boolean isEvenNo(Integer n){

        if(n%2==0){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        
        boolean isEven = Test.isEvenNo(10);

        System.out.println(isEven);

        
        
    }
}

