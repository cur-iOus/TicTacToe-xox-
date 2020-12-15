package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.widget.PopupMenu.*;
import android.media.*;
import java.security.*;

public class MainActivity extends Activity implements View.OnClickListener
{
	Button restart,matchReset, setting, soundManage, b1,b2,b3,b4,b5,b6,b7,b8,b9;
	TextView playerTurnView, playerOnePoint, playerTwoPoint, draw, result;
	
	String forX="x", forO="o";
	boolean playerOneTurn=true, sound = true;
	int p1point = 0, p2point = 0,  drawCount=0, move = 0;
	
	MediaPlayer media, media2, winMedia, drawMedia, touchMedia;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

		media = MediaPlayer.create(MainActivity.this, R.raw.x);
		media2 = MediaPlayer.create(MainActivity.this, R.raw.o);
		winMedia = MediaPlayer.create(MainActivity.this, R.raw.finish)
		;drawMedia = MediaPlayer.create(MainActivity.this, R.raw.draw);
		touchMedia = MediaPlayer.create(MainActivity.this, R.raw.drop);
		initiallizeAll();
    }
	
	@Override
	public void onClick(View v)
	{
		
		switch(v.getId()){
				
			case R.id.mainButton1:
				if(playerOneTurn){
					b1.setText(forX);
					playerOneTurn=false;
					b1.setClickable(false);
					playerTurn();
					winDetect();
					move++;
					drawView();
					media.start();
				}
				else{
					b1.setText(forO);
					playerOneTurn=true;
					b1.setClickable(false);
					playerTurn();
					winDetect();
					move++;
					drawView();
					media2.start();
				}
			break;
				
			case R.id.mainButton2:
				if(playerOneTurn){
					b2.setText(forX);
					playerOneTurn=false;
					b2.setClickable(false);
					playerTurn();
					winDetect();
					move++;
					drawView();
					media.start();
					
				}
				else{
					b2.setText(forO);
					playerOneTurn=true;
					b2.setClickable(false);
					playerTurn();
					winDetect();
					move++;
					drawView();
					media2.start();
					
				}
				break;
				
			case R.id.mainButton3:
				if(playerOneTurn){
					b3.setText(forX);
					playerOneTurn=false;
					b3.setClickable(false);
					playerTurn();
					winDetect();
					move++;
					drawView();
					media.start();
					
				}
				else{
					b3.setText(forO);
					playerOneTurn=true;
					b3.setClickable(false);
					playerTurn();
					winDetect();
					move++;
					drawView();
					media2.start();
					
				}
				break;
				
			case R.id.mainButton4:
				if(playerOneTurn){
					b4.setText(forX);
					playerOneTurn=false;
					b4.setClickable(false);
					playerTurn();
					winDetect();
					move++;
					drawView();
					media.start();
					
				}
				else{
					b4.setText(forO);
					playerOneTurn=true;
					b4.setClickable(false);
					playerTurn();
					winDetect();
					move++;
					drawView();
					media2.start();
					
				}
				break;
				
			case R.id.mainButton5:
				if(playerOneTurn){
					b5.setText(forX);
					playerOneTurn=false;
					b5.setClickable(false);
					playerTurn();
					winDetect();
					move++;
					drawView();
					media.start();
					
				}
				else{
					b5.setText(forO);
					playerOneTurn=true;
					b5.setClickable(false);
					playerTurn();
					winDetect();
					move++;
					drawView();
					media2.start();
					
				}
				break;
				
			case R.id.mainButton6:
				if(playerOneTurn){
					b6.setText(forX);
					playerOneTurn=false;
					b6.setClickable(false);
					playerTurn();
					winDetect();
					move++;
					drawView();
					media.start();
					
				}
				else{
					b6.setText(forO);
					playerOneTurn=true;
					b6.setClickable(false);
					playerTurn();
					winDetect();
					move++;
					drawView();
					media2.start();
					
				}
				break;
				
			case R.id.mainButton7:
				if(playerOneTurn){
					b7.setText(forX);
					playerOneTurn=false;
					b7.setClickable(false);
					playerTurn();
					winDetect();
					move++;
					drawView();
					media.start();
					
				}
				else{
					b7.setText(forO);
					playerOneTurn=true;
					b7.setClickable(false);
					playerTurn();
					winDetect();
					move++;
					drawView();
					media2.start();
					
				}
				break;
				
			case R.id.mainButton8:
				if(playerOneTurn){
					b8.setText(forX);
					playerOneTurn=false;
					b8.setClickable(false);
					playerTurn();
					winDetect();
					move++;
					drawView();
					media.start();
					
				}
				else{
					b8.setText(forO);
					playerOneTurn=true;
					b8.setClickable(false);
					playerTurn();
					winDetect();
					move++;
					drawView();
					media2.start();
					
				}
				break;
				
			case R.id.mainButton9:
				if(playerOneTurn){
					b9.setText(forX);
					playerOneTurn=false;
					b9.setClickable(false);
					playerTurn();
					winDetect();
					move++;
					drawView();
					media.start();
					
				}
				else{
					b9.setText(forO);
					playerOneTurn=true;
					b9.setClickable(false);
					playerTurn();
					winDetect();
					move++;
					drawView();
					media2.start();
					
				}
				break;
				
			case R.id.matchResetID:
				Toast.makeText(MainActivity.this, "Match Reset!", Toast.LENGTH_SHORT).show();
				buttonClear();
				buttonEnable(true);
				buttonClickable(true);
				move=0;
				result.setText("");
				playerOneTurn=true;
				playerTurn();
				setting.setEnabled(true);
				break;
				
			case R.id.restartID:
				Toast.makeText(MainActivity.this, "New Match Sequence Started!", Toast.LENGTH_SHORT).show();
				buttonClear();
				buttonEnable(true);
				buttonClickable(true);
				playerOnePoint.setText(""+0);
				playerTwoPoint.setText(""+0);
				draw.setText(""+0);
				p1point=0;
				p2point=0;
				move=0;
				drawCount=0;
				result.setText("");
				playerOneTurn=true;
				playerTurn();
				setting.setEnabled(true);
				break;
				
			case R.id.settingButtonID:
				
				touchMedia.start();
				PopupMenu popupMenu = new PopupMenu(MainActivity.this, setting);
				popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());
				
				popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener(){

						@Override
						public boolean onMenuItemClick(MenuItem item)
						{
							switch(item.getItemId()){
								case R.id.item:
									touchMedia.start();
									playerOneTurn = true;
									playerTurnView.setText("➤Player 1 Turn...");
									break;
								case R.id.item2:
									touchMedia.start();
									playerOneTurn = false;
									playerTurnView.setText("➤Player 2 Turn...");
									break;
							}
							return true;
						}
				});
				popupMenu.show();
				break;
				
			case R.id.soundManageID:
				if(sound==true){
					soundManage.setBackgroundResource(R.drawable.on);
					media.start();
					media2.start();
					winMedia.start();
					drawMedia.start();
					touchMedia.start();
					sound=false;
				}else{
					soundManage.setBackgroundResource(R.drawable.off);
					media.pause();
					media2.pause();
					winMedia.pause();
					drawMedia.pause();
					touchMedia.pause();
					sound=true;
				}
		}
	}

	public void winDetect(){
		if((b1.getText().equals(forX) && b2.getText().equals(forX) && b3.getText().equals(forX)) ||
			(b4.getText().equals(forX) && b5.getText().equals(forX) && b6.getText().equals(forX)) ||
			(b7.getText().equals(forX) && b8.getText().equals(forX) && b9.getText().equals(forX)) ||
			(b1.getText().equals(forX) && b4.getText().equals(forX) && b7.getText().equals(forX)) ||
			(b2.getText().equals(forX) && b5.getText().equals(forX) && b8.getText().equals(forX)) ||
			(b3.getText().equals(forX) && b6.getText().equals(forX) && b9.getText().equals(forX)) ||
			(b1.getText().equals(forX) && b5.getText().equals(forX) && b9.getText().equals(forX)) ||
			(b3.getText().equals(forX) && b5.getText().equals(forX) && b7.getText().equals(forX)) )
		{
			winMedia.start();
			setting.setEnabled(false);
			buttonEnable(false);
			winningMessage(true);
			move=0;
		}
		else if ((b1.getText().equals(forO) && b2.getText().equals(forO) && b3.getText().equals(forO)) ||
				 (b4.getText().equals(forO) && b5.getText().equals(forO) && b6.getText().equals(forO)) ||
				 (b7.getText().equals(forO) && b8.getText().equals(forO) && b9.getText().equals(forO)) ||
				 (b1.getText().equals(forO) && b4.getText().equals(forO) && b7.getText().equals(forO)) ||
				 (b2.getText().equals(forO) && b5.getText().equals(forO) && b8.getText().equals(forO)) ||
				 (b3.getText().equals(forO) && b6.getText().equals(forO) && b9.getText().equals(forO)) ||
				 (b1.getText().equals(forO) && b5.getText().equals(forO) && b9.getText().equals(forO)) ||
				 (b3.getText().equals(forO) && b5.getText().equals(forO) && b7.getText().equals(forO)) )
		{
			winMedia.start();
			setting.setEnabled(false);
			buttonEnable(false);
			winningMessage(false);
			move=0;
		}
	}
	
	public void initiallizeAll(){
		soundManage = findViewById(R.id.soundManageID);
		
		result = findViewById(R.id.resultTextViewID);
		
		setting = findViewById(R.id.settingButtonID);
		setting.setOnClickListener(this);
		
		restart=findViewById(R.id.restartID);
		restart.setOnClickListener(this);
		
		matchReset = findViewById(R.id.matchResetID);
		matchReset.setOnClickListener(this);
		
		b1=findViewById(R.id.mainButton1);
		b1.setOnClickListener(this);
		b2=findViewById(R.id.mainButton2);
		b2.setOnClickListener(this);
		b3=findViewById(R.id.mainButton3);
		b3.setOnClickListener(this);
		b4=findViewById(R.id.mainButton4);
		b4.setOnClickListener(this);
		b5=findViewById(R.id.mainButton5);
		b5.setOnClickListener(this);
		b6=findViewById(R.id.mainButton6);
		b6.setOnClickListener(this);
		b7=findViewById(R.id.mainButton7);
		b7.setOnClickListener(this);
		b8=findViewById(R.id.mainButton8);
		b8.setOnClickListener(this);
		b9=findViewById(R.id.mainButton9);
		b9.setOnClickListener(this);
		
		playerTurnView=findViewById(R.id.playerTurnID);
		playerOnePoint=findViewById(R.id.point1ID);
		playerTwoPoint=findViewById(R.id.point2ID);
		draw=findViewById(R.id.drawID);
	}
	
	public void buttonEnable(boolean what){
		if(what==false){
			b1.setEnabled(false);
			b2.setEnabled(false);
			b3.setEnabled(false);
			b4.setEnabled(false);
			b5.setEnabled(false);
			b6.setEnabled(false);
			b7.setEnabled(false);
			b8.setEnabled(false);
			b9.setEnabled(false);
		}
		else{
			b1.setEnabled(true);
			b2.setEnabled(true);
			b3.setEnabled(true);
			b4.setEnabled(true);
			b5.setEnabled(true);
			b6.setEnabled(true);
			b7.setEnabled(true);
			b8.setEnabled(true);
			b9.setEnabled(true);
		}
	}
	
	
	public void buttonClickable(boolean what){
		if(what==true){
			b1.setClickable(true);
			b2.setClickable(true);
			b3.setClickable(true);
			b4.setClickable(true);
			b5.setClickable(true);
			b6.setClickable(true);
			b7.setClickable(true);
			b8.setClickable(true);
			b9.setClickable(true);
		}
		else{
			b1.setClickable(false);
			b2.setClickable(false);
			b3.setClickable(false);
			b4.setClickable(false);
			b5.setClickable(false);
			b6.setClickable(false);
			b7.setClickable(false);
			b8.setClickable(false);
			b9.setClickable(false);
		}
	}
	
	public void buttonClear(){
		b1.setText(null);
		b2.setText(null);
		b3.setText(null);
		b4.setText(null);
		b5.setText(null);
		b6.setText(null);
		b7.setText(null);
		b8.setText(null);
		b9.setText(null);
	}
	
	public void playerTurn(){
		if(!playerOneTurn){
			playerTurnView.setText("➤Player 2 turn...");
		}
		else{
			playerTurnView.setText("➤Player 1 turn...");
		}
	}
	
	public boolean winningMessage(boolean what){
		
		if(what==true){
			p1point++;
			result.setText("Player 1 Win");
			playerTurnView.setText("Player 1 Win");
			playerOnePoint.setText(""+ p1point);
		}
		if(what==false){
			p2point++;
			result.setText("Player 2 Win");
			playerTurnView.setText("Player 2 Win");
			playerTwoPoint.setText(""+p2point);
		}
		return what;
	}
	
	public void drawView(){
		if(move>0){
			setting.setEnabled(false);
		}
		if(move==9){
			drawCount++;
			drawMedia.start();
			result.setText("Match Drawn");
			playerTurnView.setText("Match Drawn");
			draw.setText(""+drawCount);
			move=0;
		}
	}
}
