class Exam{
static {
System.out.println("static block 1:exam");
}
Exam(){
System.out.println("Exam constructor");
}
{
System.out.println("Init block exam");
}
static {
System.out.println("static block 2:Exam");
}
}
class MidTerm extends Exam{
static{
System.out.println("static block 1:mid term");
}
MidTerm(){
System.out.println("midterm constructor");
}
public String toString(){
return "midterm";
}
static {
System.out.println("static block 2:mid term");
}
public static void main(String args[]){
	System.out.println("welcome to midterm exam");
	Exam exam= new Exam();
	MidTerm javaProgramming=new MidTerm();
	System.out.println(javaProgramming);
}
{
System.out.println("init block midterm");
}
}
  

	
