package config;

public class Constants {
	//This is the list of System Variables
    //Declared as 'public', so that it can be used in other classes of this project
    //Declared as 'static', so that we do not need to instantiate a class object
    //Declared as 'final', so that the value of this variable can be changed
    // 'String' & 'int' are the data type for storing a type of value	
	
	public static final String URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
	public static final String URL1 = "http://www.phptravels.net/admin";
	public static final String Path_TestData = "C://Ravikanth//Selenium Automation//Selenium_Training//KeywordDriven//src//test//java//dataEngine//DataEngine.xlsx";
	public static final String Path_TestData1 = "C://Ravikanth//Selenium Automation//Selenium_Training//KeywordDriven//src//test//java//dataEngine//DataEngine1.xlsx";
	public static final String Path_OR = "C:/Ravikanth/Selenium Automation/Selenium_Training/KeywordDriven/src/test/java/config/OR";
	public static final String File_TestData = "DataEngine.xlsx";
	public static final String File_TestData1 = "DataEngine1.xlsx";
	
	//List of Data Sheet Column Numbers
	public static final int Col_TestCaseID = 0;	
	public static final int Col_TestScenarioID =1 ;
	//This is the new column for 'Page Object'
	public static final int Col_PageObject =3 ;
	//This column is shifted from 3 to 4
	public static final int Col_ActionKeyword =4;
	//New entry in Constant variable
	public static final int Col_RunMode =2 ;
	
	//New entry for results column from both the sheets
	public static final int Col_Result =3 ;
	public static final int Col_DataSet =5 ;
	public static final int Col_TestStepResult =6 ;

	//List of Data Engine Excel sheets
	public static final String Sheet_TestSteps = "Test Steps";
	//New entry in Constant variable
	public static final String Sheet_TestCases = "Test Cases";
	
	//Create two new Constants variables for the Pass results & Fail result
	public static final String KEYWORD_FAIL = "FAIL";
	public static final String KEYWORD_PASS = "PASS";
	
	// List of Test Data
		public static final String UserName = "ravikaanthe@rediffmail.com";
		public static final String Password = "test@123";
		
		public static final String UserName1 = "user@phptravels.com";
		public static final String Password1 = "demouser";
			
}