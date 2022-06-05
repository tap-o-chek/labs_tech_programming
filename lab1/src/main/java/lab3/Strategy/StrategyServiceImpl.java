package lab3.Strategy;

import org.jetbrains.annotations.NotNull;
import java.util.List;

public class StrategyServiceImpl implements StrategyService {

    private Strategy strat;

    public StrategyServiceImpl(@NotNull Strategy strategy) {
        this.strat = strategy;
    }

    @Override
    @NotNull
    public String exec(@NotNull List<String> strings) {
        String result = "";
        if(strings.isEmpty())
            return result;

        return strat.process(strings);
    }

    public StrategyService setStrategy(@NotNull Strategy strategy) {
        this.strat = strategy;
        return this;
    }
}