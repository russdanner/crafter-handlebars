<#macro template templateName params...>
	<#if templateName??>
	   ${handlebars.process(templateName, params)}
    <#else>
    	INLINE
    </#if>
</#macro>	