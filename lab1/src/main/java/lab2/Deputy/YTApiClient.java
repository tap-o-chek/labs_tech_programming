package lab2.Deputy;

import java.util.Map;

public interface YTApiClient {
    Map<String, Video> popularVideos();

    Video getVideo(String videoId);
}
