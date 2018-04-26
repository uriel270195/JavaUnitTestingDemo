package com.howtoprogram.junit5.services;

public class Election implements IElection{

	@Override
	public String getCandidateNameByParty(String party) {
		// TODO Auto-generated method stub
		if(party.equals("Axity")) {
			return "Urbano";
		}
		return "Elmer Homero";
	}

	@Override
	public int getNumberOfVotesByParty(String party) {
		if(party.equals("Axity")) {
			return 100;
		}
		return 50;
	}

}
