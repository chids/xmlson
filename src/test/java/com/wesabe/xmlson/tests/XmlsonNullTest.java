package com.wesabe.xmlson.tests;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

import com.wesabe.xmlson.XmlsonNull;

@RunWith(Enclosed.class)
public class XmlsonNullTest {
	public static class An_Xmlson_Null {
		@Test
		public void itHasANullValue() throws Exception {
			assertThat(XmlsonNull.INSTANCE.getValue(), is(nullValue()));
		}
		
		@Test
		public void itDoesNotEqualNull() throws Exception {
			assertThat(XmlsonNull.INSTANCE.equals(null), is(false));
		}
		
		@Test
		public void itDoesNotEqualANonNull() throws Exception {
			assertThat(XmlsonNull.INSTANCE.equals("woo"), is(false));
		}
		
		@Test
		public void itIsHumanReadable() throws Exception {
			assertThat(XmlsonNull.INSTANCE.toString(), is("null"));
		}
	}
}
