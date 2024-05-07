class Random{
 
 
public static void main(String args[])
    {
	  Random r=new Random();
	  r.getRandomDigit();
	  long randomNumber=getRandomDigit();
	  long startTime=System.nanoTime();
	  long endTime=System.nanoTime();
	  long timeTaken=endTime-startTime;
	  
	  System.out.println("Random number:"+randomNumber);
	  System.out.println("start Time:"+startTime);
	  System.out.println("end Time:"+endTime);
	  System.out.println("time taken:"+timeTaken+"seconds");
	  
	  
     }
 public static  long getRandomDigit()
 {
	 long digit=System.nanoTime();
	 return digit;
 } 
 public long Number(){
     
    long N=0;
    for(N=0;N<7;N++){
    
    long digit=getRandomDigit();
    
    }
    return N;
 
 }
 public boolean checkPrime(long n){
 
  for(int i=2;i*i<=n;i++){
  
	if(n%i==0){
	  
	  return false;
	  
        }
        else{
        
        return true;
        
        } 
    }
        return true; 

     }
   
   
}
	

