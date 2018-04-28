@Grab(group='com.github.jknack', module='handlebars', version='4.0.5')

import com.github.jknack.handlebars.Handlebars
import com.github.jknack.handlebars.Template
import com.github.jknack.handlebars.io.FileTemplateLoader

public class HandlebarsProcessor {
	
    def process() {
   		def loader = new FileTemplateLoader("/Users/rdanner/crafter-installs/ent/craftercms/crafter-authoring/data/repos/sites/handlebars/sandbox/templates", ".hbs");
		
        def handlebars = new Handlebars(loader)
        def template = handlebars.compile("test");
        def hbContentModel = [:]
        contentModel.dom.selectNodes("//*").each{ node -> hbContentModel.put(node.name, node.text) }
		def handlebarsModel = [firstName: "russ", lastName: "danner", contentModel: hbContentModel]
		def output = template.apply(handlebarsModel)
    }
}