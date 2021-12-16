package com.technocorp.team.service.facade;

import com.technocorp.team.service.TeamService;
import com.technocorp.team.service.model.team.TeamServiceRequest;
import com.technocorp.team.service.model.team.TeamServiceResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class TeamServicefacadeImpl implements TeamServiceFacade {

    final TeamService teamService;

    public TeamServiceResponse saveTeam(TeamServiceRequest team) {
        return teamService.saveTeam(team);
    }

    public TeamServiceResponse updateTeamById(TeamServiceRequest team, String id) {
        return teamService.updateTeamById(team, id);
    }

    public void deleteTeamById(String id) {
        teamService.deleteTeamById(id);
    }

    public List<TeamServiceResponse> findAllTeams() {
        return teamService.findAllTeams();
    }

    public TeamServiceResponse findTeamById(String id) {
        return teamService.findTeamById(id);
    }
}
