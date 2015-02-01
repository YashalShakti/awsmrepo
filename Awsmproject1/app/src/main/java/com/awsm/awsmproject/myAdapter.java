package com.awsm.awsmproject;

/**
 * Created by Yashal Shakti
 */
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.InputStream;
import java.util.List;



public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> implements View.OnClickListener{
    private String[] stores;
    Context mContext;
    JSONArray brandStores;

    private static final String TAG_NAME="brandOutletName";
    private static final String TAG_RATING="ratingValue";
    private static final String TAG_NUMBER="phoneNumber";
    private static final String TAG_EMAIL="emailId";
    private static final String TAG_LOCLAT="locationLat";
    private static final String TAG_LOCLONG="locationLong";
    private static final String TAG_IMAGE="imageUrl";


    public MyAdapter(String myStores[], Context context,JSONArray jsonstores)
    {
        stores=myStores;
        mContext=context;
        brandStores=jsonstores;
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
            viewHolder.storeName.setText(brandStores.getJSONObject(i).getString(TAG_NAME));
        } catch (JSONException e) { e.printStackTrace(); }
        try { String url =brandStores.getJSONObject(i).getString(TAG_IMAGE); Log.i("Image url",url);
            new DownloadImageTask(viewHolder.storeImage).execute(url);
        } catch (JSONException e) { e.printStackTrace(); }
        try {
            float rating=(float)((Integer.parseInt(brandStores.getJSONObject(i).getString(TAG_RATING)))/2.0);
            viewHolder.rating.setRating(rating);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        viewHolder.call.setOnClickListener(this);

        //viewHolder.storeImage.setImageResource(mContext.getResources().getIdentifier(stores[i].toLowerCase(), "drawable", mContext.getPackageName()));
    }

    @Override
    public int getItemCount() {
        return stores.length;
    }

    @Override
    public void onClick(View v) {

    }


    //ViewHolder for performance parameters , decreases lag
    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView storeName;
        public ImageView storeImage;
        public ImageButton call;
        public ImageButton map;
        public ImageButton images;
        public RatingBar rating;

        public ViewHolder(View itemView) {
            super(itemView);
            storeImage = (ImageView) itemView.findViewById(R.id.storeImage);
            storeName= (TextView)itemView.findViewById(R.id.storeName);
            call=(ImageButton)itemView.findViewById(R.id.call);
            map=(ImageButton)itemView.findViewById(R.id.map);
            images=(ImageButton)itemView.findViewById(R.id.image);
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