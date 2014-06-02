package com.example.oringinalaso_2014_001;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity implements
View.OnClickListener
{
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

	}

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		switch(v.getId()){ //どのボタンが押された判定
		case R.id.button1: //btnMsgが押された
			//エディットテキストから入力内容を取り出す
			EditText etv = (EditText)findViewById(R.id.textView1);
			String inputMsg = etv.getText().toString();
			
			//Randomクラスのインスタンスを作る
			Random rnd = new Random();
			//0～から3の4のパターンの数字をranに取得
			int ran = rnd.nextInt(4);
			
			//生成して代入用のIntentインスタンス変数を用意
			Intent intent = null;
			// ranの値によって処理をわける
			switchi(ran);
				case 0:
					//0なら大吉のページに飛ばす
					//インテントのインスタンス生成
					intent = new Intent(MainActivity.this, DaikichiActivity.class);
					//次画面のアクティビティ起動
					startActivity(intent);
					break;
				case 1:
					//0なら大吉のページに飛ばす
					//インテントのインスタンス生成
					intent = new Intent(MainActivity.this, DaikyouActivity.class);
					//次画面のアクティビティ起動
					startActivity(intent);
					break;
				case 2:
					//0なら大吉のページに飛ばす
					//インテントのインスタンス生成
					intent = new Intent(MainActivity.this, kyouActivity.class);
					//次画面のアクティビティ起動
					startActivity(intent);
					break;
				case 3:
					//0なら大吉のページに飛ばす
					//インテントのインスタンス生成
					intent = new Intent(MainActivity.this, chuukichiActivity.class);
					//次画面のアクティビティ起動
					startActivity(intent);
					break;
					
			}
	}
	private void switchi(int ran) {
		// TODO 自動生成されたメソッド・スタブ
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}




}
