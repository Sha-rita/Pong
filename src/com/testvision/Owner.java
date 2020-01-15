package com.testvision;

import com.testvision.animal.Dog;

public class Owner {
    //De owner heeft een huisdier. Het huisdier is een dog. //
    public Dog pet;
    //Maak een constructor die een dog als parameter meekrijgt en die daarmee de member variable initialiseert//
    public Owner(Dog aPet){
        pet = aPet;
    }
}
