package chart;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MelonMainClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("멜론차트100");
//		Scanner sc = new Scanner(System.in);
//		System.out.print("검색어: ");
//		String str = sc.next();
//		String text = URLEncoder.encode(str, "UTF-8");
		String URL = "https://www.melon.com/chart/";
		Document doc = Jsoup.connect(URL).get();
		Elements elem = doc.select("tr#lst50.lst50");
				
				for(Element e: elem.select("div")) {
					if (e.className().equals("ellipsis rank01")) {
						System.out.println(e.text());
						//continue;
					}
					
				}

	}
}	
