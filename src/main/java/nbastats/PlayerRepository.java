package nbastats;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    Player findById(Long id);
    List<Player> findByTeamId(Long teamId);
}