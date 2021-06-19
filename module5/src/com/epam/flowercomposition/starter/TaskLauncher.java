package com.epam.flowercomposition.starter;

import com.epam.flowercomposition.entity.Alstroemeria;
import com.epam.flowercomposition.entity.FlowerPackage;
import com.epam.flowercomposition.entity.Rose;

public class TaskLauncher {
    public static void main(String[] args) {
        Rose rose = new Rose("White", 10);
        Alstroemeria alstroemeria = new Alstroemeria("Red", 11);
        FlowerPackage firstFlowerPackage = new FlowerPackage("Yellow", rose, alstroemeria);
        System.out.println(firstFlowerPackage);
    }
}
