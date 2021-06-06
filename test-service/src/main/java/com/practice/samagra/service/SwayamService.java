package com.practice.samagra.service;

import static com.practice.samagra.util.ServiceConstants.SWAYAM_COURSE_FETCH_URL;
import static com.practice.samagra.util.ServiceConstants.SWAYAM_COURSE_FETCH_URL_PARAMS;
import static com.practice.samagra.util.ServiceConstants.XPATH_STR;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.practice.samagra.businessobject.ISwayamBusinessObject;
import com.practice.samagra.entity.CourseDetail;

@Component
public class SwayamService implements ISwayamService {
	
	@Autowired
	public ISwayamBusinessObject swayamBusinessObject;

	@SuppressWarnings("resource")
	@Override
	public void getAndPersistCourseData() {
		
		WebClient client = new WebClient();
		client.getOptions().setCssEnabled(false);
		client.getOptions().setJavaScriptEnabled(false);
		try {
		  String searchUrl = SWAYAM_COURSE_FETCH_URL + URLEncoder.encode(SWAYAM_COURSE_FETCH_URL_PARAMS, "UTF-8");
		  HtmlPage page = client.getPage(searchUrl);
		  List<HtmlElement> elements = page.getByXPath(XPATH_STR);
		  
		  String courseData = elements.get(0).asNormalizedText().replaceFirst("\\)]}' ", "");
		  JSONObject json = new JSONObject(courseData); 
		  JSONArray arr = json.getJSONObject("data").getJSONObject("courseList").getJSONArray("edges");
		  Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").create();
		  
		  List<CourseDetail> cd = getCourseDetailFromJson(arr, gson);
		  swayamBusinessObject.persistCourseData(cd);
		  
		} catch(Exception e){
		  e.printStackTrace();
		}
		
	}

	private List<CourseDetail> getCourseDetailFromJson(JSONArray arr, Gson gson) {
		List<CourseDetail> cd = new ArrayList<>();
		for (int i = 0; i < arr.length(); i++) {
		      JSONObject obj = arr.getJSONObject(i).getJSONObject("node");
		      CourseDetail detail = gson.fromJson(obj.toString(), CourseDetail.class);
		      cd.add(detail);
		  }
		return cd;
	}

	@Override
	public List<CourseDetail> fetchCourseData() {
		return swayamBusinessObject.fetchCourseData();
	}

}
