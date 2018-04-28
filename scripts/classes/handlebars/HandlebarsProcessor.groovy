@Grab(group='com.github.jknack', module='handlebars', version='4.0.5')

import com.github.jknack.handlebars.Handlebars
import com.github.jknack.handlebars.Template
import com.github.jknack.handlebars.io.FileTemplateLoader

public class HandlebarsProcessor {

	def storeService
	def setStoreService(service) { this.storeService = storeService }
    def getStoreService() { return this.storeService } 
    
	def getTemplatesRootPath() {
    	return "/Users/rdanner/crafter-installs/ent/craftercms/crafter-authoring/data/repos/sites/handlebars/sandbox/templates"
    }
    
    /**
     * render a template with the given name 
     * @param templateName contains the name or relative path and name of the template.  .hbs is assumed
     * @param values a kev value map of template variables
     * returns the resulting markup as a string
     */
    def process(templateRoot, templateName, values) {
   		def loader = new FileTemplateLoader(templateRoot, ".hbs");
		
        def handlebars = new Handlebars(loader)
        def template = handlebars.compile(templateName)
		def handlebarsModel = values
		def output = template.apply(handlebarsModel)
        
        return output
    }
    
    /**
     * render inline template 
     * @param templateText contains the inline template
     * @param values a kev value map of template variables
     * returns the resulting markup as a string
     */
    def processInlineTemplate(templateRoot, templateText, values) {
        
        def loader = new FileTemplateLoader(templateRoot, getTemplatesRootPath(), ".hbs");
        def handlebars = new Handlebars(loader)
        def template = handlebars.compileInline(templateText)
		def handlebarsModel = values
		def output = template.apply(handlebarsModel)
        
        return output
    }
}