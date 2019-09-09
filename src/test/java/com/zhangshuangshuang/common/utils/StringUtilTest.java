package com.zhangshuangshuang.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		
	}

	@Test
	public void testHasText() {
		
	}

	@Test
	public void testRandomChineseStringInt() {
		String string = StringUtil.randomChineseString(1000);
		System.out.println(string);
	}

	@Test
	public void testRandomChineseString() {
		fail("Not yet implemented");
	}

	@Test
	public void testGenerateChineseName() {
		fail("Not yet implemented");
	}
	// 方法5：正则验证手机号
	@Test
	public  void isPhoneNumber() {
		boolean phoneNumber = StringUtil.isPhoneNumber("17610735371");
		System.out.println(phoneNumber);
		
	}
	// 方法6：正则验证邮箱
	@Test
	public static void isEmail() {
		String email;
	}
//	方法7：传来的字符转成 html 文本，遇到“\n”符时，要用<p></p>将这一段字符包起来
	@Test
	public  void toHtml(){
		String text = "123456789\r";
		String html = StringUtil.toHtml(text);
		System.out.println(html);
	}

}
