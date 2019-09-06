package com.zhangshuangshuang.common.utils;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

public class FileUtilTest {

	@Test
	public void testGetExtendName() {
		String str = "test.doc.jsp";
		String extendName = FileUtil.getExtendName(str);
		System.out.println(extendName);
	}

	@Test
	public void testGetTempDirectory() {
		File tempDirectory = FileUtil.getTempDirectory();
		System.out.println(tempDirectory);
	}

	@Test
	public void testGetUserDirectory() {
		File tempDirectory = FileUtil.getUserDirectory();
		System.out.println(tempDirectory);
	}

}
