package importhelp.prvapomoc;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Typeface;
import android.media.Image;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;

import me.relex.circleindicator.CircleIndicator;

public class BreathingPerson extends AppCompatActivity {
    FragmentPagerAdapter adapterViewPager;
    MediaPlayer mediaPlayer;
    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breathing_person);

        position = 0;

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sound5);
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                String buttonId = "button_pause_" + position;
                int resId = getResources().getIdentifier(buttonId, "id", getPackageName());
                Button button = (Button) findViewById(resId);
                button.setBackgroundResource(R.drawable.button_play);
            }
        });
        mediaPlayer.start();

        ViewPager vpPager = (ViewPager) findViewById(R.id.vpPager2);
        adapterViewPager = new MyPagerAdapter(getSupportFragmentManager());
        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);

        vpPager.setAdapter(adapterViewPager);
        indicator.setViewPager(vpPager);

        TextView title = (TextView) findViewById(R.id.breathingPerson_title);

        Typeface typeface= Typeface.createFromAsset(getAssets(), "fonts/BebasNeue.otf");

        title.setTypeface(typeface);

        vpPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {

            @Override
            public void onPageSelected(int page) {
                position = page;
                String buttonId = "button_pause_" + position;
                int resId = getResources().getIdentifier(buttonId, "id", getPackageName());
                Button button = (Button) findViewById(resId);
                button.setBackgroundResource(R.drawable.button_pause);
                switch (page) {
                    case 0:
                        mediaPlayer.stop();
                        mediaPlayer.release();
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sound5);
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                String buttonId = "button_pause_" + position;
                                int resId = getResources().getIdentifier(buttonId, "id", getPackageName());
                                Button button = (Button) findViewById(resId);
                                button.setBackgroundResource(R.drawable.button_play);
                            }
                        });
                        mediaPlayer.start();
                        break;
                    case 1:
                        mediaPlayer.stop();
                        mediaPlayer.release();
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sound6);
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                String buttonId = "button_pause_" + position;
                                int resId = getResources().getIdentifier(buttonId, "id", getPackageName());
                                Button button = (Button) findViewById(resId);
                                button.setBackgroundResource(R.drawable.button_play);
                            }
                        });
                        mediaPlayer.start();
                        break;
                    case 2:
                        mediaPlayer.stop();
                        mediaPlayer.release();
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sound7);
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                String buttonId = "button_pause_" + position;
                                int resId = getResources().getIdentifier(buttonId, "id", getPackageName());
                                Button button = (Button) findViewById(resId);
                                button.setBackgroundResource(R.drawable.button_play);
                            }
                        });
                        mediaPlayer.start();
                        break;
                    case 3:
                        mediaPlayer.stop();
                        mediaPlayer.release();
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sound8);
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                String buttonId = "button_pause_" + position;
                                int resId = getResources().getIdentifier(buttonId, "id", getPackageName());
                                Button button = (Button) findViewById(resId);
                                button.setBackgroundResource(R.drawable.button_play);
                            }
                        });
                        mediaPlayer.start();
                        break;
                    case 4:
                        mediaPlayer.stop();
                        mediaPlayer.release();
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sound9);
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                String buttonId = "button_pause_" + position;
                                int resId = getResources().getIdentifier(buttonId, "id", getPackageName());
                                Button button = (Button) findViewById(resId);
                                button.setBackgroundResource(R.drawable.button_play);
                            }
                        });
                        mediaPlayer.start();
                        break;
                    case 5:
                        mediaPlayer.stop();
                        mediaPlayer.release();
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sound10);
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                String buttonId = "button_pause_" + position;
                                int resId = getResources().getIdentifier(buttonId, "id", getPackageName());
                                Button button = (Button) findViewById(resId);
                                button.setBackgroundResource(R.drawable.button_play);
                            }
                        });
                        mediaPlayer.start();
                        break;
                    case 6:
                        mediaPlayer.stop();
                        mediaPlayer.release();
                        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.sound11);
                        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                            public void onCompletion(MediaPlayer mp) {
                                String buttonId = "button_pause_" + position;
                                int resId = getResources().getIdentifier(buttonId, "id", getPackageName());
                                Button button = (Button) findViewById(resId);
                                button.setBackgroundResource(R.drawable.button_play);
                            }
                        });
                        mediaPlayer.start();
                        break;
                    default:
                        return;
                }
            }

            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });
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
            String buttonId = "button_pause_" + position;
            int buttonResourceId = getResources().getIdentifier(buttonId, "id", getPackageName());
            Button button = (Button) findViewById(buttonResourceId);
            button.setBackgroundResource(R.drawable.button_pause);

            int positionSound = position + 5;
            String fileId = "sound" + positionSound;
            int soundResourceId = getResources().getIdentifier(fileId, "raw", getPackageName());
            mediaPlayer = MediaPlayer.create(getApplicationContext(), soundResourceId);
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                public void onCompletion(MediaPlayer mp) {
                    String buttonId = "button_pause_" + position;
                    int resId = getResources().getIdentifier(buttonId, "id", getPackageName());
                    Button button = (Button) findViewById(resId);
                    button.setBackgroundResource(R.drawable.button_play);
                }
            });
            mediaPlayer.start();
        }
    }

    public static class MyPagerAdapter extends FragmentPagerAdapter {
        private static int NUM_ITEMS = 7;

        public MyPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        // Returns total number of pages
        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        // Returns the fragment to display for that page
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0: // Fragment # 0 - This will show FirstFragment
                    return BreathingPerson_Fragment.newInstance(0);
                case 1: // Fragment # 0 - This will show FirstFragment different title
                    return BreathingPerson_Fragment.newInstance(1);
                case 2: // Fragment # 1 - This will show SecondFragment
                    return BreathingPerson_Fragment.newInstance(2);
                case 3: // Fragment # 0 - This will show FirstFragment
                    return BreathingPerson_Fragment.newInstance(3);
                case 4: // Fragment # 0 - This will show FirstFragment different title
                    return BreathingPerson_Fragment.newInstance(4);
                case 5: // Fragment # 1 - This will show SecondFragment
                    return BreathingPerson_Fragment.newInstance(5);
                case 6: // Fragment # 1 - This will show SecondFragment
                    return BreathingPerson_Fragment.newInstance(6);
                default:
                    return null;
            }
        }

        // Returns the page title for the top indicator
        @Override
        public CharSequence getPageTitle(int position) {
            return "Page " + position;
        }

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

        String buttonId = "button_pause_" + position;
        int buttonResourceId = getResources().getIdentifier(buttonId, "id", getPackageName());
        Button button = (Button) findViewById(buttonResourceId);
        button.setBackgroundResource(R.drawable.button_pause);

        int positionSound = position + 5;
        String fileId = "sound" + positionSound;
        int soundResourceId = getResources().getIdentifier(fileId, "raw", getPackageName());
        mediaPlayer = MediaPlayer.create(getApplicationContext(), soundResourceId);
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                String buttonId = "button_pause_" + position;
                int resId = getResources().getIdentifier(buttonId, "id", getPackageName());
                Button button = (Button) findViewById(resId);
                button.setBackgroundResource(R.drawable.button_play);
            }
        });
        mediaPlayer.start();
    }

    public void pausePlaySound (View view) {
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
            String buttonId = "button_pause_" + position;
            int resId = getResources().getIdentifier(buttonId, "id", getPackageName());
            Button button = (Button) findViewById(resId);
            button.setBackgroundResource(R.drawable.button_play);
        }
        else {
            mediaPlayer.start();
            String buttonId = "button_pause_" + position;
            int resId = getResources().getIdentifier(buttonId, "id", getPackageName());
            Button button = (Button) findViewById(resId);
            button.setBackgroundResource(R.drawable.button_pause);
        }
    }


}