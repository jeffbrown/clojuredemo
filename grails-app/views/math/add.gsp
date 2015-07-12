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
    <h1>Add Numbers</h1>
    <g:form action="addNumbers" controller="math">
        <fieldset class="form">
            <div class="fieldcontain required">
                <label for="x">X <span class="required-indicator">*</span></label>
                <g:textField name="x"/>
            </div>
            <div class="fieldcontain required">
                <label for="y">Y <span class="required-indicator">*</span></label>
                <g:textField name="y"/>
            </div>
        </fieldset>
        <fieldset class="buttons">
            <g:submitButton name="addNumbers" class="save" value="Add Numbers" />
        </fieldset>
    </g:form>
</div>

</body>
</html>