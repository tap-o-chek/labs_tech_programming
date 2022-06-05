package lab3.Chain;

import com.sun.istack.internal.NotNull;

public class MethodChainH extends AbstractChainH {

    private static final String KEY = "method";

    @Override
    void handle(
            @NotNull Request request
    ) {
        if(request.getHeaders().containsKey(KEY))
            request.setMethod(request.getHeaders().get(KEY));
    }
}
