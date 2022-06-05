package lab3.Chain;

import com.sun.istack.internal.NotNull;

public interface ChainH {

        void process(@NotNull Request request);

        ChainH next();

        ChainH next(ChainH chainHandler);
}
