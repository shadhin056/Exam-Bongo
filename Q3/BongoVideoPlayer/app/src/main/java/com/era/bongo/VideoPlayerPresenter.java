package com.era.bongo;

public class VideoPlayerPresenter {
    private View view;

    public VideoPlayerPresenter(View view) {
        this.view = view;
        boolean play = playVideoPresenter();
        boolean forward = forwardVideoPresenter();
        boolean back = playBackVideoPresenter();
    }

    public VideoPlayerPresenter() {
    }

    public boolean playVideoPresenter() {
        String playing = "playing video";
        view.playVideo(playing);
        return true;
    }

    public boolean forwardVideoPresenter() {
        String forward = "forward video";
        view.playForward(forward);
        return true;
    }

    public boolean playBackVideoPresenter() {
        String playBack = "playBack video";
        view.playBack(playBack);
        return true;
    }

    public interface View {
        void playVideo(String playing);

        void playForward(String forward);

        void playBack(String Backward);
    }
}
