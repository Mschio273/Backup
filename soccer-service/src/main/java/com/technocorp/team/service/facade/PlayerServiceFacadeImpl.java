package com.technocorp.team.service.facade;

import com.technocorp.team.service.PlayerService;
import com.technocorp.team.service.model.player.PlayerServiceRequest;
import com.technocorp.team.service.model.player.PlayerServiceResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class PlayerServiceFacadeImpl implements PlayerServiceFacade {

    final PlayerService playerService;

    public PlayerServiceResponse savePlayer(PlayerServiceRequest player) {
        return playerService.savePlayer(player);
    }

    public PlayerServiceResponse updatePlayerById(PlayerServiceRequest player, String id) {
        return playerService.updatePlayerById(player, id);
    }

    public void deletePlayerById(String id) {
        playerService.deletePlayerById(id);
    }

    public List<PlayerServiceResponse> findAllPlayers() {
        return playerService.findAllPlayers();
    }

    public PlayerServiceResponse findPlayerById(String id) {
        return playerService.findPlayerById(id);
    }
}
