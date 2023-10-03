package com.example;

import java.util.List;

public class Cat
{

    Feline predator;

    public Cat(Feline feline)
    {
        this.predator = feline;
    }

    public String getSound()
    {
        return "Мяу";
    }

    public List<String> getFood() throws Exception
    {
        return predator.eatMeat();
    }

}