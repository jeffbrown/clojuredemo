<html>
<head>
    <meta name="layout" content="main"/>
</head>
<body>
<div class="nav" role="navigation">
    <ul>
        <li><a class="home" href="${createLink(action: 'add', controller: 'math')}"><g:message code="default.home.label"/></a></li>
    </ul>
</div>
<div id="add-numbers" class="content" role="main">
    <h1>Result</h1>
    <div class="message" role="status">
    The sum of ${x} and ${y} is ${sum}.
    </div>
</div>
</body>
</html>