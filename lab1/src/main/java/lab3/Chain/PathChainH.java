package lab3.Chain;

import com.sun.istack.internal.NotNull;

public class PathChainH extends AbstractChainH {

    private static final String KEY = "path";

    @Override
    public void handle(@NotNull Request request) {
        if(request.getHeaders().containsKey(KEY))
            request.setPath(request.getHeaders().get(KEY));
    }
}
