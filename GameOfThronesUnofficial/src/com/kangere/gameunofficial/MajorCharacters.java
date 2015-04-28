package com.kangere.gameunofficial;

import java.util.ArrayList;

import com.adsdk.sdk.Ad;
import com.adsdk.sdk.AdListener;
import com.adsdk.sdk.AdManager;
import com.adsdk.sdk.Gender;
import com.adsdk.sdk.banner.AdView;
import com.kangere.Grids.ImageAdapter2;
import com.kangere.gameunofficial.R;
import com.millennialmedia.android.MMAdView;
import com.millennialmedia.android.MMRequest;
import com.millennialmedia.android.MMSDK;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MajorCharacters extends Activity implements AdListener {
	private GridView gridview;
	private RelativeLayout layout;
	private AdView mAdView;
	private AdManager mManager;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.major_chracters);
       layout = (RelativeLayout) findViewById(R.id.adsdkContent1);
		initAds();

		gridview = (GridView) findViewById(R.id.grid1);
		gridview.setAdapter(new ImageAdapter2(this));

		gridview.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				switch (position) {
				case 0:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Arya");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					break;
				case 1:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Bran");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 2:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Bronn");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				case 3:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Catelyn");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				case 4:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Cersei");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 5:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Daenerys");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 6:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Davos");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				case 7:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Eddard");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				case 8:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Gendry");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				case 9:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Gilly");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				case 10:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Jaime");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				case 11:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Jeor");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				case 12:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Joffrey");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				case 13:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Jonsnow");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				case 14:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Jorah");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				case 15:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Khaldrogo");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				case 16:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Margaery");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				case 17:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Melisandre");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				case 18:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Petyr");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				case 19:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Ramsay");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				case 20:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Robb");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				case 21:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Robert");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				case 22:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Sam");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				case 23:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Sandor");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				case 24:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Sansa");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				case 25:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Shae");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				case 26:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Stannis");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				case 27:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Talisa");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				case 28:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Theon");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				case 29:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Tormund");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				case 30:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Tyrion");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				case 31:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Tywin");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				case 32:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Varys");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				case 33:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Viserys");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				case 34:
					try {
						Class<?> cl = Class
								.forName("com.kangere.majorcharacters.Ygritte");
						Intent i = new Intent(MajorCharacters.this, cl);
						startActivity(i);
					} catch (ClassNotFoundException e) {
						e.printStackTrace();
					}
					break;
				}

			}
		});

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
		// TODO Auto-generated method stub
		Toast.makeText(MajorCharacters.this, "Ad clicked!", Toast.LENGTH_LONG)
				.show();
	}

	@Override
	public void adClosed(Ad arg0, boolean arg1) {
		// TODO Auto-generated method stub

		Toast.makeText(MajorCharacters.this, "Ad closed!", Toast.LENGTH_LONG)
				.show();

	}

	@Override
	public void adLoadSucceeded(Ad arg0) {
		// TODO Auto-generated method stub
		
		if (mManager != null && mManager.isAdLoaded())
			mManager.showAd();

	}

	@Override
	public void adShown(Ad arg0, boolean arg1) {

		Toast.makeText(MajorCharacters.this, "Ad shown!", Toast.LENGTH_LONG)
				.show();

	}

	@Override
	public void noAdFound() {
		
	}

	

}
