<#macro template templateName="" params...>
	<#assign templateRoot=siteContext.context.rootFolderPath?replace("file:","") />
	   
	<#if templateName?? && templateName!="">
       ${handlebars.process(templateRoot, templateName, params)}
    <#else>
    	<#local inlineTemplate><#nested/></#local>
    	${handlebars.processInlineTemplate(templateRoot, inlineTemplate, params)}
    </#if>
</#macro>	