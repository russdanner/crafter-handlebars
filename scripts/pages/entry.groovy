import handlebars.HandlebarsProcessor

def handlebars = applicationContext.get("handlebars")

def output = handlebars.process(contentModel)

templateModel.output = output