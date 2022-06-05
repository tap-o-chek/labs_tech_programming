package lab3.Chain;

import com.sun.istack.internal.NotNull;
import java.util.Objects;

public abstract class AbstractChainH implements ChainH {

    private ChainH chainHandler;

    @Override
    public void process(
            @NotNull Request request
    ) {
        validate(request);
        handle(request);
        if(Objects.nonNull(next()))
            next().process(request);
    }

    @Override
    public ChainH next() {
        return chainHandler;
    }

    @Override
    public ChainH next(ChainH chainHandler) {
        this.chainHandler = chainHandler;
        return chainHandler;
    }

    private void validate(
            @NotNull Request request
    ) {
        if (Objects.isNull(request))
            throw new RuntimeException("request must not be null");
    }

    abstract void handle(@NotNull Request request);
}
