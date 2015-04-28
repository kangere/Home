package com.kangere.gameunofficial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.RelativeLayout;

import com.adsdk.sdk.Ad;
import com.adsdk.sdk.AdListener;
import com.adsdk.sdk.AdManager;
import com.adsdk.sdk.Gender;
import com.kangere.gameunofficial.R;

public class MainActivity extends Activity implements OnChildClickListener {

	private RelativeLayout layout;
	private AdView mAdView;
	private AdManager mManager;
	ExpandableListAdapter listAdapter;
	ExpandableListView expListView;
	List<String> listDataHeader;
	HashMap<String, List<String>> ListDataChild;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		layout = (RelativeLayout) findViewById(R.id.adsdkContent);
		// init();

		expListView = (ExpandableListView) findViewById(R.id.LvExp);
		expListView.setOnChildClickListener(this);

		prepareListData();

		listAdapter = new ExpandableListAdapter(this, listDataHeader,
				ListDataChild);

		expListView.setAdapter(listAdapter);
		AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

	}

	/*
	 * private void init() { mAdView = new AdView(this,
	 * "http://my.mobfox.com/request.php", "0c74779536a831411520072dc10c8f5a",
	 * true, true); mAdView.setAdspaceWidth(320); // Optional, used to set the
	 * custom size // of banner placement. Without setting // it, the SDK will
	 * use default size of // 320x50 or 300x50 depending on device // type.
	 * mAdView.setAdspaceHeight(50); mAdView.setAdspaceStrict(false); //
	 * Optional, tells the server to only // supply banner ads that are //
	 * exactly of the desired size. // Without setting it, the server // could
	 * also supply smaller Ads // when no ad of desired size is // available.
	 * mAdView.setAdListener(this); layout.addView(mAdView);
	 * 
	 * }
	 * 
	 * public void onClickShowBanner(View view) { if (mAdView != null) {
	 * removeBanner(); } mAdView = new AdView(this,
	 * "http://my.mobfox.com/request.php", "0c74779536a831411520072dc10c8f5a",
	 * true, true);
	 * 
	 * mAdView.setAdspaceWidth(320); // optional, used to set the custom size //
	 * of banner placement. Without setting // it, the SDK will use default
	 * sizes. mAdView.setAdspaceHeight(50); mAdView.setAdspaceStrict(false); //
	 * optional, tells the server to only // supply banners that are exactly //
	 * of desired size. Without setting // it, the server could also supply //
	 * smaller ads when no ad of desired // size is available.
	 * 
	 * ArrayList<String> keywords = new ArrayList<String>();
	 * keywords.add("sports"); keywords.add("football");
	 * mAdView.setKeywords(keywords); // optional, to send list of keywords //
	 * (user interests) to ad server. mAdView.setUserAge(18); // optional, sends
	 * user's age mAdView.setUserGender(Gender.MALE); // optional, sends user's
	 * gender
	 * 
	 * mAdView.setAdListener(this); layout.addView(mAdView); }
	 * 
	 * private void removeBanner() { if (mAdView != null) {
	 * layout.removeView(mAdView); mAdView = null; } }
	 * 
	 * public void onClickShowVideoInterstitial(View v) { mManager.requestAd();
	 * }
	 */

	private void prepareListData() {
		// TODO Auto-generated method stub
		listDataHeader = new ArrayList<String>();
		ListDataChild = new HashMap<String, List<String>>();

		listDataHeader.add("Houses");
		listDataHeader.add("Characters");
		listDataHeader.add("History");
		listDataHeader.add("Culture");
		listDataHeader.add("Creatures");
		listDataHeader.add("Substances");

		List<String> Houses = new ArrayList<String>();
		Houses.add("Current Great Houses");
		Houses.add("Exiled Great Houses");
		Houses.add("Extinct Great Houses");

		List<String> Characters = new ArrayList<String>();
		Characters.add("Major Characters");
		Characters.add("Minor Characters");
		Characters.add("Legendary Heroes");

		List<String> History = new ArrayList<String>();
		History.add("The First Men");
		History.add("Children of The Forest and The War");
		History.add("The Long Night");
		History.add("The Andals and The Invasion");
		History.add("Valyria and The Century of Blood");
		History.add("The Targaryen Conquest");
		History.add("The Targaryen Dynasty");
		History.add("Roberts Rebellion");

		List<String> Culture = new ArrayList<String>();
		Culture.add("Religion");
		Culture.add("People and Titles");
		Culture.add("Customs");
		Culture.add("Languages");

		List<String> Creatures = new ArrayList<String>();
		Creatures.add("White Walkers");
		Creatures.add("Dragons");
		Creatures.add("Wights");
		Creatures.add("Giants");
		Creatures.add("Manticores");

		List<String> Substances = new ArrayList<String>();
		Substances.add("Valyrian Steel");
		Substances.add("Wildfire");
		Substances.add("Dragon Glass");
		Substances.add("Milk of The Poppy");
		Substances.add("Weirwood");
		Substances.add("The Strangler");
		Substances.add("Others");

		ListDataChild.put(listDataHeader.get(0), Houses);
		ListDataChild.put(listDataHeader.get(1), Characters);
		ListDataChild.put(listDataHeader.get(2), History);
		ListDataChild.put(listDataHeader.get(3), Culture);
		ListDataChild.put(listDataHeader.get(4), Creatures);
		ListDataChild.put(listDataHeader.get(5), Substances);

	}

	@Override
	public boolean onChildClick(ExpandableListView parent, View v,
			int groupPosition, int childPosition, long id) {

		final String selected = (String) listAdapter.getChild(groupPosition,
				childPosition);

		if (selected.equals("Current Great Houses")) {
			try {
				Class<?> cl = Class
						.forName("com.kangere.gameunofficial.GreatHouses");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} else if (selected.equals("Exiled Great Houses")) {
			try {
				Class<?> cl = Class
						.forName("com.kangere.gameunofficial.ExiledHouses");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} else if (selected.equals("Extinct Great Houses")) {
			try {
				Class<?> cl = Class
						.forName("com.kangere.gameunofficial.Extinct");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} else if (selected.equals("The First Men")) {

			try {
				Class<?> cl = Class
						.forName("com.kangere.gameunofficial.FirstMen");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} else if (selected.equals("Children of The Forest and The War")) {
			try {
				Class<?> cl = Class
						.forName("com.kangere.gameunofficial.TheChildren");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} else if (selected.equals("The Long Night")) {
			try {
				Class<?> cl = Class
						.forName("com.kangere.gameunofficial.TheLongNight");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} else if (selected.equals("The Andals and The Invasion")) {
			try {
				Class<?> cl = Class
						.forName("com.kangere.gameunofficial.AndalInvasion");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} else if (selected.equals("Valyria and The Century of Blood")) {
			try {
				Class<?> cl = Class
						.forName("com.kangere.gameunofficial.Valyria");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} else if (selected.equals("The Targaryen Conquest")) {
			try {
				Class<?> cl = Class
						.forName("com.kangere.gameunofficial.TargaryenConquest");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} else if (selected.equals("The Targaryen Dynasty")) {
			try {
				Class<?> cl = Class
						.forName("com.kangere.gameunofficial.TargaryenDynasty");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} else if (selected.equals("Roberts Rebellion")) {
			try {
				Class<?> cl = Class
						.forName("com.kangere.gameunofficial.RobertsRebellion");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} else if (selected.equals("Religion")) {
			try {
				Class<?> cl = Class
						.forName("com.kangere.gameunofficial.Religion");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} else if (selected.equals("People and Titles")) {
			try {
				Class<?> cl = Class
						.forName("com.kangere.gameunofficial.People");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} else if (selected.equals("Customs")) {
			try {
				Class<?> cl = Class
						.forName("com.kangere.gameunofficial.Customs");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} else if (selected.equals("Languages")) {
			try {
				Class<?> cl = Class
						.forName("com.kangere.gameunofficial.Languages");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} else if (selected.equals("White Walkers")) {
			try {
				Class<?> cl = Class
						.forName("com.kangere.gameunofficial.WhiteWalkers");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} else if (selected.equals("Giants")) {
			try {
				Class<?> cl = Class
						.forName("com.kangere.gameunofficial.Giants");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} else if (selected.equals("Dragons")) {
			try {
				Class<?> cl = Class
						.forName("com.kangere.gameunofficial.Dragons");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} else if (selected.equals("Wights")) {
			try {
				Class<?> cl = Class
						.forName("com.kangere.gameunofficial.Wights");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} else if (selected.equals("Manticores")) {
			try {
				Class<?> cl = Class
						.forName("com.kangere.gameunofficial.Manticore");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} else if (selected.equals("Valyrian Steel")) {
			try {
				Class<?> cl = Class
						.forName("com.kangere.gameunofficial.ValyrianSteel");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} else if (selected.equals("Dragon Glass")) {
			try {
				Class<?> cl = Class
						.forName("com.kangere.gameunofficial.Dragonglass");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} else if (selected.equals("Wildfire")) {
			try {
				Class<?> cl = Class
						.forName("com.kangere.gameunofficial.Wildfire");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} else if (selected.equals("Milk of The Poppy")) {
			try {
				Class<?> cl = Class
						.forName("com.kangere.gameunofficial.MilkOfthePoppy");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} else if (selected.equals("Weirwood")) {
			try {
				Class<?> cl = Class
						.forName("com.kangere.gameunofficial.Weirwood");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} else if (selected.equals("The Strangler")) {
			try {
				Class<?> cl = Class
						.forName("com.kangere.gameunofficial.Strangler");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} else if (selected.equals("Others")) {
			try {
				Class<?> cl = Class
						.forName("com.kangere.gameunofficial.Others");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} else if (selected.equals("Major Characters")) {
			try {
				Class<?> cl = Class
						.forName("com.kangere.gameunofficial.MajorCharacters");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} else if (selected.equals("Minor Characters")) {
			try {
				Class<?> cl = Class
						.forName("com.kangere.gameunofficial.MinorCharacters");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		} else if (selected.equals("Legendary Heroes")) {
			try {
				Class<?> cl = Class
						.forName("com.kangere.majorcharacters.LegendaryHeroes");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		}

		return true;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu, menu);
		return super.onCreateOptionsMenu(menu);

	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.item1:

			try {
				Class<?> cl = Class.forName("com.kangere.gameunofficial.Prefs");
				Intent i = new Intent(this, cl);
				startActivity(i);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			break;
		case R.id.item2:
			finish();
			break;
		}
		return false;
	}

	/*
	 * @Override public void adClicked() { // TODO Auto-generated method stub
	 * Toast.makeText(MainActivity.this, "Ad clicked!", Toast.LENGTH_LONG)
	 * .show(); }
	 * 
	 * @Override public void adClosed(Ad arg0, boolean arg1) { // TODO
	 * Auto-generated method stub
	 * 
	 * Toast.makeText(MainActivity.this, "Ad closed!", Toast.LENGTH_LONG)
	 * .show(); }
	 * 
	 * @Override public void adLoadSucceeded(Ad arg0) { // TODO Auto-generated
	 * method stub if (mManager != null && mManager.isAdLoaded())
	 * mManager.showAd();
	 * 
	 * }
	 * 
	 * @Override public void adShown(Ad arg0, boolean arg1) { // TODO
	 * Auto-generated method stub Toast.makeText(MainActivity.this, "Ad shown!",
	 * Toast.LENGTH_LONG) .show(); }
	 * 
	 * @Override public void noAdFound() { // TODO Auto-generated method stub
	 * 
	 * }
	 */

}
