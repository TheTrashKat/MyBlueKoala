package com.example.skyapps.mybluekoala;

import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import java.net.URI;


public class VideoActivity extends AppCompatActivity {
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
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        videoView=(VideoView)findViewById(R.id.videoView);
        DaVideo= getIntent().getStringExtra("url");

        if(DaVideo.equals("A")){
           // uri = Uri.parse("http://innovaskyapps.com.co/UB/Vocales.mp4");
            String dir= "android.resource://"+getPackageName()+"/"+R.raw.colores;
            uri = Uri.parse(dir);
        }
       else if(DaVideo.equals("B")){
            //uri = Uri.parse("http://innovaskyapps.com.co/UB/Vocales.mp4");
            String dir= "android.resource://"+getPackageName()+"/"+R.raw.vocales;
            uri = Uri.parse(dir);
        }
        else if(DaVideo.equals("C")){
             //uri = Uri.parse("http://innovaskyapps.com.co/UB/WhatsApp%20Video%202018-11-07%20at%2000.59.52.mp4");
            String dir= "android.resource://"+getPackageName()+"/"+R.raw.intro_koala;
            uri = Uri.parse(dir);
        }
        videoView.setMediaController(new MediaController(this));
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
    }
}
