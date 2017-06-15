package com.yodian2.tarena.mytravelapplication.manager;

import android.content.Context;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.yodian2.tarena.mytravelapplication.Entity.Newsbean;
import com.yodian2.tarena.mytravelapplication.constant.IURL;

/**
 * Created by tarena on 2017/6/14.
 */

public class HttpManager {
    public static RequestQueue queue = null;

    public static void loadNews(Context context, String categoryname, final NewsLoadListener newsLoadListener){

           String url = IURL.ROOT + "type=" + categoryname + "&key=" + IURL.APPKEY;
           if (queue == null) {
               queue = Volley.newRequestQueue(context);
           }
           StringRequest request = new StringRequest(url, new Response.Listener<String>() {
               @Override
               public void onResponse(String response) {
                   Gson gosn = new Gson();
                   Newsbean newsbean = gosn.fromJson(response, Newsbean.class);
                   newsLoadListener.onNewsLoadEnd(newsbean);

               }
           }, new Response.ErrorListener() {
               @Override
               public void onErrorResponse(VolleyError error) {

               }
           });
           queue.add(request);



    }
    public interface NewsLoadListener{
        public void onNewsLoadEnd(Newsbean newsbean);

    }

}
