package com.era.bongo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class VideoPlayerViewActivity extends AppCompatActivity implements VideoPlayerPresenter.View {
    private VideoPlayerPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_player_view);
        presenter = new VideoPlayerPresenter(this);
    }

    @Override
    public void playVideo(String playing) {
        Toast.makeText(this, playing, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void playForward(String forward) {
        Toast.makeText(this, forward, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void playBack(String Backward) {
        Toast.makeText(this, Backward, Toast.LENGTH_SHORT).show();
    }


}
