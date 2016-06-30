package com.pcn.interview;

import org.junit.Test;

public class IsPointsMakeSquare {
	
	@Test
	public void isSquare() {
		
		boolean found = false;
		int[] a = {20,20,20,10,10,20,10,10};
			//{20,20,20,10,10,20,10,10};
			//{10,10,10,10,20,10,20,30};
		
		int x1=a[0], y1=a[1], x2=a[2], y2=a[3], x3=a[4], y3=a[5], x4=a[6], y4=a[7];
		

		if(x1==x2 && x3==x4 && y1==y3 && y2==y4)
			if((y1-y2 == y3-y4) && (x1-x3 == x2-x4)){
				System.out.println("square");
				found = true;
			}
		
		if(!found)
			System.out.println("not a sqaure");
		
		
		
	}

}
