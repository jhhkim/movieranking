package movieranking;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class MainClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("영화 랭킹 출력");
//		Scanner sc = new Scanner(System.in);
//		System.out.print("검색어: ");
//		String str = sc.next();
//		String text = URLEncoder.encode(str, "UTF-8");
		String URL = "https://movie.naver.com/movie/sdb/rank/rmovie.naver?sel=cur&date=20211203";
		Document doc = Jsoup.connect(URL).get();
		Elements elem = doc.select("table.list_ranking");
				
				for(Element e: elem.select("td")) {
					if (e.className().equals("title")) {
						System.out.println(e.text());
						//continue;
					}
					
				}

	}
}	
