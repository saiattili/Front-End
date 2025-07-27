

class a{
    a(){
        
        System.out.println("general a");
    }
    a(int a){
     this();
    System.out.println("parameterized a");
}
}
class b extends a{
    b(){
        super(5);
        System.out.println("grnral b");
    }
    b(int a){
        this();
        System.out.println("parameterized b");
    }

}




public class Main {

    public static void main(String[] args){
        b b1= new b(5);
        
    }
}
