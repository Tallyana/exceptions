//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SecurityUtils.check("megabit65_" , "630845la_" ,  "630845la_" );
    }
}
  /* или так...

   try {
     SecurityUtils.check("cnduwl12" ,"12345" ,"1234");
    } catch (WrongPasswordException e ) {
     System.err.println( "Error!" +e.getMassage());
     } catch (WrongLoginException e){
        throw new RuntimeException(e);
       }  finally {
       System.out.println("Cпать!")
        }}

        try {
        int a = 5/0;
        } catch (ArithmeticException e ) {
        } System.out.println("it's ok")
        }

        Throwable  ловит любую ошибку (+JVM)(error -наследник траблов)
        while (true){
        try{
        }catch (Throwable e) {
        }
        */