package automation;

public class GeniusInXpath {

	public static void main(String[] args) {
		/* Some Good Examples:
		 
				++link: Features
				1. //a[text()='Features']
				2. //a[contains(text(),'Features')] --recommended
		
				++button:
				//button[@type='button' and @class='btn']
				//button[contains(text(),'Sign Up')]
				//div[@class='dropdown']//button[@type='button' and @class='btn btn-secondary dropdown-toggle' and @id='dropdownMenuButton']
				//button[@id='dropdownMenuButton']
		
				++preceding-sibling:
				//a[text()='test2 test2']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input
		
				++parent & preceding-sibling:
		
				//a[text()='test2 test2']//parent::td[@class='datalistrow']//preceding-sibling::td[@class='datalistrow']//input[@name='contact_id']
      */
		
	}

}
