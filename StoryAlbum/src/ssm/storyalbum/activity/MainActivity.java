package ssm.storyalbum.activity;

import ssm.storyalbum.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	
	private final String TAG = "MainActivity";
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "onCreate()"); 
        setContentView(R.layout.activity_main);
         
        Button btn_goShelves = (Button)findViewById(R.id.btn_goShelves);
        btn_goShelves.setOnClickListener(btnClick);
    }
    
    @Override 
    protected void onResume() { 
    	// TODO Auto-generated method stub
    	super.onResume();
    	Log.i(TAG, "onResume()"); 
    }

    @Override
    protected void onDestroy() {
    	// TODO Auto-generated method stub
    	super.onDestroy();
    	Log.i(TAG, "onDestroy() test");  
    }
    
    private OnClickListener btnClick = new OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.btn_goShelves:
				Intent i = new Intent(MainActivity.this, ShelvesActivity.class);
				startActivity(i);
				break;

			default:
				break;
			}
		}
    	
    };
    
}
