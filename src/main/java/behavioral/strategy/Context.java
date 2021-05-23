package behavioral.strategy;

import behavioral.strategy.strategy_method.ConcreteStrategyAdd;
import behavioral.strategy.strategy_method.ConcreteStrategyMultiply;
import behavioral.strategy.strategy_method.ConcreteStrategySubtract;
import behavioral.strategy.strategy_method.Strategy;

class Context {

    private Strategy strategy;
    private final String choiceStrategy;

    public Context(String choiceStrategy) {
        this.choiceStrategy = choiceStrategy;
        choiceStrategy();
    }

    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }

    private void choiceStrategy() {
        switch (choiceStrategy) {
            case "+":
                strategy = new ConcreteStrategyAdd();
                break;
            case "-":
                strategy = new ConcreteStrategySubtract();
                break;
            case "*":
                strategy = new ConcreteStrategyMultiply();
                break;
        }
    }

}
