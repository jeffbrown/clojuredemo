package demo.pages

import geb.Page

class ResultPage extends Page {

    static at = { heading.text() == 'Result' }
    static content = {
        heading { $('h1') }
        result { $('div', class: 'message') }
    }
}
