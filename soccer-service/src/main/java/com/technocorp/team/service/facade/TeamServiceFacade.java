package com.technocorp.team.service.facade;

import com.technocorp.team.service.model.team.TeamServiceRequest;
import com.technocorp.team.service.model.team.TeamServiceResponse;

import java.util.List;

public interface TeamServiceFacade {

    TeamServiceResponse saveTeam(TeamServiceRequest team);

    TeamServiceResponse updateTeamById(TeamServiceRequest team, String id);

    void deleteTeamById(String id);

    List<TeamServiceResponse> findAllTeams();

    TeamServiceResponse findTeamById(String id);
}
