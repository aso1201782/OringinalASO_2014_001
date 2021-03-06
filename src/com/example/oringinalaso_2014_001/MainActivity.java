package com.example.oringinalaso_2014_001;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements
View.OnClickListener
{
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		try{
			setContentView(R.layout.activity_main);
		}
		catch(Error e){
			e.printStackTrace();
		}
	}

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		switch(v.getId()){ //どのボタンが押された判定
		case R.id.btnOK: //btnOKが押された

			
			//Randomクラスのインスタンスを作る
			Random rnd = new Random();
			//0～から3の4のパターンの数字をranに取得
			int ran = rnd.nextInt(4);
			
			//生成して代入用のIntentインスタンス変数を用意
			Intent intent = null;
			// ranの値によって処理をわける
			switch(ran){
				case 0:
					//0なら大吉のページに飛ばす
					//インテントのインスタンス生成
					intent = new Intent(MainActivity.this, DaikichiActivity.class);
					//次画面のアクティビティ起動
					startActivity(intent);
					break;
				case 1:
					//1なら大吉のページに飛ばす
					//インテントのインスタンス生成
					intent = new Intent(MainActivity.this, DaikyouActivity.class);
					//次画面のアクティビティ起動
					startActivity(intent);
					break;
				case 2:
					//2なら大吉のページに飛ばす
					//インテントのインスタンス生成
					intent = new Intent(MainActivity.this, kyouActivity.class);
					//次画面のアクティビティ起動
					startActivity(intent);
					break;
				case 3:
					//3なら大吉のページに飛ばす
					//インテントのインスタンス生成
					intent = new Intent(MainActivity.this, ChuukichiActivity.class);
					//次画面のアクティビティ起動
					startActivity(intent);
					break;
			}
					
		}
	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();
		//ボタンをIDで探してボタン変数をつくる
		Button btnOK = (Button)findViewById(R.id.btnOK);
		//ボタン変数にリスナーを登録する
		btnOK.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}




}
