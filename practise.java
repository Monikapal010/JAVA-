class SY2022bit010
{
	public static void main(String[] args)
	{
	String RegNo[]={"2022bit010","2022bit004","2022bcs124","2022bch045","2022bme010"};
	System.out.println(getValidRegistrationsCount(RegNo));
	System.out.println(getValidRegistrationsCountLe50(RegNo));
	
	
	}
	public static int getValidRegistrationsCount(String registrations[]) 
	{
	
	int valid = 0;
	 for(int i=0;i<registrations[0].length();i++)
	 {
	 if(registrations[i].length()==10 && ((registrations[i].charAt(4)=='b'&& registrations[i].charAt(5)=='i' && registrations[i].charAt(6)=='t')))
	
         valid++;
         return valid;
         
         }
         return 0;
         }
    public static int getValidRegistrationsCountLe50(String regless[])
    { 
      int count=0;
      for(int i=0;i<regless[0].length();i++)
      {
      if((regless[i].charAt(7)=='0'&& regless[i].charAt(8)=='1'&& regless[i].charAt(9)=='0'|| regless[i].charAt(7)=='0'&&  regless[i].charAt(8)=='5'&& regless[i].charAt(9)=='0'))
      
      count++;
      return count;
    }
      return 0;   
     }  
     }  
