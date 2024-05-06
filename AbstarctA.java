abstract  class A{
    A()
    {
     System.out.println("hhhhh");
    }

 public abstract void Function();

}
class B extends A{
    B(){
    super();
    }
    
     public void Function(){
     System.out.println("bbbbb");
     }
}
class C extends A{

      public void Function(){

       System.out.println("cccc");
  }
}


class Work{

public static void main(String args[]){
   B a= new B();
   C c=new C();
   a.Function();
   c.Function();
   
}
}
