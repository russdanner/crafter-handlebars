<#macro template templateName="" params...>
	<#assign templateRoot=siteContext.context.rootFolderPath?replace("file:","") />
	   
	<#if templateName?? && templateName!="">
       ${handlebars.process(tempateRoot, templateName, params)}
    <#else>
    	<#local inlineTemplate><#nested/></#local>
    	${handlebars.processInlineTemplate(tempateRoot, inlineTemplate, params)}
    </#if>
</#macro>	