<#macro template templateName="" params...>
	<#if templateName?? && templateName!="">
	   ${handlebars.process(templateName, params)}
    <#else>
    	INLINE
    </#if>
</#macro>	