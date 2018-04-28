<#macro template templateName="" params...>
	<#if templateName?? && templateName!="">
	   ${handlebars.process(templateName, params)}
    <#else>
    	${handlebars.processInlineTemplate("BOO", params)}
    </#if>
</#macro>	