package pages.NewsPages

import geb.Page


class NewsShowPage extends Page{

    static url = "news/show/1"

    static at = {
        title ==~ /Ver Noticias/
    }

    static content = {
    }

    def select(String e, v) {
        if (v == 'edit') {
            $("form").find(e, class: v).click()
        } else if (v == 'delete') {
            assert withConfirm(true) { $("form").find(e, class: v).click() }
        }
    }
}
