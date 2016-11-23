package com.invesume.spittr;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.invesume.spittr.domain.Spittle;

public class SpittleControllerTest {

	@Test
	public void shouldShowRecentSpittles() throws Exception {
		List<Spittle> expectedSpittles = createSpittleList(20);
	}
	
	private List<Spittle> createSpittleList(int count){
		List<Spittle> spittles = new ArrayList<Spittle>();
		for(int i=0;i<count;i++){
			spittles.add(new Spittle("Spittles "+i,new Date()));
		}
		return spittles;
	}
}
