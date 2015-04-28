package com.kangere.Grids;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.kangere.gameunofficial.R;

public class ImageAdapter1 extends BaseAdapter {

	private int[] imageId = {R.drawable.salladhor_saan,R.drawable.craster,R.drawable.oberyn,R.drawable.olenna,
	         R.drawable.renly_baratheon,R.drawable.jaqen,R.drawable.roose_bolton,R.drawable.tommen,
	         R.drawable.daario,R.drawable.lysa,R.drawable.rickon_stark,R.drawable.hodor,R.drawable.osha,
	         R.drawable.benjen,R.drawable.mance,R.drawable.ilyn,R.drawable.robin_arryn,
	         R.drawable.podrick,R.drawable.barristan,R.drawable.shireen_baratheon,R.drawable.maester_pycelle,
	         R.drawable.greyworm,R.drawable.alliser_thorne,R.drawable.missandei,R.drawable.janos_slynt,
	         R.drawable.xaro_xhoan_daxos,R.drawable.ellaria_sand};
	
	private Context mContext;
	// private final int[] imageId;
	
	public ImageAdapter1(Context c /*, int[] imageId*/ ) {
		mContext = c;
		//this.imageId = imageId;
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

		/*ImageView imageView = new ImageView(mContext);
		imageView.setImageResource(imageId[position]);
		imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);*/
		 /*View grid;
	      LayoutInflater inflater = (LayoutInflater) mContext
	        .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	          if (convertView == null) {
	            grid = new View(mContext);
	        grid = inflater.inflate(R.layout.minor_grid_single, null);
	           
	            ImageView imageView = (ImageView)grid.findViewById(R.id.ivMinorGrid);
	            imageView.setImageResource(imageId[position]);
	          } else {
	            grid = (View) convertView;
	          }
		 
		return grid;*/
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


