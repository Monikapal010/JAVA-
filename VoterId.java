interface voter{
void castvote();
}


class ECIndia implements voter,EC{

public void castvote(){
System.out.println("Incast vote::ECIndia");
}
public void checkValidityOfVoter(int age)
{
if(age<=18){
throw Exception("invalid voter");
}
}
}


