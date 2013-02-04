package com.composite.pattern;

import java.util.List;

import com.main.Log;

public class TestComposite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Family parent = new Multiple();
		parent.setName("MREMA");
		Family mama = new Multiple();
		mama.setName("MAMA");
		Family joyce = new Multiple();
		joyce.setName("JOYCE");
		Family fred = new Single();
		fred.setName("FRED");
		Family janet = new Single();
		janet.setName("JANET");
		Family joe = new Single();
		joe.setName("JOE");
		Family steve = new Single();
		steve.setName("STEVE");
		Family juma = new Single();
		juma.setName("JUMA");
		Family asha = new Single();
		asha.setName("ASHA");
		
		//Parent
		parent.add(mama);
		parent.add(joyce);
		parent.add(fred);
		
		//Mama
		mama.add(joe);
		mama.add(steve);
		mama.add(janet);
		
		//Joyce
		joyce.add(juma);
		joyce.add(asha);
		
		getFamilyTree(parent.getChildren());
		
	}

	private static void getFamilyTree(List<Family> fam) {
		for(Family fm: fam) {
			Log.o(fm.getName());
			getFamilyTree(fm.getChildren());
		}
	}

}
