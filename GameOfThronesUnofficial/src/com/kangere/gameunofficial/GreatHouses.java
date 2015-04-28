package com.kangere.gameunofficial;

import java.util.ArrayList;

import com.adsdk.sdk.Ad;
import com.adsdk.sdk.AdListener;
import com.adsdk.sdk.AdManager;
import com.adsdk.sdk.Gender;
import com.adsdk.sdk.banner.AdView;
import com.kangere.gameunofficial.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class GreatHouses extends Activity implements OnClickListener, AdListener {

	private RelativeLayout layout;
	private AdView mAdView;
	private AdManager mManager;
	Button Arryn, Lannister, Greyjoy, Baelish, Bolton, Martell, Tyrell,
			Baratheon;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.greathouses);
		layout = (RelativeLayout) findViewById(R.id.adsdkContent5);
		initAds();
		init();
		Arryn.setOnClickListener(this);
		Lannister.setOnClickListener(this);
		Greyjoy.setOnClickListener(this);
		Baelish.setOnClickListener(this);
		Bolton.setOnClickListener(this);
		Martell.setOnClickListener(this);
		Tyrell.setOnClickListener(this);
		Baratheon.setOnClickListener(this); 

	}

	private void initAds() {
		mAdView = new AdView(this, "http://my.mobfox.com/request.php",
				"0c74779536a831411520072dc10c8f5a", true, true);
		mAdView.setAdspaceWidth(320); // Optional, used to set the custom size
										// of banner placement. Without setting
										// it, the SDK will use default size of
										// 320x50 or 300x50 depending on device
										// type.
		mAdView.setAdspaceHeight(50);
		mAdView.setAdspaceStrict(false); // Optional, tells the server to only
											// supply banner ads that are
											// exactly of the desired size.
											// Without setting it, the server
											// could also supply smaller Ads
											// when no ad of desired size is
											// available.
		mAdView.setAdListener(this);
		layout.addView(mAdView);

	}
	
	public void onClickShowBanner(View view) {
		if (mAdView != null) {
			removeBanner();
		}
		mAdView = new AdView(this, "http://my.mobfox.com/request.php",
				"0c74779536a831411520072dc10c8f5a", true, true);

		mAdView.setAdspaceWidth(320); // optional, used to set the custom size
										// of banner placement. Without setting
										// it, the SDK will use default sizes.
		mAdView.setAdspaceHeight(50);
		mAdView.setAdspaceStrict(false); // optional, tells the server to only
											// supply banners that are exactly
											// of desired size. Without setting
											// it, the server could also supply
											// smaller ads when no ad of desired
											// size is available.

		ArrayList<String> keywords = new ArrayList<String>();
		keywords.add("sports");
		keywords.add("football");
		mAdView.setKeywords(keywords); // optional, to send list of keywords
										// (user interests) to ad server.
		mAdView.setUserAge(18); // optional, sends user's age
		mAdView.setUserGender(Gender.MALE); // optional, sends user's gender

		mAdView.setAdListener(this);
		layout.addView(mAdView);
	}

	private void removeBanner() {
		if (mAdView != null) {
			layout.removeView(mAdView);
			mAdView = null;
		}
	}

	public void onClickShowVideoInterstitial(View v) {
		mManager.requestAd();
	}

	private void init() {
		// TODO Auto-generated method stub
		Arryn = (Button) findViewById(R.id.bArryn);
		Lannister = (Button) findViewById(R.id.bLannister);
		Greyjoy = (Button) findViewById(R.id.bGreyjoy);
		Baelish = (Button) findViewById(R.id.bBaelish);
		Bolton = (Button) findViewById(R.id.bBolton);
		Martell = (Button) findViewById(R.id.bMartell);
		Tyrell = (Button) findViewById(R.id.bTyrell);
		Baratheon = (Button) findViewById(R.id.bBaratheon);

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub

		switch (v.getId()) {
		case R.id.bArryn:
			try {
				Class cl = Class
						.forName("com.kangere.gameunofficial.Arryn");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;
		case R.id.bBaelish:
			try {
				Class cl = Class
						.forName("com.kangere.gameunofficial.Baelish");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case R.id.bBaratheon:
			try {
				Class cl = Class
						.forName("com.kangere.gameunofficial.Baratheon");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;

		case R.id.bBolton:
			try {
				Class cl = Class
						.forName("com.kangere.gameunofficial.Bolton");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case R.id.bGreyjoy:
			try {
				Class cl = Class
						.forName("com.kangere.gameunofficial.Greyjoy");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case R.id.bLannister:
			try {
				Class cl = Class
						.forName("com.kangere.gameunofficial.Lannister");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case R.id.bTyrell:
			try {
				Class cl = Class
						.forName("com.kangere.gameunofficial.Tyrell");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case R.id.bMartell:
			try {
				Class cl = Class
						.forName("com.kangere.gameunofficial.Martell");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
	}

	@Override
	public void adClicked() {
		Toast.makeText(GreatHouses.this, "Ad clicked!", Toast.LENGTH_LONG)
		.show();
		
	}

	@Override
	public void adClosed(Ad arg0, boolean arg1) {
		Toast.makeText(GreatHouses.this, "Ad closed!", Toast.LENGTH_LONG)
		.show();
		
	}

	@Override
	public void adLoadSucceeded(Ad arg0) {
		
		if (mManager != null && mManager.isAdLoaded())
			mManager.showAd();
		
	}

	@Override
	public void adShown(Ad arg0, boolean arg1) {
		Toast.makeText(GreatHouses.this, "Ad shown!", Toast.LENGTH_LONG)
		.show();
		
	}

	@Override
	public void noAdFound() {
		
		
	}
}
