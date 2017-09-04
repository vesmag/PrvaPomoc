package importhelp.prvapomoc;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;

public class Breathing extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breathing);

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sound4);
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                Button button = (Button) findViewById(R.id.button_pause);
                button.setBackgroundResource(R.drawable.button_play);
            }
        });

        WebView breathing_gif = (WebView) findViewById(R.id.breathing_gif);
        breathing_gif.loadUrl("file:///android_asset/breathing_new.gif");

        TextView title = (TextView) findViewById(R.id.breathing_title);
        TextView text = (TextView)  findViewById(R.id.breathing_text);
        Button red_button = (Button) findViewById(R.id.breathing_red_button);
        Button green_button = (Button) findViewById(R.id.breathing_green_button);

        Typeface typeface= Typeface.createFromAsset(getAssets(), "fonts/BebasNeue.otf");

        title.setTypeface(typeface);
        text.setTypeface(typeface);
        red_button.setTypeface(typeface);
        green_button.setTypeface(typeface);
    }

    public void breathingPerson (View view) {
        Intent I = new Intent(this, BreathingPerson.class);
        startActivity(I);
    }

    public void nonBreathingPerson (View view) {
        Intent I = new Intent(this, NonBreathingPerson.class);
        startActivity(I);
    }

    protected void onPause() {
        super.onPause();
        mediaPlayer.stop();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (!mediaPlayer.isPlaying()) {
            Button button = (Button) findViewById(R.id.button_pause);
            button.setBackgroundResource(R.drawable.button_pause);

            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sound4);
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                public void onCompletion(MediaPlayer mp) {
                    Button button = (Button) findViewById(R.id.button_pause);
                    button.setBackgroundResource(R.drawable.button_play);
                }
            });
            mediaPlayer.start();
        }
    }

    public void restartSound (View view) {
        if(mediaPlayer.isPlaying())
        {
            mediaPlayer.stop();
        }

        Button button = (Button) findViewById(R.id.button_pause);
        button.setBackgroundResource(R.drawable.button_pause);

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sound4);
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                Button button = (Button) findViewById(R.id.button_pause);
                button.setBackgroundResource(R.drawable.button_play);
            }
        });
        mediaPlayer.start();
    }

    public void pausePlaySound (View view) {
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
            Button button = (Button) findViewById(R.id.button_pause);
            button.setBackgroundResource(R.drawable.button_play);
        }
        else {
            mediaPlayer.start();
            Button button = (Button) findViewById(R.id.button_pause);
            button.setBackgroundResource(R.drawable.button_pause);
        }
    }
}
