package jp.ac.st.asojuku.original2014_001;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener{

	public void onClick(View v) {

		switch(v.getId()){
		case R.id.btnOK:

			EditText etv = (EditText)findViewById(R.id.edtName);
			String inputMsg = etv.getText().toString();



			Random rnd = new Random();
			int ran = rnd.nextInt(4);


		    Intent intent = null;
		    switch(ran){
		    case 0:
		    	intent = new Intent(MainActivity.this,DaikichiActivity.class);
		    	startActivity(intent);
		    	break;
		    case 1:
		    	intent = new Intent(MainActivity.this,ChuukichiActivity.class);
		    	startActivity(intent);
		    	break;

		    case 2:
		    	intent = new Intent(MainActivity.this,KyouActivity.class);
		    	startActivity(intent);
		    	break;
		    case 3:
		    	intent = new Intent(MainActivity.this,DaikyouActivity.class);
		    	startActivity(intent);
		    	break;

		    }

		}
	}
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();
		Button btnOK = (Button)findViewById(R.id.btnOK);
		btnOK.setOnClickListener(this);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
