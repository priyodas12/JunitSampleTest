package com.priyo.Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import com.priyo.beans.SampleBean;

public class TestConcatString {

	@Test
	public void testConcatString() {
		SampleBean sb2=new SampleBean();
		
		assertEquals("abcbca", sb2.concatString("abc", "bca"));
		
	}

}
