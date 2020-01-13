package com.era.bongo;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.hamcrest.CoreMatchers.is;

public class VideoPlayerPresenterTest {
    @Mock
    VideoPlayerViewActivity mvpView;
    VideoPlayerPresenter SUT;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        SUT = new VideoPlayerPresenter(mvpView);
    }

    @org.junit.Test
    public void checkVideoPlayer_Playing_trueReturn() {
        boolean result = SUT.playVideoPresenter();
        Assert.assertThat(result, is(true));
    }

    @org.junit.Test
    public void checkVideoPlayer_forward_trueReturn() {
        boolean result = SUT.forwardVideoPresenter();
        Assert.assertThat(result, is(true));
    }

    @org.junit.Test
    public void checkVideoPlayer_playBack_trueReturn() {
        boolean result = SUT.playBackVideoPresenter();
        Assert.assertThat(result, is(true));
    }

    @After
    public void tearDown() throws Exception {
    }
}