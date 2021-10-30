package newbanksystem;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class teste {

	@Test
	public void choice() {
		BankManagement choice=new BankManagement();
		choice.mainmenue();
	int result=choice.choicer(-8);
	
	try {
			  if(result<=0||result>8)
			  {
		  fail("invalid choice");
			  }
		}catch(Exception e){ 
		}
	}
	
		  
	
	//	assertEquals(2,result); 
 
	
 
	
	@Test
	public void with() {
		BankManagement choice=new BankManagement();
		choice.mainmenue();
		int r=choice.choicer(4);
		int result=choice.makewithdrawl(23);
		

		assertEquals(2,result); 
		
 
	}
	
	
	
}
