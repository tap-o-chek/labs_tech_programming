package lab3.Strategy;

import com.sun.istack.internal.NotNull;
import java.util.List;

public interface Strategy {
    @NotNull
    String process(@NotNull List<String> stings);
}
