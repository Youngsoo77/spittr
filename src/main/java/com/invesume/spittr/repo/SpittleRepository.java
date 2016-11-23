package com.invesume.spittr.repo;

import java.util.List;

import com.invesume.spittr.domain.Spittle;

public interface SpittleRepository {
	List<Spittle> findSpittles(long max, int count);
}
