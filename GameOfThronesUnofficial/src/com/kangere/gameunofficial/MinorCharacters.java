package com.kangere.gameunofficial;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;

import com.adsdk.sdk.Ad;
import com.adsdk.sdk.AdListener;
import com.adsdk.sdk.AdManager;
import com.adsdk.sdk.Gender;
import com.adsdk.sdk.banner.AdView;
import com.kangere.Grids.ImageAdapter1;
import com.kangere.gameunofficial.R;
import com.millennialmedia.android.MMAdView;
import com.millennialmedia.android.MMRequest;
import com.millennialmedia.android.MMSDK;

public class MinorCharacters extends Activity implements AdListener {
	private GridView gridview;
	private RelativeLayout layout;
	private AdView mAdView;
	private AdManager mManager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.minor_characters);
		layout = (RelativeLayout) findViewById(R.id.adsdkContent2);
		initAds();

		gridview = (GridView) findViewById(R.id.grid);
		gridview.setAdapter(new ImageAdapter1(this));
		gridview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				switch (position) {
				case 0:
					try {
						Class<?> cl = Class
								.forName("com.kangere.minorcharacters.SalladhorSaan");
						Intent i = new Intent(MinorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 1:
					try {
						Class<?> cl = Class
								.forName("com.kangere.minorcharacters.Craster");
						Intent i = new Intent(MinorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 2:
					try {
						Class<?> cl = Class
								.forName("com.kangere.minorcharacters.Oberyn");
						Intent i = new Intent(MinorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 3:
					try {
						Class<?> cl = Class
								.forName("com.kangere.minorcharacters.Olenna");
						Intent i = new Intent(MinorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 4:
					try {
						Class<?> cl = Class
								.forName("com.kangere.minorcharacters.Renly");
						Intent i = new Intent(MinorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 5:
					try {
						Class<?> cl = Class
								.forName("com.kangere.minorcharacters.Jaqen");
						Intent i = new Intent(MinorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 6:
					try {
						Class<?> cl = Class
								.forName("com.kangere.minorcharacters.Roose");
						Intent i = new Intent(MinorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 7:
					try {
						Class<?> cl = Class
								.forName("com.kangere.minorcharacters.Tommen");
						Intent i = new Intent(MinorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 8:
					try {
						Class<?> cl = Class
								.forName("com.kangere.minorcharacters.Daario");
						Intent i = new Intent(MinorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 9:
					try {
						Class<?> cl = Class
								.forName("com.kangere.minorcharacters.Lysa");
						Intent i = new Intent(MinorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 10:
					try {
						Class<?> cl = Class
								.forName("com.kangere.minorcharacters.Rickon");
						Intent i = new Intent(MinorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 11:
					try {
						Class<?> cl = Class
								.forName("com.kangere.minorcharacters.Hodor");
						Intent i = new Intent(MinorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 12:
					try {
						Class<?> cl = Class
								.forName("com.kangere.minorcharacters.Osha");
						Intent i = new Intent(MinorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 13:
					try {
						Class<?> cl = Class
								.forName("com.kangere.minorcharacters.Benjen");
						Intent i = new Intent(MinorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 14:
					try {
						Class<?> cl = Class
								.forName("com.kangere.minorcharacters.Mance");
						Intent i = new Intent(MinorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 15:
					try {
						Class<?> cl = Class
								.forName("com.kangere.minorcharacters.Ilyn");
						Intent i = new Intent(MinorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 16:
					try {
						Class<?> cl = Class
								.forName("com.kangere.minorcharacters.Robin");
						Intent i = new Intent(MinorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 17:
					try {
						Class<?> cl = Class
								.forName("com.kangere.minorcharacters.Podrick");
						Intent i = new Intent(MinorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 18:
					try {
						Class<?> cl = Class
								.forName("com.kangere.minorcharacters.Barristan");
						Intent i = new Intent(MinorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 19:
					try {
						Class<?> cl = Class
								.forName("com.kangere.minorcharacters.Shireen");
						Intent i = new Intent(MinorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 20:
					try {
						Class<?> cl = Class
								.forName("com.kangere.minorcharacters.Pycelle");
						Intent i = new Intent(MinorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 21:
					try {
						Class<?> cl = Class
								.forName("com.kangere.minorcharacters.GreyWorm");
						Intent i = new Intent(MinorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 22:
					try {
						Class<?> cl = Class
								.forName("com.kangere.minorcharacters.Alliser");
						Intent i = new Intent(MinorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 23:
					try {
						Class<?> cl = Class
								.forName("com.kangere.minorcharacters.Missandei");
						Intent i = new Intent(MinorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 24:
					try {
						Class<?> cl = Class
								.forName("com.kangere.minorcharacters.Janos");
						Intent i = new Intent(MinorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 25:
					try {
						Class<?> cl = Class
								.forName("com.kangere.minorcharacters.XaroXhoan");
						Intent i = new Intent(MinorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 26:
					try {
						Class<?> cl = Class
								.forName("com.kangere.minorcharacters.Ellaria");
						Intent i = new Intent(MinorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				}
			}
		});

		// GridView gridView = (GridView) findViewById(R.id.grid);
		// gridView.setAdapter(adapter);

		/*
		 * grid = (GridView) findViewById(R.id.grid); ImageAdapter1 adapter =
		 * new ImageAdapter1(MinorCharacters.this, imageId);
		 * grid.setAdapter(adapter); grid.setOnItemClickListener(this);
		 */
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

	@Override
	public void adClicked() {

		Toast.makeText(MinorCharacters.this, "Ad clicked!", Toast.LENGTH_LONG)
				.show();

	}

	@Override
	public void adClosed(Ad arg0, boolean arg1) {
		Toast.makeText(MinorCharacters.this, "Ad closed!", Toast.LENGTH_LONG)
		.show();

	}

	@Override
	public void adLoadSucceeded(Ad arg0) {
		
		if (mManager != null && mManager.isAdLoaded())
			mManager.showAd();

	}

	@Override
	public void adShown(Ad arg0, boolean arg1) {
		Toast.makeText(MinorCharacters.this, "Ad shown!", Toast.LENGTH_LONG)
		.show();

	}
      
	@Override
	public void noAdFound() {
		
	}

	
}
