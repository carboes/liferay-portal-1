/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portalweb.portal.dbupgrade.sampledata528.social.request;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class AddUserSRq2Test extends BaseTestCase {
	public void testAddUserSRq2() throws Exception {
		selenium.selectWindow("null");
		selenium.selectFrame("relative=top");
		selenium.open("/web/guest/home/");
		assertTrue(selenium.isPartialText("//h2[@class='user-greeting']/span",
				"Welcome"));
		selenium.mouseOver("//h2[@class='user-greeting']/span");
		selenium.clickAt("//h2[@class='user-greeting']/span",
			RuntimeVariables.replace("Welcome"));
		selenium.waitForVisible("link=Control Panel");
		selenium.clickAt("link=Control Panel",
			RuntimeVariables.replace("Control Panel"));
		selenium.waitForPageToLoad("30000");
		selenium.clickAt("link=Users", RuntimeVariables.replace("Users"));
		selenium.waitForPageToLoad("30000");
		selenium.clickAt("link=Add", RuntimeVariables.replace("Add"));
		selenium.waitForPageToLoad("30000");
		selenium.type("//input[@id='_125_screenName']",
			RuntimeVariables.replace("socialrequestsn2"));
		selenium.type("//input[@id='_125_emailAddress']",
			RuntimeVariables.replace("socialrequestea2@liferay.com"));
		selenium.type("//input[@id='_125_firstName']",
			RuntimeVariables.replace("socialrequestfn2"));
		selenium.type("//input[@id='_125_middleName']",
			RuntimeVariables.replace("socialrequestmn2"));
		selenium.type("//input[@id='_125_lastName']",
			RuntimeVariables.replace("socialrequestln2"));
		selenium.clickAt("//input[@value='Save']",
			RuntimeVariables.replace("Save"));
		selenium.waitForPageToLoad("30000");
		assertEquals(RuntimeVariables.replace(
				"Your request processed successfully."),
			selenium.getText("//div[@class='portlet-msg-success']"));
		assertEquals("socialrequestsn2",
			selenium.getValue("//input[@id='_125_screenName']"));
		assertEquals("socialrequestea2@liferay.com",
			selenium.getValue("//input[@id='_125_emailAddress']"));
		assertEquals("socialrequestfn2",
			selenium.getValue("//input[@id='_125_firstName']"));
		assertEquals("socialrequestmn2",
			selenium.getValue("//input[@id='_125_middleName']"));
		assertEquals("socialrequestln2",
			selenium.getValue("//input[@id='_125_lastName']"));
	}
}