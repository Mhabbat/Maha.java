package Model.implement;

import Model.AbstractPackAnimal;
import Model.AnimalGenius;

import java.time.LocalDate;

public class Camel extends AbstractPackAnimal {
    public Camel(String name, LocalDate birthDate) {
        super(name, birthDate);
        setAnimalGenius(AnimalGenius.CAMEL);
    }
}