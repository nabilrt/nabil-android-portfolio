package com.abidnabil.nabilandroidportfolio;

import androidx.annotation.DrawableRes;

public class Project {

    String name;
    String description;
    int image;
    String packageName;

    Project(String name, String description, @DrawableRes int image, String packageName){
        this.name=name;
        this.description=description;
        this.image=image;
        this.packageName=packageName;
    }

}
