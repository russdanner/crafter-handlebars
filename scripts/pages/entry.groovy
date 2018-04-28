import handlebars.HandlebarsProcessor

def handlebars = new HandlebarsProcessor()

def output = handlebars.process(contentModel)

templateModel.output = output