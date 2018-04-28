<#import "/templates/system/common/cstudio-support.ftl" as studio />
<#import "/templates/web/handlebars.ftl" as hbs />


<!DOCTYPE html>
<html lang="en">
	<head>
      <meta charset="utf-8">
      <title>${model.title}</title>
	</head>
    
	<body>

           <@hbs.template templateName="test" firstName="russ" lastName="danner" title=contentModel.title?string /> 
           
           

		<@studio.toolSupport/>	
	</body>
</html>