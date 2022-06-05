package lab2.Deputy;

import java.util.HashMap;
import java.util.Map;

public class CacheDeputyYTApiClient implements YTApiClient {

    private YTApiClient ytService;
    private Map<String, Video> cachePop = new HashMap<String, Video>();
    private Map<String, Video> cacheAll = new HashMap<String, Video>();

    public CacheDeputyYTApiClient() {
        this.ytService = new ThirdPartyYTApiClient();
    }

    public Map<String, Video> popularVideos() {
        if (cachePop.isEmpty()){
            cachePop = ytService.popularVideos();
        }
        else {
            System.out.println("Retrieved list from cache.");
        }

        return cachePop;
    }

    public Video getVideo(String videoId) {
        Video video;
        if (!cacheAll.containsKey(videoId)) {
            video = ytService.getVideo(videoId);
            cacheAll.put(videoId, video);
        }
        else {
            System.out.println("Retrieved video '" + videoId + "' from cache.");
            video = cacheAll.get(videoId);
        }

        return video;
    }

    public void reset() {
        cachePop.clear();
        cacheAll.clear();
    }
}
