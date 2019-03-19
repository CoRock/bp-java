package com.corock.springcontainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.corock.springcontainer.soundsystem.CDPlayer;
import com.corock.springcontainer.soundsystem.CompactDisc;
import com.corock.springcontainer.videosystem.Avengers;
import com.corock.springcontainer.videosystem.DVDPlayer;
import com.corock.springcontainer.videosystem.DigitalVideoDisc;

public class XMLConfigTest {

	public static void main(String[] args) {
//		testXMLConfig01();
		testXMLConfig02();
	}
	
	/**
	 * XML Config 01
	 * Annotation config
	 */
	public static void testXMLConfig01() {
		ApplicationContext appCtx =
				new ClassPathXmlApplicationContext( "config/soundsystem/CDPlayerConfig.xml" );
	
		CompactDisc cd = appCtx.getBean( CompactDisc.class );
		System.out.println( cd );
		
		CDPlayer cdPlayer = appCtx.getBean( CDPlayer.class );
		cdPlayer.play();
		
		( (ConfigurableApplicationContext) appCtx ).close();
	}
	
	/**
	 * XML Config 02
	 * Bean config
	 */
	public static void testXMLConfig02() {
		ApplicationContext appCtx =
				new ClassPathXmlApplicationContext( "config/videosystem/DVDPlayerConfig.xml" );

		DigitalVideoDisc dvd = appCtx.getBean( Avengers.class );
		System.out.println( dvd );
		
		dvd = (DigitalVideoDisc) appCtx.getBean( "digitalVideoDisc" );
		System.out.println( dvd );
		
		DVDPlayer dvdPlayer = appCtx.getBean( DVDPlayer.class );
		dvdPlayer.play();
		
		( (ConfigurableApplicationContext) appCtx ).close();
	}

}
