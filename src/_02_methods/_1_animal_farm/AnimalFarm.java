//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _02_methods._1_animal_farm;

import java.applet.AudioClip;

//Copyright (c) The League of Amazing Programmers 2013-2017

//Level 0

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class AnimalFarm {
	
	public static void main(String[] args) {
			
		/* 1. Ask the user which animal they want, then play the sound of that animal. */			 
	String animal =		JOptionPane.showInputDialog("what animal do you want");
		/* 2. Make it so that the user can keep entering new animals. */
            if(animal == "cow")  {
            	playMoo();
            }
	 
            if(animal.equals ("duck")  ) {
            	playQuack();
            }
	
	        if(animal == "dog")    {
	        	playWoof();
	        }
	        
	        if(animal.equals ("cat")) {
	        	playMeow();
	        }
	        
	        if(animal.equals ("llama")) {
	        	playLlama();
	        }
	        
	        
	        
	        
	        
	        
	        
	        
}
	static void playMoo() {
		playNoise(mooFile);
		JOptionPane.showMessageDialog(null, "moo");
	}

	static void playQuack() {
		playNoise(quackFile);
		JOptionPane.showMessageDialog(null, "quack");
	}

	static void playWoof() {
		playNoise(woofFile);
		JOptionPane.showMessageDialog(null, "woof");
	}
	
	static void playMeow() {
		playNoise(meowFile);
		JOptionPane.showMessageDialog(null, "meow");
	}
	
	static void playLlama() {
		playNoise(llamaFile);
		JOptionPane.showMessageDialog(null, "llama");
	}

	static String quackFile = "quack.wav";
	static String mooFile = "moo.wav";
	static String woofFile = "woof.wav";
	static String meowFile = "meow.wav";
	static String llamaFile = "llama.wav";

	/* Ignore this stuff */
	
	public static void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(AnimalFarm.class.getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}