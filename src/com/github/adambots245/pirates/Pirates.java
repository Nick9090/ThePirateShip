package com.github.adambots245.pirates;

public class Pirates{

  private static String[] piratePhrases = {"arg", "Ahoy!", "LandHo!","No SOPA!","I got me wood","Winston was a bust","Andy McClutchen"};

  public static String getRandomPiratePhrase(){
    int maxIndex = piratePhrases.length;

    return piratePhrases[(int) (Math.random() * maxIndex)];
  }
}
