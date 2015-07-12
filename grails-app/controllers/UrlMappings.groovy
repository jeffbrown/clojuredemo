class UrlMappings {

    static mappings = {
        "/add"(controller: 'math', action: 'add')
        "/addNumbers"(controller: 'math', action: 'addNumbers')

        "/"(action: 'add', controller: 'math')
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
