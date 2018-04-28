<#import "/templates/system/common/cstudio-support.ftl" as studio />
<#import "/templates/web/handlebars.ftl" as hbs />

<#macro template params...>
	${handlebars.process(params)}
</#macro>	

<!DOCTYPE html>
<html lang="en">
	<head>
      <meta charset="utf-8">
      <title>${model.title}</title>
	</head>
	<body>
    
    	
           <@template firstName="russ" lastName="danner" title=${contentModel.title} /> 
           
           

		<@studio.toolSupport/>	
	</body>
</html>