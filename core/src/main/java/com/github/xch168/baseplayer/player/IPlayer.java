package com.github.xch168.baseplayer.player;

import android.view.Surface;
import android.view.SurfaceHolder;

/**
 * Created by XuCanHui on 2018/9/1.
 */
public interface IPlayer {

    int STATE_IDLE = 1;
    int STATE_INITIALIZED = 2;
    int STATE_PREPARED = 3;
    int STATE_STARTED = 4;
    int STATE_PAUSED = 5;
    int STATE_STOPED = 6;
    int STATE_PLACKBACK_COMPLETE = 7;
    int STATE_END = 8;
    int STATE_ERROR = -1;

    void setDataSource(String path);
    void setDisplay(SurfaceHolder surfaceHolder);
    void setSurface(Surface surface);
    void setVolume(float leftVolume, float rightVolume);

    long getDuration();
    long getCurrentPosition();
    int getBufferedPercentage();

    int getVideoWidth();
    int getVideoHeight();

    boolean isPlaying();

    void start();
    void stop();
    void pause();
    void resume();
    void seekTo(long positionMs);
    void reset();
    void release();

}
