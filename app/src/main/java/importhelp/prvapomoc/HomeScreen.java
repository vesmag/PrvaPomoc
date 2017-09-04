package importhelp.prvapomoc;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        Button myButton = (Button) findViewById(R.id.start_button);
        Typeface typeface= Typeface.createFromAsset(getAssets(), "fonts/BebasNeue.otf");
        myButton.setTypeface(typeface);

        Button myButton2 = (Button) findViewById(R.id.disclaimer_button);
        myButton2.setTypeface(typeface);
    }

    public void safetyAssessment (View view) {
        Intent I = new Intent(this, SafetyAssessment.class);
        startActivity(I);
    }

    public void about (View view) {
        Intent I = new Intent(this, About.class);
        startActivity(I);
    }
}
