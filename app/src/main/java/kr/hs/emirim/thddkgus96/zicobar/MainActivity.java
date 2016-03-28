package kr.hs.emirim.thddkgus96.zicobar;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends ActionBarActivity {
    EditText mName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = (EditText) findViewById(R.id.name);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mName.setText("");
    }
}
