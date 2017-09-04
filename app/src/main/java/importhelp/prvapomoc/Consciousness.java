package importhelp.prvapomoc;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.IOException;

public class Consciousness extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consciousness);

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sound2);
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                Button button = (Button) findViewById(R.id.button_pause);
                button.setBackgroundResource(R.drawable.button_play);
            }
        });
        mediaPlayer.start();

        TextView title = (TextView) findViewById(R.id.consciousness_title);
        TextView text = (TextView)  findViewById(R.id.consciousness_text);
        TextView text2 = (TextView) findViewById(R.id.consciousness_text2);
        Button red_button = (Button) findViewById(R.id.consciousness_red_button);
        Button green_button = (Button) findViewById(R.id.consciousness_green_button);

        Typeface typeface= Typeface.createFromAsset(getAssets(), "fonts/BebasNeue.otf");

        title.setTypeface(typeface);
        text.setTypeface(typeface);
        text2.setTypeface(typeface);
        red_button.setTypeface(typeface);
        green_button.setTypeface(typeface);
    }

    public void consciousPerson (View view) {
        Intent I = new Intent(this, ConsciousPerson.class);
        startActivity(I);
    }

    public void breathing (View view) {
        Intent I = new Intent(this, Breathing.class);
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

            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sound2);
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

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sound2);
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
