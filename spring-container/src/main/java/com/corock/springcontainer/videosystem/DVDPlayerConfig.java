package com.corock.springcontainer.videosystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DVDPlayerConfig {

	@Bean
	public Avengers avengers() {
		return new Avengers();
	}
	
//	@Bean
	public DVDPlayer dvdPlayer() {
		return new DVDPlayer( avengers() );
	}
	
//	@Bean
//	public DVDPlayer dvdPlayer( DigitalVideoDisc dvd ) {
//		return new DVDPlayer( dvd );
//	}

	@Bean
	public DVDPlayer dvdPlayer( DigitalVideoDisc dvd ) {
		DVDPlayer dvdPlayer = new DVDPlayer();
		dvdPlayer.setDigitalVideoDisc( dvd );
		return dvdPlayer;
	}

//	@Bean( name = "dvdPlayer1" )
//	public DVDPlayer dvdPlayer() {
//		return new DVDPlayer( avengers() );
//	}
//
//	@Bean( name = "dvdPlayer2" )
//	public DVDPlayer anthoerDVDPlayer() {
//		return new DVDPlayer( avengers() );
//	}
	
}
