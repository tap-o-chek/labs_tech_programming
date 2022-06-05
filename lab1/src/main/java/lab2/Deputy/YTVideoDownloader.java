package lab2.Deputy;

import java.util.Map;

public class YTVideoDownloader {

    private YTApiClient apiClient;

    public YTVideoDownloader(YTApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public void renderVideoPage(String videoId) {
        Video video = apiClient.getVideo(videoId);
        System.out.println("\n-------------------------------");
        System.out.println("Video page (imagine fancy HTML)");
        System.out.println("ID: " + video.getId());
        System.out.println("Title: " + video.getTitle());
        System.out.println("Video: " + video.getData());
        System.out.println("-------------------------------\n");
    }

    public void renderPopularVideos() {
        Map<String, Video> list = apiClient.popularVideos();
        System.out.println("\n-------------------------------");
        System.out.println("Most popular videos on YouTube (imagine fancy HTML)");
        for (Video video : list.values()) {
            System.out.println("ID: " + video.getId() + " / Title: " + video.getTitle());
        }
        System.out.println("-------------------------------\n");
    }
}
