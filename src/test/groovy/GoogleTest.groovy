import geb.*
import geb.junit4.*
import org.junit.Test

import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4)
class GoogleTest extends GebReportingTest {
    @Test
    void "�������ʂ̈�Ԗڂ�Wikipedia�ł��邱�ƁB�J�ڂł��邱��"() {
        to GoogleHomePage

		�����t�H�[���Ɏ������.with {
			q = "wikipedia"
		}
        at GoogleResultsPage

		assert ��Ԗڂ̃����N�̃e�L�X�g == "Wikipedia"		
        ��Ԗڂ̃����N���N���b�N���đJ�ڂ���

        waitFor { at WikipediaPage }
    }
}