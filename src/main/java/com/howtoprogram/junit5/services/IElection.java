package com.howtoprogram.junit5.services;

public interface IElection {
	String getCandidateNameByParty(String party);
	
	int getNumberOfVotesByParty(String party);
}
