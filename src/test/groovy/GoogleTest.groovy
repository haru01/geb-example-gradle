import geb.*
import geb.junit4.*
import org.junit.Test

import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4)
class GoogleTest extends GebReportingTest {
    @Test
    void "検索結果の一番目でWikipediaであること。遷移できること"() {
        to GoogleHomePage

		検索フォームに次を入力.with {
			q = "wikipedia"
		}
        at GoogleResultsPage

		assert 一番目のリンクのテキスト == "Wikipedia"		
        一番目のリンクをクリックして遷移する

        waitFor { at WikipediaPage }
    }
}