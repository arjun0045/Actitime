package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ProjectModule {
	
	@Test
	public void createProject()
	{
		Reporter.log("CreateProject",true);
	}
	@Test
	public void modifyProject()
	{
		Reporter.log("ModifyProject",true);
	}
	@Test
	public void deleteProject()
	{
		Reporter.log("DeleteProject",true);
	}

}
