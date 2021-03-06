package com.awsm.database;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;

import android.os.AsyncTask;
import android.util.Log;

import com.awsm.awsmproject.MainActivity;
import com.awsm.awsmproject.resultsActivity;

public class Query {
    String query;
    String name;
    InputStream is=null;
    String result=null;
    String line=null;
    String url="http://130.211.181.40/";

    public Query() {
        // TODO Auto-generated constructor stub
    }

    public interface AsyncResponse {
        void processFinish(JSONArray output);
    }

    public PostTask getAllBrandOutlets()
    {
        String suggestionURL = url + "getAllBrandOutlets.php";
        PostTask postTask = new PostTask(suggestionURL, query);
        postTask.execute();

        return postTask;
    }

    public PostTask getSuggestionsForSearchString(String query)
    {
        String suggestionURL = url + "getSuggestionsForSearchTerm.php";
        PostTask postTask = new PostTask(suggestionURL, query);
        postTask.execute();
        return postTask;
    }

    public PostTask listOutletsForSearchString(String query)
    {
        String listOutletsURL = url + "listOutletsForSearchString.php";
        PostTask postTask = new PostTask(listOutletsURL, query);
        postTask.execute();
        return postTask;
    }



    public class PostTask extends AsyncTask<Void, Void, JSONArray> {
        String query;
        String url;
        JSONArray finalArray;
        public AsyncResponse delegate=null;

        public PostTask(String url, String query) {
            super();
            this.query=query;
            this.url=url;
        }

        @Override
        protected JSONArray doInBackground(Void... params) {

            try {
                ArrayList<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
                nameValuePairs.add(new BasicNameValuePair("query",query));

                try
                {
                    HttpClient httpclient = new DefaultHttpClient();
                    HttpPost httppost = new HttpPost(url);

                    HttpEntity entity = new UrlEncodedFormEntity(nameValuePairs);
                    httppost.addHeader(entity.getContentType());
                    httppost.setEntity(entity);

                    HttpResponse response = httpclient.execute(httppost);
                    entity = response.getEntity();
                    is = entity.getContent();

                    Log.i("pass 1", "connection success ");

                }
                catch(Exception e)
                {
                    Log.e("Fail 1", e.toString());
                }

                try
                {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(is,"iso-8859-1"),8);
                    StringBuilder sb = new StringBuilder();
                    while ((line = reader.readLine()) != null)
                    {
                        sb.append(line + "\n");
                    }
                    is.close();
                    result = sb.toString();
                    Log.i("pass 2", "connection success ");
                }
                catch(Exception e)
                {
                    Log.e("Fail 2", e.toString());
                }

                try
                {
                    JSONArray json_array = new JSONArray(result);
                    Log.i("JSON Array",	json_array.toString());
                   finalArray=json_array;
                    // Sample data
                    name =(json_array.getJSONObject(0).getString("brandOutletName"));
                    Log.i("YASHALname of value",	name);

                    return json_array;
                }
                catch(Exception e)
                {
                    Log.e("Fail 3", e.toString());
                }
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPostExecute(JSONArray result) {
            // TODO Auto-generated method stub
            super.onPostExecute(result);
            delegate.processFinish(result);
            resultsActivity.STORES=finalArray;
        }
        public  JSONArray getter()
        {
                return finalArray;
        }
    }


}