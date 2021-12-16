package com.technocorp.team.service.facade;

import com.technocorp.team.service.model.player.PlayerServiceRequest;
import com.technocorp.team.service.model.player.PlayerServiceResponse;

import java.util.List;

public interface PlayerServiceFacade {

    PlayerServiceResponse savePlayer(PlayerServiceRequest player);

    PlayerServiceResponse updatePlayerById(PlayerServiceRequest player, String id);

    void deletePlayerById(String id);

    List<PlayerServiceResponse> findAllPlayers();

    PlayerServiceResponse findPlayerById(String id);
}
