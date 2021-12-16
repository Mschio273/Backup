package com.technocorp.team.service.facade;

import com.technocorp.team.service.CoachService;
import com.technocorp.team.service.model.coach.CoachServiceRequest;
import com.technocorp.team.service.model.coach.CoachServiceResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class CoachServiceFacadeImpl implements CoachServiceFacade{

    final CoachService coachService;


    public CoachServiceResponse saveCoach(CoachServiceRequest coach) {
        return coachService.saveCoach(coach);
    }

    public CoachServiceResponse updateCoachById(CoachServiceRequest coach, String id) {
        return coachService.updateCoachById(coach, id);
    }

    public void deleteCoachById(String id) {
        coachService.deleteCoachById(id);
    }

    public List<CoachServiceResponse> findAllCoaches() {
        return coachService.findAllCoaches();
    }

    public CoachServiceResponse findCoachById(String id) {
        return coachService.findCoachById(id);
    }
}
