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
           
           <@hbs.template aVariable="a-b-c-1-2-3">
              <div style='border:10px solid green'>
                <b>It's easy as:</b> {{aVariable}}<br/>
              </div>           			
           </@hbs.template>      

		<@studio.toolSupport/>	
	</body>
</html>