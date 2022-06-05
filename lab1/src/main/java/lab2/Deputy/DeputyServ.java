package lab2.Deputy;

// подставляет вместо реальных объектов специальные объекты-заменители,
// которые перехватывают вызовы к оригинальному объекту,
// позволяя сделать что-то до или после передачи вызова оригиналу.

public class DeputyServ {

    public void exec() {
        YTVideoDownloader nativeDownloader = new YTVideoDownloader(new ThirdPartyYTApiClient());
        YTVideoDownloader smartDownloader = new YTVideoDownloader(new CacheDeputyYTApiClient());

        call(nativeDownloader);
        call(smartDownloader);
    }

    private void call(YTVideoDownloader downloader) {
        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("hamsterrrs");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("whatdoesthefoxsay");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("papandreo");
        downloader.renderVideoPage("nikitaonbanana");
    }
}
