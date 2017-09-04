package importhelp.prvapomoc;

import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;

import uk.co.deanwild.flowtextview.FlowTextView;

public class SafetyAssessment extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safety_assessment);

        Typeface typeface= Typeface.createFromAsset(getAssets(), "fonts/BebasNeue.otf");

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sound1);
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                Button button = (Button) findViewById(R.id.button_pause);
                button.setBackgroundResource(R.drawable.button_play);
            }
        });
        mediaPlayer.start();

        WebView breathing_gif = (WebView) findViewById(R.id.dangers_gif);
        breathing_gif.loadUrl("file:///android_asset/dangers.gif");

        breathing_gif.getSettings().setBuiltInZoomControls(false);
        breathing_gif.getSettings().setDisplayZoomControls(false);

        TextView title = (TextView) findViewById(R.id.safety_assessment_title);
        TextView text = (TextView)  findViewById(R.id.safety_assessment_text);
        Button red_button = (Button) findViewById(R.id.sa_red_button);
        Button green_button = (Button) findViewById(R.id.sa_green_button);

        title.setTypeface(typeface);
        text.setTypeface(typeface);
        red_button.setTypeface(typeface);
        green_button.setTypeface(typeface);
    }

    @Override
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

            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sound1);
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                public void onCompletion(MediaPlayer mp) {
                    Button button = (Button) findViewById(R.id.button_pause);
                    button.setBackgroundResource(R.drawable.button_play);
                }
            });
            mediaPlayer.start();
        }
    }

    public void consciousness (View view) {
        Intent I = new Intent(this, Consciousness.class);
        startActivity(I);
    }

    public void callEmergency (View view) {
        Intent I = new Intent(Intent.ACTION_DIAL, Uri.parse("tel: 112"));
        startActivity(I);
    }

    public void restartSound (View view) {
        if(mediaPlayer.isPlaying())
        {
            mediaPlayer.stop();
        }

        Button button = (Button) findViewById(R.id.button_pause);
        button.setBackgroundResource(R.drawable.button_pause);

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sound1);
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
