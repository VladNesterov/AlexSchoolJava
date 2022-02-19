package mama;

public class Alex3 {

    private Integer a = new Integer(5) ;
//  private сокрытие реализации от других классов

    private void printLine(String str){
        System.out.println("Hello world");
    }

     String получимТриПервыхСимвола(String str){
        return str.substring(0,3);
    }

    private void printLine(){
        System.out.println("Hello world without arg");
    }

    public void mySoul(int a, String str){
        System.out.println(str+a);
    }

}
