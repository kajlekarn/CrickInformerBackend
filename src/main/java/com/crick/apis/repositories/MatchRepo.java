package com.crick.apis.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crick.apis.models.Match;

public interface MatchRepo extends JpaRepository<Match, Long> {
	Optional<Match> findByTeamHeading(String teamHeading);
}
