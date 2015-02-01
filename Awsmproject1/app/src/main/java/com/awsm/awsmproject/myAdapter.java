package com.awsm.awsmproject;

/**
 * Created by Yashal Shakti
 */
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.net.Uri;
import android.os.AsyncTask;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.InputStream;
import java.util.List;
import java.util.Locale;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> implements View.OnClickListener{
    private String[] stores;
    Context mContext;
    JSONArray brandStores;

    int LENGTH;
    private static final String TAG_NAME="brandOutletName";
    private static final String TAG_RATING="ratingValue";
    private static final String TAG_NUMBER="phoneNumber";
    private static final String TAG_EMAIL="emailId";
    private static final String TAG_LOCLAT="locationLat";
    private static final String TAG_LOCLONG="locationLong";
    private static final String TAG_IMAGE="imageUrl";
    public String storeName;
    public String callnumber;
    public Location location;
    public String onlineImages;
    String loc[]={"",""};


    public MyAdapter(String myStores[], Context context,JSONArray jsonstores)
    {
        stores=myStores;
        mContext=context;
        brandStores=jsonstores;
        LENGTH=jsonstores.length();
    }


    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card, viewGroup, false);
        ViewHolder vh = new ViewHolder((v));
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {

        try {
            storeName=brandStores.getJSONObject(i).getString(TAG_NAME);
            viewHolder.storeName.setText(storeName);
            String url =brandStores.getJSONObject(i).getString(TAG_IMAGE); Log.i("Image url",url);
            new DownloadImageTask(viewHolder.storeImage).execute(url);
            float rating=(float)((Integer.parseInt(brandStores.getJSONObject(i).getString(TAG_RATING)))/2.0);
            viewHolder.rating.setRating(rating);
           callnumber=brandStores.getJSONObject(i).getString(TAG_NUMBER);
          /*  location.setLatitude(Double.parseDouble(brandStores.getJSONObject(i).getString(TAG_LOCLAT)));
            location.setLongitude(Double.parseDouble(brandStores.getJSONObject(i).getString(TAG_LOCLONG)));*/
            loc[0]=brandStores.getJSONObject(i).getString(TAG_LOCLAT);
            loc[1]=brandStores.getJSONObject(i).getString(TAG_LOCLONG);
            onlineImages="https://www.google.com/search?site=imghp&tbm=isch&source=hp&biw=&bih=&q="+storeName.substring(0,storeName.indexOf(" "))+" store&btnG=Search+by+image";
        }
         catch (Exception e) {
            e.printStackTrace();
        }

        viewHolder.call.setOnClickListener(this);
        viewHolder.map.setOnClickListener(this);
         viewHolder.olImages.setOnClickListener(this);

        //viewHolder.storeImage.setImageResource(mContext.getResources().getIdentifier(stores[i].toLowerCase(), "drawable", mContext.getPackageName()));
    }

    @Override
    public int getItemCount() {
        return LENGTH;
    }

    @Override
    public void onClick(View v) {
        Context oContext;
        oContext= mContext;
        switch(v.getId())
        {
            case R.id.call:
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", callnumber, null));
                oContext.startActivity(intent);
                break;
            case R.id.map:
                String uri = String.format(Locale.ENGLISH, "http://maps.google.com/maps?&daddr=%s,%s (%s)", loc[0], loc[1], storeName);
                Intent mapintent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                mapintent.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
                try
                {
                    oContext.startActivity(mapintent);
                }
                catch(ActivityNotFoundException ex)
                {
                    try
                    {
                        Intent unrestrictedIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                        oContext.startActivity(unrestrictedIntent);
                    }
                    catch(ActivityNotFoundException innerEx)
                    {
                        Toast.makeText(oContext, "Please Install a MAPS Application", Toast.LENGTH_LONG).show();
                    }
                }
                break;
            case R.id.images:
                Uri uri2 = Uri.parse(onlineImages);
                Intent Imagesintent = new Intent(Intent.ACTION_VIEW, uri2);
                oContext.startActivity(Imagesintent);
                break;
        }

    }


    //ViewHolder for performance parameters , decreases lag
    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView storeName;
        public ImageView storeImage;
        public ImageButton call;
        public ImageButton map;
        public ImageButton olImages;
        public RatingBar rating;

        public ViewHolder(View itemView) {
            super(itemView);
            storeImage = (ImageView) itemView.findViewById(R.id.storeImage);
            storeName= (TextView)itemView.findViewById(R.id.storeName);
            call=(ImageButton)itemView.findViewById(R.id.call);
            map=(ImageButton)itemView.findViewById(R.id.map);
            olImages=(ImageButton)itemView.findViewById(R.id.images);
            rating=(RatingBar)itemView.findViewById(R.id.ratingBar);
        }
    }

    private class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
        ImageView bmImage;

        public DownloadImageTask(ImageView bmImage) {
            this.bmImage = bmImage;
        }

        protected Bitmap doInBackground(String... urls) {
            String urldisplay = urls[0];
            Bitmap mIcon11 = null;
            try {
                InputStream in = new java.net.URL(urldisplay).openStream();
                mIcon11 = BitmapFactory.decodeStream(in);
            } catch (Exception e) {
                Log.e("Error", e.getMessage());
                e.printStackTrace();
            }
            return mIcon11;
        }

        protected void onPostExecute(Bitmap result) {

           bmImage.setImageBitmap(result);}
    }
}