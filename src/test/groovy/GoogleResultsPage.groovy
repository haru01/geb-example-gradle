import geb.*

class GoogleResultsPage extends Page {
    static at = { results }
    static content = {
        results(wait: true) { $("li.g") }
        result { i -> results[i] }
        resultLink { i -> result(i).find("a.l")[0] }
		��Ԗڂ̃����N�̃e�L�X�g{ resultLink(0).text() }
        ��Ԗڂ̃����N���N���b�N���đJ�ڂ��� { resultLink(0).click() }
    }
}