package importhelp.prvapomoc;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        Typeface typeface= Typeface.createFromAsset(getAssets(), "fonts/BebasNeue.otf");
        TextView title = (TextView) findViewById(R.id.about_title);
        TextView text1 = (TextView)  findViewById(R.id.about_text1);
        TextView text2 = (TextView)  findViewById(R.id.about_text2);
        TextView text3 = (TextView)  findViewById(R.id.about_text3);
        TextView text4 = (TextView)  findViewById(R.id.about_text4);
        Button button = (Button) findViewById(R.id.donate_button);

        title.setTypeface(typeface);
        text1.setTypeface(typeface);
        text2.setTypeface(typeface);
        text3.setTypeface(typeface);
        text4.setTypeface(typeface);
        button.setTypeface(typeface);
    }

    public void donate (View view) {
        final AlertDialog alertDialog = new AlertDialog.Builder(this).create();

        alertDialog.setTitle("Doniranje");

        alertDialog.setMessage("Donacije primamo na žiro račun XXXX.\nPuno Vam hvala na pomoći!");

        alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "I drugi put!", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int id) {

                alertDialog.cancel();
            } });

        alertDialog.show();
    }
}
