package com.technocorp.team.service.facade;

import com.technocorp.team.service.model.coach.CoachServiceRequest;
import com.technocorp.team.service.model.coach.CoachServiceResponse;

import java.util.List;

public interface CoachServiceFacade {

    CoachServiceResponse saveCoach(CoachServiceRequest coach);

    CoachServiceResponse updateCoachById(CoachServiceRequest coach, String id);

    void deleteCoachById(String id);

    List<CoachServiceResponse> findAllCoaches();

    CoachServiceResponse findCoachById(String id);
}
