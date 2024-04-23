package Control;

import Model.AbstractAnimal;
import Model.AnimalGenius;
import Model.implement.*;
import storage.Storage;

import java.time.LocalDate;
import java.util.List;

/**
 * Отвечает за взаимодействие View и Model
 */
public class Animals {

    private Storage dbAnimal1;

    public Animals(Storage dbKennel) {
        this.dbAnimal1 = dbAnimal1;
    }

    public List<AbstractAnimal> getAnimals() {
        List<AbstractAnimal> allAnimals = dbAnimal1.getAllAnimals();
        return allAnimals;
    }

    public boolean createAnimal(String name, LocalDate birthDay, AnimalGenius animalGenius) {
        AbstractAnimal animal = switch (animalGenius) {
            case CAT -> new Cat(name, birthDay);
            case DOG -> new Dog(name, birthDay);
            case HAMSTER -> new Hamster(name, birthDay);
            case HORSE -> new Horse(name, birthDay);
            case CAMEL -> new Camel(name, birthDay);
            case DONKEY -> new Donkey(name, birthDay);
        };

        return dbAnimal1.addAnimal(animal);
    }

    public int removeAnimal(AbstractAnimal animal) {
        if (animal == null) return -1;
        return  dbAnimal1.removeAnimal(animal);
    }
}