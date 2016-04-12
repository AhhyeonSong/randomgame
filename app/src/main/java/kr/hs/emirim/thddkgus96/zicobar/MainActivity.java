package kr.hs.emirim.thddkgus96.zicobar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{

    EditText mName;
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mName = (EditText) findViewById(R.id.name);
        mButton = (Button) findViewById(R.id.btn_show_me_the_chicekn);
        mButton.setOnClickListener(this);

    }

    @Override
    protected void onResume() {
        super.onResume();
        mName.setText(null);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        String name=mName.getText().toString();
//        if(name==null){
//            Toast.makeText(this, "이름을 입력해 주세요!!", Toast.LENGTH_LONG).show();
//        }else {
//            Toast.makeText(this, name + "씨, 저도 배고파요", Toast.LENGTH_LONG).show();
//            Intent intent = new Intent(this, ResultActivity.class);
//            startActivity(intent);
//        }
//

        try{
            Toast.makeText(this, name + "씨, 브라꾸비", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("age", 10);
            startActivity(intent);
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        }catch(NullPointerException e){
            Toast.makeText(this, "이름을 입력해 주세요!!", Toast.LENGTH_LONG).show();
        }catch(Exception e){
            Toast.makeText(this, "이유는 모르지만 실행이 안되네요..ㅠ", Toast.LENGTH_LONG).show();
        }

    }
}
