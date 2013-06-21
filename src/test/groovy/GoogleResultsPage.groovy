import geb.*

class GoogleResultsPage extends Page {
    static at = { results }
    static content = {
        results(wait: true) { $("li.g") }
        result { i -> results[i] }
        resultLink { i -> result(i).find("a.l")[0] }
		一番目のリンクのテキスト{ resultLink(0).text() }
        一番目のリンクをクリックして遷移する { resultLink(0).click() }
    }
}