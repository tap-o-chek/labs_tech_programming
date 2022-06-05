package lab3.Strategy;

import com.sun.deploy.util.StringUtils;
import com.sun.istack.internal.NotNull;
import java.util.List;

public class SemicolonSeparated implements Strategy {

    @NotNull
    @Override
    public String process(@NotNull List<String> stings) {
        return StringUtils.join(stings, ";");
    }
}
