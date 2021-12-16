package com.technocorp.team.mappers.service;

import com.technocorp.team.entity.Coach;
import com.technocorp.team.service.model.coach.CoachServiceRequest;
import com.technocorp.team.service.model.coach.CoachServiceResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CoachMapperService {

    static Coach toCoachEntity(CoachServiceRequest coachServiceRequest){
        return Mappers.getMapper(CoachMapperService.class).mapper(coachServiceRequest);
    }

    static CoachServiceResponse toCoachResponseService(Coach coach) {
        return Mappers.getMapper(CoachMapperService.class)
                .mapper(coach);
    }

    Coach mapper(CoachServiceRequest coachServiceRequest);

    CoachServiceResponse mapper(Coach coach);
}
