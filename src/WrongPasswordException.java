

    public class WrongPasswordException extends  RuntimeException{
    public WrongPasswordException(){
    }
    public  WrongPasswordException(String  massage,Throwable cause){
        super(massage,cause);
    }
     public  WrongPasswordException(String massage){
        super(massage);
     }
}
