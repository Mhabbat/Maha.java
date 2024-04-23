package Model.implement;


import Model.AbstractPet;
import Model.AnimalGenius;

import java.time.LocalDate;

public class Dog extends AbstractPet {
    public Dog(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAnimalGenius(AnimalGenius.DOG);
    }
}