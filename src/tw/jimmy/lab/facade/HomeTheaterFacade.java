/**
 * Project Name:FacadeLab
 * File Name:HomeTheaterFacade.java
 * Package Name:tw.com.studio.jimmy.lab
 * Date:2015年8月18日下午5:46:32
 * Copyright (c) 2015, jim@sinopac.com All Rights Reserved.
 */

package tw.jimmy.lab.facade;

/**
 * ClassName:HomeTheaterFacade Function: TODO ADD FUNCTION. Reason: TODO ADD
 * REASON. Date: 2015年8月18日 下午5:46:32
 * 
 * @author Jimmy
 * @version
 * @since JDK 1.7
 * @see
 */
public class HomeTheaterFacade {
	Amplifier amp;
	Tuner tuner;
	DvdPlayer dvd;
	CdPlayer cd;
	Projector projector;
	TheaterLights lights;
	Screen screen;
	PopcornPopper popper;
	public HomeTheaterFacade(){
		this.amp = new Amplifier();
		this.tuner = new Tuner();
		this.dvd = new DvdPlayer();
		this.cd = new CdPlayer();
		this.projector = new Projector();
		this.screen = new Screen();
		this.lights = new TheaterLights();
		this.popper = new PopcornPopper();
	}

	public HomeTheaterFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd,
			CdPlayer cd, Projector projector, Screen screen,
			TheaterLights lights, PopcornPopper popper) {
		this.amp = amp;
		this.tuner = tuner;
		this.dvd = dvd;
		this.cd = cd;
		this.projector = projector;
		this.screen = screen;
		this.lights = lights;
		this.popper = popper;
	}
	
	public void watchMovie(String movie){
		System.out.println("Get ready to watch a movie...");
		popper.on();
		popper.pop();
		lights.dim(10);
		screen.down();
		projector.on();
		projector.wideScreenMode();
		amp.on();
		amp.setDvd(dvd);
		amp.setSurroundSound();
		amp.setVolume(5);
		dvd.on();
		dvd.play(movie);
	}
	
	public void endMovie(){
		System.out.println("Shutting movie theater down...");
		popper.off();
		lights.on();
		screen.up();
		projector.off();
		amp.off();
		dvd.stop();
		dvd.eject();
		dvd.off();
	}
}
