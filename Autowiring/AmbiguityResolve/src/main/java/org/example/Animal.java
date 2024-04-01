package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Animal{
//    @Autowired
//    @Qualifier("lion")
      AnimalType animal;
//      @Autowired
//      @Qualifier("elephant")      //not applicable here, it must be written within parameter of constructor
    public Animal(@Qualifier("lion") AnimalType animal){   //using Qualifier
        this.animal=animal;
    }
//    public Animal(AnimalType elephant){    //byName
//        this.animal=elephant;
//    }
//    @Autowired
//    public Animal(Lion l){     //byType
//        this.animal=l;
//    }

//    @Autowired
//    public void setAnimal(AnimalType elephant) {    //byname
//        this.animal = elephant;
//    }
//    @Autowired
//    public void setAnimal(Lion l) {    //byType
//        this.animal = l;
//    }

    public void identify(){
        animal.name();
    }

}
