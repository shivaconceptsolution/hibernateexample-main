package com.scs.MyFirstProject;

import java.util.Map;
import java.util.Set;

public class StudentMap {
	private String name;
	Map mp;
	StudentMap()
	{
		
	}
	StudentMap(String name,Map mp)
	{
		this.name=name;
		this.mp=mp;	
	}
	public void showMapData()
	{
		System.out.println("Name is "+name);
		System.out.println("Data of Map is");
		Set<Map.Entry<String,String>> se = mp.entrySet();
		for(Map.Entry<String,String> s : se)
		{
			System.out.println(s.getKey() + " "+s.getValue());
		}
	}
}
