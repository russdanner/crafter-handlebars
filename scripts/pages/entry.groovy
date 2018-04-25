@Grab(group='com.github.jknack', module='handlebars', version='4.0.5')

import com.github.jknack.handlebars.Handlebars
import com.github.jknack.handlebars.Template
import com.github.jknack.handlebars.Context
import com.github.jknack.handlebars.io.TemplateLoader
import com.github.jknack.handlebars.io.FileTemplateLoader
import com.github.jknack.handlebars.Context

def loader = new FileTemplateLoader("/Users/rdanner/crafter-installs/ent/craftercms/crafter-authoring/data/repos/sites/handlebars/sandbox/templates", ".hbs");
def handlebars = new Handlebars(loader)
    
def template = handlebars.compile("test");
def handlebarsContext = Context.newBuilder([firstName: "russ", lastName: "danner"])
def output = template.apply([firstName: "russ", lastName: "danner"])


templateModel.output = output