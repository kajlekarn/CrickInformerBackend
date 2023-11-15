package com.crick.apis.services;

import java.util.List;
import java.util.Map;

import com.crick.apis.models.Match;

public interface MatchServices {
	// get all matches
	List<Match> getAllMatches();
	
	// get live matches
	List<Match> getLiveMatches(); 
	
	// get CWC2023 point table
	List<Map<String, String>> getPointTable();
}
