package com.priyo.Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import com.priyo.beans.SampleBean;

public class TestAdd {

	@Test
	public void testAdd() {
		SampleBean sb=new SampleBean();
		sb.add(100,100);
		assertEquals(200, sb.add(100,100));
	}

}
