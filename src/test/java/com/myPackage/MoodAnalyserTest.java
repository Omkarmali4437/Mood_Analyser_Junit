package com.myPackage;

import org.junit.Assert;

import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessageReturnSad() {
        String message="I am sad";
        MoodAnalyser mood=new MoodAnalyser(message);
        String message1= mood.analyseMood();
        Assert.assertEquals("Sad",message1);
    }

    @Test
    public void giveMessageReturnHappy() {
        String message="I am in any mood";
        MoodAnalyser mood=new MoodAnalyser(message);
        String message1= mood.analyseMood();
        Assert.assertEquals("Happy",message1);
    }
}