package demo.pages

import geb.Page

class AddNumbersPage extends Page {
    static at = { heading.text() == "Add Numbers" }
    static content = {
        heading { $('h1') }
        addNumbersForm { $('form') }
        addNumbersButton(to: ResultPage) { addNumbersForm.addNumbers() }
    }
}
