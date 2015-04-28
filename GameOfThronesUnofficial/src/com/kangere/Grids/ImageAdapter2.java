package com.kangere.Grids;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.kangere.gameunofficial.R;

public class ImageAdapter2 extends BaseAdapter{

	private Context mContext;
	private int[] imageId = {R.drawable.arya,R.drawable.bran,R.drawable.bronn,R.drawable.catelyn,R.drawable.cersei,
			R.drawable.daenerys,R.drawable.davos,R.drawable.eddard,R.drawable.gendry,R.drawable.gilly,R.drawable.jaimie,
			R.drawable.jeor,R.drawable.joffrey,R.drawable.jonsnow,R.drawable.jorah,R.drawable.khaldrogo,R.drawable.margaery,
			R.drawable.melisandre,R.drawable.petyr,R.drawable.ramsay,R.drawable.robb,R.drawable.robert,R.drawable.sam,
			R.drawable.sandor,R.drawable.sansa,R.drawable.shae,R.drawable.stannis,R.drawable.talisa,R.drawable.theon,
			R.drawable.tormund,R.drawable.tyrion,R.drawable.tywin,R.drawable.varys,R.drawable.viserys,R.drawable.ygritte};
	
	
	public ImageAdapter2(Context c) {
		mContext = c;
	}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return imageId.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return imageId[position];
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		 ImageView imageView;
	        if (convertView == null) {  // if it's not recycled, initialize some attributes
	            imageView = new ImageView(mContext);
	            //imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
	            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
	            //imageView.setPadding(8, 8, 8, 8);
	        } else {
	            imageView = (ImageView) convertView;
	        }

	        imageView.setImageResource(imageId[position]);
	        return imageView;

	}

}
