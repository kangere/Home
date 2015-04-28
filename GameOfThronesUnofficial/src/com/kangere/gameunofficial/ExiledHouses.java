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

public class ExiledHouses extends Activity implements OnClickListener,
		AdListener {

	private RelativeLayout layout;
	private AdView mAdView;
	private AdManager mManager;
	Button Stark, Targaryen, Tully;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.exiledhouse);
		layout = (RelativeLayout) findViewById(R.id.adsdkContent3);
		initAds();
		init();

	}

	private void initAds(){
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
		Stark = (Button) findViewById(R.id.bStark);
		Targaryen = (Button) findViewById(R.id.bTargaryen);
		Tully = (Button) findViewById(R.id.bTully);

		Stark.setOnClickListener(this);
		Targaryen.setOnClickListener(this);
		Tully.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.bStark:
			try {
				Class<?> cl = Class.forName("com.kangere.houses.Stark");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;
		case R.id.bTargaryen:
			try {
				Class<?> cl = Class.forName("com.kangere.houses.Targaryen");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;
		case R.id.bTully:
			try {
				Class<?> cl = Class.forName("com.kangere.houses.Tully");
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
		Toast.makeText(ExiledHouses.this, "Ad clicked!", Toast.LENGTH_LONG)
				.show();
	}

	@Override
	public void adClosed(Ad arg0, boolean arg1) {
		Toast.makeText(ExiledHouses.this, "Ad closed!", Toast.LENGTH_LONG)
				.show();

	}

	@Override
	public void adLoadSucceeded(Ad arg0) {
		
		if (mManager != null && mManager.isAdLoaded())
			mManager.showAd();

	}

	@Override
	public void adShown(Ad arg0, boolean arg1) {
		Toast.makeText(ExiledHouses.this, "Ad shown!", Toast.LENGTH_LONG)
				.show();

	}

	@Override
	public void noAdFound() {
		Toast.makeText(ExiledHouses.this, "No ad found!", Toast.LENGTH_LONG)
				.show();

	}

	

}
