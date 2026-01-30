<!doctype html>
<html lang="en" class="no-js">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Grace"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>

    <asset:stylesheet src="application.css"/>

    <g:layoutHead/>
</head>

<body>

<nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top" role="navigation">
    <div class="container-fluid">
        <a class="navbar-brand" href="/"><asset:image src="grace.svg" alt="Grace Logo"/></a>
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarContent" aria-controls="navbarContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" aria-expanded="false" id="navbarContent">
            <ul class="navbar-nav ms-auto navbar-nav-scroll" style="--bs-scroll-height: 100px;">
                <g:each var="item" in="${applicationContext.getBean('webInterfaceManager').getDisplayableItems('topnav', [:])}">
                    <g:if test="${item}">
                        <li class="nav-item">
                            <a class="nav-link" href="${item.link?.url}"><g:message code="${item.i18nNameKey}" default="${item.name}" /></a>
                        </li>
                    </g:if>
                </g:each>
                <g:each var="section" in="${applicationContext.getBean('webInterfaceManager').getDisplayableSections('topnav', [:])}">
                    <li class="nav-item dropdown">
                        <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
                            <g:message code="${section.i18nNameKey}" default="${section.name}" /> <span class="caret"></span>
                        </a>
                        <ul class="dropdown-menu dropdown-menu-end">
                            <g:each var="item" in="${applicationContext.getBean('webInterfaceManager').getDisplayableItems(section.key, [:])}" >
                            <li><a class="dropdown-item" href="${item.link?.url}"><g:message code="${item.i18nNameKey}" default="${item.name}" /></a></li>
                            </g:each>
                        </ul>
                    </li>
                </g:each>
                
                <li class="nav-item dropdown">
                    <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Languages</a>
                    <ul class="dropdown-menu dropdown-menu-end">
                        <g:each var="lang" in="${applicationContext.getBean('languageManager').languages*.key}">
                            <g:set var="locale" value="${Locale.forLanguageTag(lang.replace('_', '-'))}"/>
                            <g:set var="paramsWithLang" value="${params + [lang:lang]}"/>
                            <li>
                                <g:link class="dropdown-item" action="${actionName}" params="${paramsWithLang}">
                                    ${locale.getDisplayName(locale)} - (${lang})
                                </g:link>
                            </li>
                        </g:each>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>

<g:layoutBody/>

<div class="footer" role="contentinfo">
    <div class="container-fluid">
        <div class="row">
            <div class="col-md-4 col-sm-12">
                <a href="https://github.com/grace-guides" target="_blank">
                    <asset:image src="guides.svg" alt="Grace Guides" class="float-left"/>
                </a>
                <strong class="centered"><a href="https://github.com/grace-guides" target="_blank">Grace Guides</a></strong>
                <p>Building your first Grace app? Looking to add security, or create a Single-Page-App? Check out the <a href="https://github.com/grace-guides" target="_blank">Grace Guides</a> for step-by-step tutorials.</p>

            </div>
            <div class="col-md-4 col-sm-12">
                <a href="http://docs.graceframework.org" target="_blank">
                    <asset:image src="documentation.svg" alt="Grace Documentation" class="float-left"/>
                </a>
                <strong class="centered"><a href="http://docs.graceframework.org" target="_blank">Documentation</a></strong>
                <p>Ready to dig in? You can find in-depth documentation for all the features of Grace in the <a href="http://docs.graceframework.org" target="_blank">User Guide</a>.</p>

            </div>
            <div class="col-md-4 col-sm-12">
                <a href="https://github.com/orgs/grace-community/discussions" target="_blank">
                    <asset:image src="discussion.svg" alt="Grace Community" class="float-left"/>
                </a>
                <strong class="centered"><a href="https://github.com/orgs/grace-community/discussions" target="_blank">Join the Community</a></strong>
                <p>Get feedback and share your experience with other Grace developers in the <a href="https://github.com/orgs/grace-community/discussions" target="_blank">Grace Community</a>.</p>
            </div>
        </div>
    </div>
</div>

<div id="spinner" class="spinner" style="display:none;">
    <div class="d-flex justify-content-center">
        <div class="spinner-border text-primary" role="status">
            <span class="sr-only">Loading...</span>
        </div>
    </div>
</div>

<asset:javascript src="application.js"/>

</body>
</html>
