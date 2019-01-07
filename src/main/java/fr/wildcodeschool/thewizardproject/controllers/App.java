package fr.wildcodeschool.thewizardproject.controllers;

import thewizardproject.models.Dumbledore;

public class App {
	
	public void start() {
        Dumbledore myFriend = new Dumbledore();
        System.out.println("");
        System.out.println("******************");
        System.out.println(myFriend.readExtract());
        System.out.println("******************");
    }

}
