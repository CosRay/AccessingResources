package com.example.cosmas.accessingresources;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonTap(View view)
    {
        TextView mytxtView=(TextView)findViewById(R.id.textview);
        mytxtView.setText("Hello Kiruki");
/* Obtain the id of the Relative Layout. We added this id in the content_main*/
        RelativeLayout myLayout=(RelativeLayout)findViewById(R.id.MainScreenLayout);
        /*Create a new textview through code.this refers to the context ie this class*/
        TextView secondView=new TextView(this);
/*Add this new textview to our relative layout. To do this you need some rules/parameters
* define these params as below*/
        RelativeLayout.LayoutParams lparams= new RelativeLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
        /*Add a new rule. Make the textview be below the button*/
        lparams.addRule(RelativeLayout.BELOW,R.id.button);
        secondView.setText(R.string.SecondView);
        /*Add the new view/component to the Relative Layout/our screen*/
        myLayout.addView(secondView,lparams);
    }

}
