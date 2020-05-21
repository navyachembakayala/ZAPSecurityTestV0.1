package com.attra.test.scan;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.ZAP_Selenium.ZapSecurityTest;
import com.ZAP_Selenium.ZapSecurityTestDefectDojo;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	ZapSecurityTest.class,
	ZapSecurityTestDefectDojo.class 			
})	

public class AllTestCases {
	
	

}
