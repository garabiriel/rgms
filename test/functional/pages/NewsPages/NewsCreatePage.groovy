package pages.NewsPages

import geb.Page
import rgms.member.ResearchGroup

import java.text.DateFormat
import java.text.SimpleDateFormat


class NewsCreatePage extends Page {

    static url = "news/create"

    static at = {
        title ==~ /Criar Noticias/
    }

    static content = {
    }

     def fillNewsDetails(String description, Date date, ResearchGroup researchGroupInstance ){
         $("form").description = description
         //$("form").date = (new SimpleDateFormat("yyyy")).format(date);
         //$("form").date.valueOf(date)
         $("datePicker", name: "date", precision: "minute").value(date)
         //$("datePicker", name: "date").value()== date
         //$("form").datePicker = date
         //$("select", name: "researchGroup.id").value(researchGroupInstance)
         //$("form").researchGroup  = researchGroupInstance.name
         //$("form").find("select", id:"researchGroup", name: "researchGroup.id", optionKey:"id").value() == researchGroupInstance.id
         //$("select", id:"researchGroup", name: "researchGroup.id", optionKey:"id").value() == researchGroupInstance.id
         //$("form").select.id.value(researchGroupInstance.id)
         //$("form").researchGroup.valueOf(researchGroupInstance.name)
         $("form").researchGroup = researchGroupInstance.name
         //$("select", id: "researchGroup", name: "researchGroup.id", optionKey:"id").value(researchGroupInstance.id)
     }

    def selectCreateNews(){
        $("input", name: "create").click()
    }

}
