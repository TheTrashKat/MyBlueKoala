package com.example.skyapps.mybluekoala;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class introActivity extends Activity {

    Uri uri;
    {
        uri = null;
    }


    VideoView videoView;
    String DaVideo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        // getSupportActionBar().hide();

        videoView=(VideoView)findViewById(R.id.videoView);
        DaVideo= getIntent().getStringExtra("url");

        String dir= "android.resource://"+getPackageName()+"/"+R.raw.intro_koala;
        uri = Uri.parse(dir);

        //uri = Uri.parse("http://innovaskyapps.com.co/UB/Vocales.mp4");
        // videoView.setMediaController(new MediaController(this));
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                Intent i = new Intent(introActivity.this, LoginActivity.class);//<-<- PARTE A MODIFICAR >->-A
                startActivity(i);
            }
        });
        videoView.start();


    }
}
