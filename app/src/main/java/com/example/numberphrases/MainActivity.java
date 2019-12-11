package com.example.numberphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
AudioManager audioManager;
MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void add(View view)
    {
        switch (Integer.parseInt( view.getTag().toString()))
        { case 0:player=MediaPlayer.create(this,R.raw.english);
                 player.start();
                Log.i("tag", "add: "+0);
                break;
            case 1:player=MediaPlayer.create(this,R.raw.chinese);
                player.start();
                Log.i("tag", "add: "+1);
                break;
            case 2:player=MediaPlayer.create(this,R.raw.french);
                player.start();
                Log.i("tag", "add: "+2);
                break;
            case 3:player=MediaPlayer.create(this,R.raw.german);
                player.start();
                Log.i("tag", "add: "+3);
                break;
            case 4:player=MediaPlayer.create(this,R.raw.greek);
                player.start();
                Log.i("tag", "add: "+4);
                break;
            case 5:player=MediaPlayer.create(this,R.raw.japnese);
                player.start();
                Log.i("tag", "add: "+5);
                break;
            default:
                Log.i("tag", "error: "+9);
        }
    }

}
