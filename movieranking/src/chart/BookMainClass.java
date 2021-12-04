package chart;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class BookMainClass {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("신간베스트");
//		Scanner sc = new Scanner(System.in);
//		System.out.print("검색어: ");
//		String str = sc.next();
//		String text = URLEncoder.encode(str, "UTF-8");
		String URL = "https://www.aladin.co.kr/shop/common/wbest.aspx?BranchType=1&BestType=TodayHot";
		Document doc = Jsoup.connect(URL).get();
		Elements elem = doc.select("div.ss_book_list");
				
				for(Element e: elem.select("a")) {
					if (e.className().equals("bo3")) {
						System.out.println(e.text());
						//continue;
					}
					
				}

	}
}	
