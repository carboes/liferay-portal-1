/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
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

package com.liferay.portal.kernel.util;

import java.text.DateFormat;

import java.util.Date;

/**
 * @author Brian Wing Shun Chan
 */
public class ReleaseInfo {

	public static final int RELEASE_5_0_0_BUILD_NUMBER = 5000;

	public static final int RELEASE_5_0_1_BUILD_NUMBER = 5001;

	public static final int RELEASE_5_1_0_BUILD_NUMBER = 5100;

	public static final int RELEASE_5_1_1_BUILD_NUMBER = 5101;

	public static final int RELEASE_5_1_2_BUILD_NUMBER = 5102;

	public static final int RELEASE_5_2_0_BUILD_NUMBER = 5200;

	public static final int RELEASE_5_2_1_BUILD_NUMBER = 5201;

	public static final int RELEASE_5_2_2_BUILD_NUMBER = 5202;

	public static final int RELEASE_5_2_3_BUILD_NUMBER = 5203;

	public static final int RELEASE_6_0_0_BUILD_NUMBER = 6000;

	public static final int RELEASE_6_0_1_BUILD_NUMBER = 6001;

	public static final int RELEASE_6_0_2_BUILD_NUMBER = 6002;

	public static final int RELEASE_6_0_3_BUILD_NUMBER = 6003;

	public static final int RELEASE_6_0_4_BUILD_NUMBER = 6004;

	public static final int RELEASE_6_0_5_BUILD_NUMBER = 6005;

	public static final int RELEASE_6_0_6_BUILD_NUMBER = 6006;

	public static final int RELEASE_6_1_0_BUILD_NUMBER = 6100;

	public static final int RELEASE_6_2_0_BUILD_NUMBER = 6200;

	public static final Date getBuildDate() {
		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);

		return GetterUtil.getDate(_DATE, df);
	}

	public static final int getBuildNumber() {
		return _BUILD_NUMBER;
	}

	public static final String getCodeName() {
		return _CODE_NAME;
	}

	public static final String getName() {
		return _NAME;
	}

	public static final String getReleaseInfo() {
		return _RELEASE_INFO;
	}

	public static final String getServerInfo() {
		return _SERVER_INFO;
	}

	public static String getVendor() {
		return _VENDOR;
	}

	public static final String getVersion() {
		return _VERSION;
	}

	private static final String _BUILD = "6200";

	private static final int _BUILD_NUMBER = Integer.parseInt(_BUILD);

	private static final String _CODE_NAME = "Newton";

	private static final String _DATE = "January 18, 2012";

	private static final String _NAME = "Liferay Portal Community Edition";

	private static final String _RELEASE_INFO =
		ReleaseInfo._RELEASE_INFO_PREFIX + _NAME + " " +
			ReleaseInfo._VERSION_DISPLAY_NAME + " (" + _CODE_NAME +
				" / Build " + _BUILD + " / " + _DATE + ")" +
					ReleaseInfo._RELEASE_INFO_SUFFIX;

	private static final String _RELEASE_INFO_PREFIX = System.getProperty(
		"liferay.release.info.prefix" , StringPool.BLANK);

	private static final String _RELEASE_INFO_SUFFIX = System.getProperty(
		"liferay.release.info.suffix" , StringPool.BLANK);

	private static String _SERVER_INFO = _NAME + " / " + ReleaseInfo._VERSION;

	private static String _VENDOR = "Liferay, Inc.";

	private static String _VERSION = "6.2.0";

	private static String _VERSION_DISPLAY_NAME = "6.2.0 CE";

}