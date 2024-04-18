interface InterfaceExample{
	 
	  void function(int x,int y);
	  void set(long d,long e);
	  }
	  
 class A implements InterfaceExample{
	public void function(int x, int y){
		int sum=x+y;
		System.out.println(sum);
	}
        public void set(long d,long e){
	long add=d+e;
	System.out.println(add);
	}
}
	
class B implements InterfaceExample{
public void function(int x, int y){
		int sum=x+y;
		System.out.println(sum);
	}
public void set(long d,long e){
long add=d+e;
System.out.println(add);
}
}
class Test{
	public static void main(String[] args){
		A a=new A();
		B b=new B();
		a.function(10,20);
		b.set(32L,43L);
	}
}

