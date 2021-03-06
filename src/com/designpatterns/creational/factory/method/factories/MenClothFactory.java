package com.designpatterns.creational.factory.method.factories;

import com.designpatterns.creational.factory.method.cloth.*;

public class MenClothFactory extends ClothingFactory{
    @Override
    protected Cloth createCloth(ClothName clothName) {
        if(clothName.equals(ClothName.SHIRT))
            return new MenShirt();
        if (clothName.equals(ClothName.TROUSER))
            return new MenTrouser();
        if (clothName.equals(ClothName.MEN_UNDER_SHIRT))
            return new MenUnderShirt();
        throw  new UnsupportedOperationException("This man cloth is not available");

    }

}
