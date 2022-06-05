package lab3.Chain;

import com.sun.istack.internal.NotNull;

public class SessionChainH extends AbstractChainH {

    private static final String KEY = "session";

    @Override
    public void handle(
            @NotNull Request request
    ) {
        if(request.getHeaders().containsKey(KEY))
            request.setSession(request.getHeaders().get(KEY));
    }
}
