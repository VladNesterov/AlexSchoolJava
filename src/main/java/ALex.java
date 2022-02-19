import mama.Alex2;
import mama.Alex24;
import mama.Alex3;

public class ALex extends Alex2{

    private void doSomething(){
        Integer a = 10;
        String b = "Vova";

        System.out.println(this.a);
 }

    private void doSomething11(){

        System.out.println("mama");
        System.out.println("papa");
    }

    public static void main(String[] args) {
        ALex aLex = new ALex();
        aLex.doSomething11();
        aLex.doSomething();
    }


}
/* Класс это описание объекта, новый объект создается через оператор new пример (new ALex());
      ALex aLex = new ALex();



 */
