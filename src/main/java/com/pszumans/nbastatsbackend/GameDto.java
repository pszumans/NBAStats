package com.pszumans.nbastatsbackend;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY )
public class GameDto {
    @JsonIgnore
    private GameDate gameDate;
    private String gameId;
    private String gameTime;
    private boolean isOnline;
    private String clock;
    private int quarter;
    private TeamStatsDto home;
    private TeamStatsDto away;

    public GameDto(Game game) {
        this.gameDate = game.getGameDate();
        this.gameId = game.getGameId();
        this.gameTime = game.getGameTime();
        this.isOnline = game.isOnline();
        this.clock = game.getClock();
        this.quarter = game.getQuarter();
        this.home = new TeamStatsDto(game.getHome());
        this.away = new TeamStatsDto(game.getAway());
    }
}
