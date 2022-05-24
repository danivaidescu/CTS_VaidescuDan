package tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import classes.ETypeMarket;
import classes.Market;
import classes.SuperMarket;
import exceptions.ExceptionMarket;

import java.util.ArrayList;
import java.util.Comparator;
public class TestCaseSuperMarketGetBiggestMarket {
	
	static Market m1;
	static Market m2;
	static Market m3;
	static Market m4;
	static Market m5;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Setup Before Class");
		m1 = new Market("SEPHORA", 20, ETypeMarket.BEAUTY);
		m2 = new Market("DOUGLAS", 29, ETypeMarket.BEAUTY);
		m3 = new Market("H&M", 40, ETypeMarket.CLOTHES);
		m4 = new Market("MOBEXPERT", 100, ETypeMarket.DECORATION);
		m5 = new Market("ZARA", 20, ETypeMarket.CLOTHES);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Tear Down After Class");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("SetUP");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Tear Down");
		
	}

//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void testRight() {
		System.out.println("Test Right");
		ArrayList<Market> listMarket = new ArrayList<Market>();
		listMarket.add(m1);
		listMarket.add(m2);
		listMarket.add(m3);
		listMarket.add(m4);
		listMarket.add(m5);
		
		SuperMarket sm = new SuperMarket("Electroputere", listMarket);
		try {
			String result = sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);
			
//			if(result.equals("DOUGLAS")) {
//				assertTrue(true);
//			} else {
//				assertTrue(false);
//			}
			
			assertEquals("DOUGLAS", result);
			
		} catch (ExceptionMarket e) {
			e.printStackTrace();
		}	
	}
	
	@Test
	public void testBoundaries() {
		System.out.println("Test Boundary");
		ArrayList<Market> listMarket = new ArrayList<Market>();
		listMarket.add(m1);
		
		SuperMarket sm = new SuperMarket("Electroputere", listMarket);
		try {
			String result = sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);
			assertEquals("SEPHORA", result);
		} catch (ExceptionMarket e) {
			
			e.printStackTrace();
			fail("Sunt la limitele intervalului, nu trebuie exceptie");
		}
	}
	
	@Test(expected = ExceptionMarket.class)
	public void testException() throws ExceptionMarket {
		System.out.println("Test Exception");
		ArrayList<Market> listMarket = new ArrayList<Market>();
		SuperMarket sm = new SuperMarket("Electroputere", listMarket);
		
		String result = sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);
		
	}
	
	@Test
	public void testPerformance() throws ExceptionMarket {
		// NOT NOW Start time!!!!
		System.out.println("Test Performance");
		ArrayList<Market> listMarket = new ArrayList<Market>();
		listMarket.add(m1);
		listMarket.add(m2);
		listMarket.add(m3);
		listMarket.add(m4);
		listMarket.add(m5);
		
		SuperMarket sm = new SuperMarket("Electroputere", listMarket);
		
		double startTime = System.currentTimeMillis();
		String result = sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);
		
		double stopTime = System.currentTimeMillis();
		//assertEquals("Testul ruleaza in mai putin de 0.5 ms" ,0.5 , stopTime - startTime);
		assertTrue("Testul ruleaza sub 10 ms", stopTime - startTime <= 10);
	}
	
	public Market getLargestMarket(ETypeMarket type, ArrayList<Market> listM) {
		listM.sort(new Comparator<Market>() {

			@Override
			public int compare(Market o1, Market o2) {
				if(o1.getArea() >= o2.getArea())
					return 1;
				else return -1;
			}
		
		});
		
		for(int i = 0; i < listM.size(); i++) {
			if(type == listM.get(i).getType()) {
				return listM.get(i);
			} else 
				return null;
		}
		return null;
	}
	
	@Test
	public void testCrossCheck() throws ExceptionMarket {
		
		ArrayList<Market> listMarket = new ArrayList<Market>();
		listMarket.add(m1);
		listMarket.add(m2);
		listMarket.add(m3);
		listMarket.add(m4);
		listMarket.add(m5);
		
		SuperMarket sm = new SuperMarket("Electroputere", listMarket);
		
		String actual = sm.getBiggestMarketByArea(ETypeMarket.BEAUTY);
		Market expectedM = getLargestMarket(ETypeMarket.BEAUTY, listMarket);
		String expected = expectedM.getName();
		assertEquals("Comparare Cross-Check", expected, actual );
		
		
	}
	
	@Test
	public void testInverse() {
		int maxArea = -1;
		int pos = -1;
		
//		for(1, n) {
//			if(result == list[i].getName()) {
//				if(max <= list[i].getArea()) {
//					max = getArea();
//					pos = i;
//				}
//			}
//		}
//		if(pos>0 < list.size) {
//			
//		}
	}

}
