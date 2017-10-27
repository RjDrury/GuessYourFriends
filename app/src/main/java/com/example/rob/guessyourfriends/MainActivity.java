package com.example.rob.guessyourfriends;

import android.annotation.SuppressLint;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView playerOneIntro, playerTwoIntro, continueOne, continueTwo, yourColor,nextPlayer,start,whoseTurn,beginTurnOne,beginTurnTwo;
    TextView bartText, homerText, lisaText, megText, stewieText,peterText;
    ImageView  playerOneCard, playerTwoCard,bartImg,homerImg,lisaImg,megImg,stewieImg,peterImg,yourCard;
    boolean turnPlayerOne = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void beginGame(View view){
        view.setVisibility(View.GONE);

        playerOneIntro = (TextView) findViewById(R.id.playerOneIntro);
        continueOne = (TextView) findViewById(R.id.continueOne);

        playerOneIntro.setVisibility(View.VISIBLE);
        continueOne.setVisibility(View.VISIBLE);

        playerOneCard = (ImageView) findViewById(R.id.playerOneCard);
        playerTwoCard = (ImageView) findViewById(R.id.playerTwoCard);

        homerImg = (ImageView) findViewById(R.id.homerImg);
        bartImg = (ImageView) findViewById(R.id.bartImg);
        lisaImg = (ImageView) findViewById(R.id.lisaImg);

        megImg = (ImageView) findViewById(R.id.megImg);
        peterImg = (ImageView) findViewById(R.id.peterImg);
        stewieImg = (ImageView) findViewById(R.id.stewieImg);

        yourCard = (ImageView) findViewById(R.id.yourCard);

        bartText =(TextView)findViewById(R.id.bartText);
        homerText = (TextView) findViewById(R.id.homerText);
        lisaText = (TextView) findViewById(R.id.lisaText);

        megText =(TextView)findViewById(R.id.megText);
        stewieText = (TextView) findViewById(R.id.stewieText);
        peterText = (TextView) findViewById(R.id.peterText);


        playerOneCard.setImageResource(R.drawable.peter); // temp just set to hard coded vals
        playerTwoCard.setImageResource(R.drawable.homer);

        whoseTurn =(TextView)findViewById(R.id.whoseTurn);
        beginTurnOne = (TextView) findViewById(R.id.beginTurnOne);
        beginTurnTwo = (TextView) findViewById(R.id.beginTurnTwo);


    }

    public void displayColorOne(View view){ //continueOne pressed
        nextPlayer =(TextView) findViewById(R.id.nextPlayer);
        yourColor = (TextView) findViewById(R.id.yourColor);
        yourColor.setVisibility(View.VISIBLE);
        playerOneCard.setVisibility(View.VISIBLE);
        nextPlayer.setVisibility((View.VISIBLE));
    }
    public void introTwo(View view){ // got IT! Pressed
        view.setVisibility(View.GONE);
        continueOne.setVisibility(View.GONE);
        playerOneIntro.setVisibility(View.GONE);
        playerOneCard.setVisibility((View.GONE));
        yourColor.setVisibility(View.GONE);
        //empty screen

        playerTwoIntro = (TextView) findViewById(R.id.playerTwoIntro);
        continueTwo = (TextView) findViewById(R.id.continueTwo);

        playerTwoIntro.setVisibility(View.VISIBLE);
        continueTwo.setVisibility(View.VISIBLE);

    }
    public void displayColorTwo(View view){ // continue Two pressed
        start = (TextView) findViewById(R.id.startGuessing);


        yourColor.setVisibility(View.VISIBLE);
        playerTwoCard.setVisibility(View.VISIBLE);
        start.setVisibility(View.VISIBLE);
    }
    public boolean isPlayerOneTurn(){
        if(turnPlayerOne){
            turnPlayerOne = false;
            return true;
        }
        turnPlayerOne = true;
        return false;
    }
    public void transition(View view){ //inbetween each turn make every thing blank except for whose turn its going to be so they can hand off the phone and press when they're.
        view.setVisibility(View.GONE);
        continueOne.setVisibility(View.GONE);
        playerOneIntro.setVisibility(View.GONE);
        playerOneCard.setVisibility((View.GONE));
        yourColor.setVisibility(View.GONE);
        playerTwoIntro.setVisibility(View.GONE);
        continueTwo.setVisibility(View.GONE);
        yourColor.setVisibility(View.GONE);
        playerTwoCard.setVisibility(View.GONE);

        if (turnPlayerOne){
            whoseTurn.setText("Player one its your turn!");
            whoseTurn.setVisibility(View.VISIBLE);
            beginTurnOne.setVisibility(View.VISIBLE);
        }
        else{
            whoseTurn.setText("Player Two its your turn!");
            whoseTurn.setVisibility(View.VISIBLE);
            beginTurnTwo.setVisibility(View.VISIBLE);
        }

    }

    public void turnOne(View view){
        view.setVisibility(View.GONE);
        beginTurnOne.setVisibility(View.GONE);

        homerImg.setVisibility(View.VISIBLE);
        bartImg.setVisibility(View.VISIBLE);
        lisaImg.setVisibility(View.VISIBLE);

        megImg.setVisibility(View.VISIBLE);
        peterImg.setVisibility(View.VISIBLE);
        stewieImg.setVisibility(View.VISIBLE);

        yourCard = (ImageView) findViewById(R.id.yourCard);//special case
        yourCard.setImageDrawable(playerOneCard.getDrawable()); // copy player one card so its the same pic
        yourCard.setVisibility(View.VISIBLE);

        bartText.setVisibility(View.VISIBLE);
        homerText.setVisibility(View.VISIBLE);
        lisaText.setVisibility(View.VISIBLE);

        megText.setVisibility(View.VISIBLE);
        stewieText.setVisibility(View.VISIBLE);
        peterText .setVisibility(View.VISIBLE);



    }
}
