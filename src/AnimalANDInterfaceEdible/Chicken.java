package AnimalANDInterfaceEdible;

public class Chicken extends Animal implements Edible{

    @Override
    public String makeSound() {
        return "Chicken: cúc cu !";
    }
    @Override
    public String howToEat(){
        return "ckecken eat rice !";
    }
}
