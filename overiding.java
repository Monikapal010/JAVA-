public class overiding{

void overiding1(){
System.out.println("overidng 1");
}
}

class methodoveriding extends overiding{
void overiding1(){
System.out.println("overidng again");
}

public static void main(String args[]){
methodoveriding Q=new  methodoveriding();

Q.overiding1();
Q.overiding1();
}
}

