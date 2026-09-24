public class Hello{

    public static String isActive(boolean val){

        String status = "";

        if(val){
            status = "Active";
        }else{
            status = "No-Active";
        }
        
        return status;
    }

    public static void main(String[] args) {
        
        String status = Hello.isActive(true);
    
        System.out.println(status);

    }
}
