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

public class TargaryenDynasty extends Activity implements OnClickListener, AdListener {

	private RelativeLayout layout;
	private AdView mAdView;
	private AdManager mManager;
	Button aenys, jaehaerys, viserys, aegonii, aegoniii, daeroni, baelor,
			aegoniv, daeronii, aerysi, maekar, aegonv, aerysii;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.targaryen_dynastyi);
		layout = (RelativeLayout) findViewById(R.id.adsdkContent7);
		initAds();
		init();

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
		aenys = (Button) findViewById(R.id.bAenys);
		jaehaerys = (Button) findViewById(R.id.bJaehaerys);
		viserys = (Button) findViewById(R.id.bViserys);
		aegonii = (Button) findViewById(R.id.bAegonII);
		aegoniii = (Button) findViewById(R.id.bAegonIII);
		daeroni = (Button) findViewById(R.id.bDaeronI);
		baelor = (Button) findViewById(R.id.bBaelor);
		aegoniv = (Button) findViewById(R.id.bAegonIV);
		daeronii = (Button) findViewById(R.id.bDaeronII);
		aerysi = (Button) findViewById(R.id.bAerysI);
		maekar = (Button) findViewById(R.id.bMaekar);
		aegonv = (Button) findViewById(R.id.bAegonV);
		aerysii = (Button) findViewById(R.id.bAerysII);

		aenys.setOnClickListener(this);
		jaehaerys.setOnClickListener(this);
		viserys.setOnClickListener(this);
		aegonii.setOnClickListener(this);
		aegoniii.setOnClickListener(this);
		daeroni.setOnClickListener(this);
		baelor.setOnClickListener(this);
		aegoniv.setOnClickListener(this);
		daeronii.setOnClickListener(this);
		aerysi.setOnClickListener(this);
		maekar.setOnClickListener(this);
		aegonv.setOnClickListener(this);
		aerysii.setOnClickListener(this);

	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.bAenys:
			try {
				Class<?> cl = Class.forName("com.kangere.history.aenys");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;
		case R.id.bJaehaerys:
			try {
				Class<?> cl = Class.forName("com.kangere.history.jaehaerys");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}
			break;
		case R.id.bViserys:

			try {
				Class<?> cl = Class.forName("com.kangere.history.viserys");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}
			break;
		case R.id.bAegonII:
			try {
				Class<?> cl = Class.forName("com.kangere.history.AegonII");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}
			break;
		case R.id.bAegonIII:
			try {
				Class<?> cl = Class.forName("com.kangere.history.AegonIII");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}
			break;
		case R.id.bAegonIV:
			try {
				Class<?> cl = Class.forName("com.kangere.history.AegonIV");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}
			break;
		case R.id.bAegonV:
			try {
				Class<?> cl = Class.forName("com.kangere.history.AerysI");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}
			break;
		case R.id.bAerysI:
			try {
				Class<?> cl = Class.forName("com.kangere.history.AerysI");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}
			break;
		case R.id.bAerysII:
			try {
				Class<?> cl = Class.forName("com.kangere.history.AerysII");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}
			break;
		case R.id.bDaeronI:
			try {
				Class<?> cl = Class.forName("com.kangere.history.DaeronI");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}
			break;
		case R.id.bDaeronII:
			try {
				Class<?> cl = Class.forName("com.kangere.history.DaeronII");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}
			break;
		case R.id.bBaelor:
			try {
				Class<?> cl = Class.forName("com.kangere.history.Baelor");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}
			break;
		case R.id.bMaekar:
			try {
				Class<?> cl = Class.forName("com.kangere.history.Maekar");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {

				e.printStackTrace();
			}
			break;

		}

	}

	@Override
	public void adClicked() {
		Toast.makeText(TargaryenDynasty.this, "Ad clicked!", Toast.LENGTH_LONG)
		.show();
		
	}

	@Override
	public void adClosed(Ad arg0, boolean arg1) {
		Toast.makeText(TargaryenDynasty.this, "Ad closed!", Toast.LENGTH_LONG)
		.show();
		
	}

	@Override
	public void adLoadSucceeded(Ad arg0) {
		
		if (mManager != null && mManager.isAdLoaded())
			mManager.showAd();
		
	}

	@Override
	public void adShown(Ad arg0, boolean arg1) {
		Toast.makeText(TargaryenDynasty.this, "Ad shown!", Toast.LENGTH_LONG)
		.show();
		
	}

	@Override
	public void noAdFound() {
		
		
	}

}
