import geb.*

class GoogleHomePage extends Page {
    static url = "http://google.com/ncr"
    static at = { title == "Google" }
	static content = {
		検索フォームに次を入力 { $("form#gbqf") }
	}
}