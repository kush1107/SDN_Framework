package com.qa.testcases.masterpages.subpages_5;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.masterpages.subpages_5.FormatPage;
import com.qa.utils.TestUtil;

public class FormatPageTest extends TestBase {

	FormatPage formatpage;
	
	
	
	
	public FormatPageTest()	
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initialization();
		formatpage = new FormatPage();
		TestUtil.ValidateUserLogin();
	}
	
//	@AfterClass
//	public void teardown()
//	{
//		driver.quit();
//	}
	
	@Test(priority=1)
	public void Verify_Navigation_to_menupage()   // To check navigation to sub menu
	{	
		formatpage.Navigate_sub_menu();
	}
	
	@Test(priority=2)
	public void Verify_Clicking_on_record_btn()   // To check click on Record button
	{	 
		formatpage.Click_on_Record();
	}
	
	@Test(priority=3)
	public void Verify_Record_Add()   // To check by adding record & verifying it is created or not.
	{	
		formatpage.add_data_record();
	}
	
	@Test(priority=4)
	public void Verify_Record_Already_exists()
	{	
		formatpage.Record_already_exists();  //To check record is already exists.
	}
	
	@Test(priority=5)
	public void Verify_Validation_with_no_data()
	{	
		formatpage.validation_msg();  //To check by validation msg on add record without data
	}
	
	@Test(priority=6)
	public void Verify_Record_Edited()
	{	
		formatpage.edit_functionality(); //To check edit record 
	}
	
	@Test(priority=7)
	public void Verify_Record_ToggleStatus()
	{	
		formatpage.toggle_status();  //To check toggle status
	}
	
	@Test(priority=8)
	public void Verify_No_Record_found()
	{	
		formatpage.random_search();  //To check by entering random text & verify no result found.
	}
	
	@Test(priority=9)
	public void Verify_Pagination()
	{	
		formatpage.pagination();  //To check pagination.
	}
	
	
	
	
}
