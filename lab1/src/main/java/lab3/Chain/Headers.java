package lab3.Chain;


import com.sun.istack.internal.NotNull;
import org.apache.commons.lang3.StringUtils;

public class Headers extends AbstractChainH {

    private static final String DELIMITER = ":";

    @Override
    void handle(@NotNull Request request) {
        String[] headers = StringUtils.split(request.getInputStream(), "\n");

        for(String header : headers) {
            if (header.isEmpty())
                continue;

            String[] arr = StringUtils.split(header, DELIMITER);
            if(0 == arr.length)
                continue;

            request.getHeaders().put(arr[0], arr[1]);
        }
    }
}
