package com.howtoprogram.junit5;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import com.howtoprogram.junit5.Services.ElectionMock;
import com.howtoprogram.junit5.services.Election;
import com.howtoprogram.junit5.services.IElection;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MenuTest {
	@Test
	void getNameByPartyTest() {
		IElection election = new ElectionMock();
		String candidateName = election.getCandidateNameByParty("Axity");
		int numOfVotes = election.getNumberOfVotesByParty("Axity");
		assertEquals("Prueba",candidateName);
		assertEquals(100,numOfVotes);
	}
	
	@Test
	void getNameByPartyTestMockito() {
		Election election = mock(Election.class);
		
		when(election.getCandidateNameByParty("Otra cosa")).thenReturn("Arturo");
		when(election.getNumberOfVotesByParty("")).thenReturn(0);
		
		String candidateName = election.getCandidateNameByParty("Otra cosa");
		int numOfVotes = election.getNumberOfVotesByParty("");
		assertEquals("Arturo",candidateName);
		assertEquals(0,numOfVotes);
	}
}
