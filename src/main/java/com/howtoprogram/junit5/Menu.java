package com.howtoprogram.junit5;

import com.howtoprogram.junit5.services.Election;
import com.howtoprogram.junit5.services.IElection;

public class Menu {
	public static void main(String agrs[]) {
		IElection election = new Election();
		String candidateName = election.getCandidateNameByParty("Axity");
		int numOfVotes = election.getNumberOfVotesByParty("Axity");
		
		System.out.println(String.format("Name %s - Votes %d",candidateName,numOfVotes));
	}
}
