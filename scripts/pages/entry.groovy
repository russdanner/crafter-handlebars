@Grab(group='com.github.jknack', module='handlebars', version='4.0.5')

import com.github.jknack.handlebars.Handlebars
import com.github.jknack.handlebars.Template
import com.github.jknack.handlebars.Context
import com.github.jknack.handlebars.io.TemplateLoader
import com.github.jknack.handlebars.io.FileTemplateLoader
import com.github.jknack.handlebars.Context;

def loader = new FileTemplateLoader(siteContext.getStaticAssetsPath(), ".hbs");
def handlebars = new Handlebars(loader)
    
def template = handlebars.compile("test");
def context = Context.newBuilder([firstName: "russ", lastName: "danner"])
def output = template.apply(context)


templateModel.output = output