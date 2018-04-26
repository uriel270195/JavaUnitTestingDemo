package com.howtoprogram.junit5.Services;

import com.howtoprogram.junit5.services.IElection;

public class ElectionMock implements IElection{

	@Override
	public String getCandidateNameByParty(String party) {
		// TODO Auto-generated method stub
		return "Prueba";
	}

	@Override
	public int getNumberOfVotesByParty(String party) {
		// TODO Auto-generated method stub
		return 100;
	}

}
