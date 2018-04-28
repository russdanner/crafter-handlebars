<#import "/templates/system/common/cstudio-support.ftl" as studio />
<#import "/templates/web/handlebars.ftl" as hbs />

<!DOCTYPE html>
<html lang="en">
	<head>
      <meta charset="utf-8">
      <title>${model.title}</title>
	</head>
	<body>
    
    	
           <@hbs.template contentModel /> 
           
           

		<@studio.toolSupport/>	
	</body>
</html>