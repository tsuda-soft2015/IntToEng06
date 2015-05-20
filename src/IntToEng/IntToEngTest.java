package IntToEng;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class IntToEngTest {

	@Test
	public void int0を代入したらzeroを返す() {
		String expected = "zero";
		String actual = IntToEng.translateEng(0);
		assertThat(actual, is(expected));
	}

	@Test
	public void int19を代入したらnineteenを返す() {
		String expected = "nineteen";
		String actual = IntToEng.translateEng(19);
		assertThat(actual, is(expected));
	}

	@Test
	public void int20を代入したらtwentyを返す() {
		String expected = "twenty";
		String actual = IntToEng.translateEng(20);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void int21を代入したらtwentyoneを返す() {
		String expected = "twenty one";
		String actual = IntToEng.translateEng(21);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void int100を代入したらhundredを返す() {
		String expected = "one hundred";
		String actual = IntToEng.translateEng(100);
		assertThat(actual, is(expected));
	}

	@Test
	public void int119を代入したらonehundrednineteenを返す() {
		String expected = "one hundred nineteen";
		String actual = IntToEng.translateEng(119);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void int120を代入したらonehundredtwentyを返す() {
		String expected = "one hundred twenty";
		String actual = IntToEng.translateEng(120);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void int151を代入したらonehundredfiftyoneを返す() {
		String expected = "one hundred fifty one";
		String actual = IntToEng.translateEng(151);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void int1000を代入したらonethousandを返す() {
		String expected = "one thousand";
		String actual = IntToEng.translateEng(1000);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void int1019を代入したらonethousandnineteenを返す() {
		String expected = "one thousand nineteen";
		String actual = IntToEng.translateEng(1019);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void int1020を代入したらonethousandtwentyを返す() {
		String expected = "one thousand twenty";
		String actual = IntToEng.translateEng(1020);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void int1100を代入したらonethousandonehundredを返す() {
		String expected = "one thousand one hundred";
		String actual = IntToEng.translateEng(1100);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void int1119を代入したらonethousandonehundrednineteenを返す() {
		String expected = "one thousand one hundred nineteen";
		String actual = IntToEng.translateEng(1119);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void int1120を代入したらonethousandonehundredtwentyを返す() {
		String expected = "one thousand one hundred twenty";
		String actual = IntToEng.translateEng(1120);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void int1121を代入したらonethousandonehundredtwentyoneを返す() {
		String expected = "one thousand one hundred twenty one";
		String actual = IntToEng.translateEng(1121);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void int10000を代入したらtenthousandを返す() {
		String expected = "ten thousand";
		String actual = IntToEng.translateEng(10000);
		assertThat(actual, is(expected));
	}
	@Test
	public void int12456を代入したらtwelvethousandfourhundredfifrysixを返す() {
		String expected = "twelve thousand four hundred fifty six";
		String actual = IntToEng.translateEng(12456);
		assertThat(actual, is(expected));
	}
	@Test
	public void int19000を代入したらtenthousandを返す() {
		String expected = "nineteen thousand";
		String actual = IntToEng.translateEng(19000);
		assertThat(actual, is(expected));
	}
	@Test
	public void int31000を代入したらthirtyonethousandを返す() {
		String expected = "thirty one thousand";
		String actual = IntToEng.translateEng(31000);
		assertThat(actual, is(expected));
	}
	@Test
	public void int51100を代入したらfiftyonethousandonehundredを返す() {
		String expected = "fifty one thousand one hundred";
		String actual = IntToEng.translateEng(51100);
		assertThat(actual, is(expected));
	}
	@Test
	public void int69320を代入したらfiftyonethousandonehundredを返す() {
		String expected = "sixty nine thousand three hundred twenty";
		String actual = IntToEng.translateEng(69320);
		assertThat(actual, is(expected));
	}
	
	@Test
	public void int10201を代入したらfiftyonethousandonehundredを返す() {
		String expected = "ten thousand two hundred one";
		String actual = IntToEng.translateEng(10201);
		assertThat(actual, is(expected));
	}
	@Test
	public void int10001を代入したらfiftyonethousandonehundredを返す() {
		String expected = "ten thousand one";
		String actual = IntToEng.translateEng(10001);
		assertThat(actual, is(expected));
	}
	@Test
	public void int100000を代入したらfiftyonethousandonehundredを返す() {
		String expected = "one hundred thousand";
		String actual = IntToEng.translateEng(100000);
		assertThat(actual, is(expected));
	}
}