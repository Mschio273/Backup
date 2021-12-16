package com.technocorp.team.mappers.service;

import com.technocorp.team.entity.Team;
import com.technocorp.team.service.model.team.TeamServiceRequest;
import com.technocorp.team.service.model.team.TeamServiceResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TeamMapperService {

    static Team toTeamEntity(TeamServiceRequest teamServiceRequest){
        return Mappers.getMapper(TeamMapperService.class)
                .mapper(teamServiceRequest);
    }

    static TeamServiceResponse toTeamResponseService(Team team) {
        return Mappers.getMapper(TeamMapperService.class)
                .mapper(team);
    }

    Team mapper(TeamServiceRequest teamServiceRequest);

    TeamServiceResponse mapper(Team team);

}
