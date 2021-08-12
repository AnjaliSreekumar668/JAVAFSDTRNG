package com.ust.lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda4 {

	public static void main(String[] args) {
		



List<String> pointList = new ArrayList();

pointList.add("1");
pointList.add("2");
 
pointList.forEach(p ->  { System.out.println(p); } );
}
	
}
interface PointList
{
    public void greet(String welcome);
}
