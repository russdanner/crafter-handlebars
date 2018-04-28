<#macro template templateName="" params...>
	<#if templateName?? && templateName!="">
	   ${handlebars.process(templateName, params)}
    <#else>
    	<#local inlineTemplate><#nested/></#local>
    	${handlebars.processInlineTemplate(inlineTemplate, params)}
    </#if>
</#macro>	