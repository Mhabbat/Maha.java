package Model.implement;

import Model.AbstractPet;
import Model.AnimalGenius;

import java.time.LocalDate;

public class Cat extends AbstractPet {
    public Cat(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAnimalGenius(AnimalGenius.CAT);
    }
}
