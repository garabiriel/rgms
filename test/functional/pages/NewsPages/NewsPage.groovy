package pages.NewsPages

import geb.Page


class NewsPage extends Page {
    static url = "news/list"

    static at = {
        title ==~ /Noticias Listagem/
    }

    static content = {
    }

    def selectNewsNews(){
        $('a.create').click()
    }


}
