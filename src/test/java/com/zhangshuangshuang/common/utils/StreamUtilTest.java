package com.zhangshuangshuang.common.utils;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testCloseAll() {
		
	}

	@Test
	public void testReadTextFileInputStream() throws FileNotFoundException, Exception {
		String string = StreamUtil.readTextFile(new FileInputStream("e:/1.txt"));
		System.out.println(string);
	}

	@Test
	public void testReadTextFileFile() {
		fail("Not yet implemented");
	}

}
